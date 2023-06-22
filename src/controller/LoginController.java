package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Cart;
import model.*;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginController implements Initializable {

    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    TextField mytextfieldpassword;

    @FXML
    CheckBox mycheckbox;

    @FXML
    Button mybutton;

    @FXML
    Label mywarninglabel;

    @FXML
    static ReceiptController receiptController = null;

    @FXML
    static HomeController homeController = null;

    @FXML
    static CheckoutController checkoutController = null;

    @FXML
    static Parent homeRoot = null;

    FXMLLoader loader;

    static affogato affogato = new affogato();
    static espresso espresso = new espresso();
    static cuppocino cuppocino = new cuppocino();
    static matcha matcha = new matcha();
    static croissant croissant = new croissant();
    static cookies cookies = new cookies();
    static pandesal pandesal = new pandesal();
    static cinnamon cinnamon = new cinnamon();
    static arabica arabica = new arabica();
    static robusta robusta = new robusta();
    static liberica liberica = new liberica();
    static Cart cart = new Cart();

    @FXML
    void changeVisibility(ActionEvent event){


        if(mycheckbox.isSelected()){
            mytextfieldpassword.setText(mypasswordfield.getText());
            mytextfieldpassword.setVisible(true);
            mypasswordfield.setVisible(false);
            return;
        }
        mypasswordfield.setText(mytextfieldpassword.getText());
        mypasswordfield.setVisible(true);
        mytextfieldpassword.setVisible(false);
}

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== espresso ==================//
        espresso.setProductName("ESPRESSO");
        espresso.setProductPrice(5.00);
        espresso.setProductImage("images/c1.jpg");
        // ============== affogato ==================//

        affogato.setProductName("AFFOGATO");
        affogato.setProductPrice(10.00);
        affogato.setProductImage("images/c3.jpg");

        // ============== matcha ==================//
        matcha.setProductName("MATCHA");
        matcha.setProductPrice(15.00);
        matcha.setProductImage("images/c2.jpg");

        // ============== cuppocino ==================/
        cuppocino.setProductName("CUPPOCINO");
        cuppocino.setProductPrice(5.00);
        cuppocino.setProductImage("images/c4.jpg");

        // ============== croissant ==================//
        croissant.setProductName("CROISSANT");
        croissant.setProductPrice(5.00);
        croissant.setProductImage("images/p1.jpg");

        // ============== cookies ==================//

        cookies.setProductName("COOKIES");
        cookies.setProductPrice(10.00);
        cookies.setProductImage("images/p2.jpg");

        // ============== pandesal ==================//
        pandesal.setProductName("PANDESAL");
        pandesal.setProductPrice(15.00);
        pandesal.setProductImage("images/p3.jpg");

        // ============== cinnamon ==================/
        cinnamon.setProductName("CINNAMON");
        cinnamon.setProductPrice(5.00);
        cinnamon.setProductImage("images/p4.jpg");

         // ============== arabica ==================//

         arabica.setProductName("ARABICA");
         arabica.setProductPrice(10.00);
         arabica.setProductImage("images/b1.jpg");
 
         // ============== robusta ==================//
         robusta.setProductName("ROBUSTA");
         robusta.setProductPrice(15.00);
         robusta.setProductImage("images/b2.jpg");
 
         // ============== liberica ==================/
         liberica.setProductName("LIBERICA");
         liberica.setProductPrice(5.00);
         liberica.setProductImage("images/b3.jpg");




        // TODO Auto-generated method stub

        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            homeRoot = loader.load();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());
    }

    public void login(ActionEvent event) throws IOException {

        String username = mytextfield.getText();
        String password = mypasswordfield.getText();

        if (username.equals("a") && password.equals("a")) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else {
            mywarninglabel.setVisible(true);
        }
    }

}
