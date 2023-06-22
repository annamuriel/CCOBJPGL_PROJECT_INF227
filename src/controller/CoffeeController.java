package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import alert.AlertMaker;

public class CoffeeController implements Initializable {

    @FXML
    Label name1, name2, name3 ,name4, price1, price2, price3, price4;

    @FXML
    ImageView img1, img2, img3, img4;

    @FXML
    Button button1, button2, button3, button4, cartbutton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    static Parent homeRoot = null;

    FXMLLoader loader;
    
    HomeController homeController = null;

    @FXML
    static CheckoutController checkoutController = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== espresso ==================//
        name1.setText(LoginController.espresso.getProductName());
        price1.setText(Double.toString(LoginController.espresso.getProductPrice()));
        Image espressocoffee = new Image(LoginController.espresso.getProductImage());
        img1.setImage(espressocoffee);

        // ============== affogato ==================//

        name2.setText(LoginController.affogato.getProductName());
        price2.setText(Double.toString(LoginController.affogato.getProductPrice()));

        Image affogatocoffee = new Image(LoginController.affogato.getProductImage());
        img2.setImage(affogatocoffee);

        // ============== matcha ==================//

        name3.setText(LoginController.matcha.getProductName());
        price3.setText(Double.toString(LoginController.matcha.getProductPrice()));
        Image matchacoffee = new Image(LoginController.matcha.getProductImage());
        img3.setImage(matchacoffee);

         // ============== cuppocino ==================//

         name4.setText(LoginController.cuppocino.getProductName());
         price4.setText(Double.toString(LoginController.cuppocino.getProductPrice()));
         Image cuppocinocoffee = new Image(LoginController.cuppocino.getProductImage());
         img4.setImage(cuppocinocoffee);

        

    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(button1)) {
            LoginController.espresso.setProductStatus(true);
            LoginController.espresso.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane1);
        }

        else if (sourceButton == button2) {
            LoginController.affogato.setProductStatus(true);
            LoginController.affogato.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane2);
        }

        else if (sourceButton == button3) {
            LoginController.matcha.setProductStatus(true);
            LoginController.matcha.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane3);
        }

        else if (sourceButton == button4) {
            LoginController.cuppocino.setProductStatus(true);
            LoginController.cuppocino.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane4);
        }

        LoginController.cart.showItems();
    }

    // Goes to Checkout.fxml
    public void gotocart(ActionEvent event) throws IOException {

        // Load items to cart before switching to checkout page
        LoginController.checkoutController.showItems(LoginController.cart.getItemList());

        // Set initial total amount in checkout page
        LoginController.checkoutController.getInitialAmount();

        Scene scene = new Scene(LoginController.homeRoot);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Goes to Checkout.fxml
    public void gotohome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
