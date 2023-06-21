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


public class Coffee implements Initializable {

    @FXML
    Label namec1, namec2, namec3, namec4, namec5, namec6, namec7, namec8,namec9, namec10, namec11, namec12, pricec1, pricec2, pricec3, pricec4, pricec5, pricec6, pricec7, pricec8, pricec9, pricec10, pricec11, pricec12;

    @FXML
    ImageView imgc1, imgc2, imgc3, imgc4,imgc5, imgc6, imgc7, imgc8,imgc9,imgc10,imgc11,imgc12;

    @FXML
    Button Buy1, Buy2, Buy3, Buy4, Buy5, Buy6, Buy7, Buy8, Buy9, Buy10, Buy11, Buy12, cartbutton, aboutusbtn ;


    FXMLLoader loader;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    static Parent homeRoot = null;

    @FXML
    static MenuController menuController;

    @FXML
    static CheckoutController checkoutController;

    @FXML
    static AboutUsController AboutUsController;

    @FXML
    static ReceiptController receiptController;
 
    @FXML
    static HomeController HomeController;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== vienna ==================//

        namec1.setText(LoginController.longblack.getProductName());
        pricec1.setText(Double.toString(LoginController.longblack.getProductPrice()));
        Image longblackcoffee = new Image(LoginController.longblack.getProductImage());
        imgc1.setImage(longblackcoffee);


        // ============== Espresso ==================//

        namec2.setText(LoginController.espresso.getProductName());
        pricec2.setText(Double.toString(LoginController.espresso.getProductPrice()));
        Image espressocoffee = new Image(LoginController.espresso.getProductImage());
        imgc2.setImage(espressocoffee);

        // ============== Macchiato ==================//

        namec3.setText(LoginController.macchiato.getProductName());
        pricec3.setText(Double.toString(LoginController.macchiato.getProductPrice()));
        Image macchiatocoffee = new Image(LoginController.macchiato.getProductImage());
        imgc3.setImage(macchiatocoffee);

        // ============== Cuppocino ==================//

        namec4.setText(LoginController.cuppocino.getProductName());
        pricec4.setText(Double.toString(LoginController.cuppocino.getProductPrice()));
        Image cuppocinocoffee = new Image(LoginController.cuppocino.getProductImage());
        imgc4.setImage(cuppocinocoffee);

        // ============== Vienna ==================//

        namec5.setText(LoginController.vienna.getProductName());
        pricec5.setText(Double.toString(LoginController.vienna.getProductPrice()));
        Image viennacoffee = new Image(LoginController.vienna.getProductImage());
        imgc5.setImage(viennacoffee);

        // ============== Iced Coffee ==================//

        namec6.setText(LoginController.icedcoffee.getProductName());
        pricec6.setText(Double.toString(LoginController.icedcoffee.getProductPrice()));
        Image icedcoffeee  = new Image(LoginController.icedcoffee.getProductImage());
        imgc6.setImage(icedcoffeee);

       // ============== Cortado ==================//

        namec7.setText(LoginController.cortado.getProductName());
        pricec7.setText(Double.toString(LoginController.cortado.getProductPrice()));
        Image  cortadocoffee = new Image(LoginController.cortado.getProductImage());
        imgc7.setImage(cortadocoffee);

       // ============== Breve ==================//

        namec8.setText(LoginController.breve.getProductName());
        pricec8.setText(Double.toString(LoginController.breve.getProductPrice()));
        Image brevecoffee = new Image(LoginController.breve.getProductImage());
        imgc8.setImage(brevecoffee);

      // ============== Mocha ==================//

        namec9.setText(LoginController.mocha.getProductName());
        pricec9.setText(Double.toString(LoginController.mocha.getProductPrice()));
        Image mochacoffee = new Image(LoginController.mocha.getProductImage());
        imgc9.setImage(mochacoffee);

      // ============== Affogato ==================//

        namec10.setText(LoginController.affogato.getProductName());
        pricec10.setText(Double.toString(LoginController.affogato.getProductPrice()));
        Image affogatocoffee = new Image(LoginController.affogato.getProductImage());
        imgc10.setImage(affogatocoffee);


      // ==============Flat White ==================//

        namec11.setText(LoginController.flatwhite.getProductName());
        pricec11.setText(Double.toString(LoginController.flatwhite.getProductPrice()));
        Image flatwhitecoffee = new Image(LoginController.flatwhite.getProductImage());
        imgc11.setImage(flatwhitecoffee);

      // ============== Matchalatte ==================//

        namec12.setText(LoginController.matchalatte.getProductName());
        pricec12.setText(Double.toString(LoginController.matchalatte.getProductPrice()));
        Image matchalattecoffee  = new Image(LoginController.matchalatte.getProductImage());
        imgc12.setImage(matchalattecoffee);

    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(Buy1)) {
            LoginController.longblack.setProductStatus(true);
            LoginController.longblack.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane1);
        }

        else if (sourceButton == Buy2) {
            LoginController.espresso.setProductStatus(true);
            LoginController.espresso.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane2);
        }

        else if (sourceButton == Buy3) {
            LoginController.macchiato.setProductStatus(true);
            LoginController.macchiato.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane3);
        }

        else if (sourceButton == Buy4) {
            LoginController.cuppocino.setProductStatus(true);
            LoginController.cuppocino.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane4);
        }

        else if (sourceButton == Buy5) {
            LoginController.vienna.setProductStatus(true);
            LoginController.vienna.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane5);
        }

        else if (sourceButton == Buy6) {
            LoginController.icedcoffee.setProductStatus(true);
            LoginController.icedcoffee.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane6);
        }

        else if (sourceButton == Buy7) {
            LoginController.cortado.setProductStatus(true);
            LoginController.cortado.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane7);
        }

        else if (sourceButton == Buy8) {
            LoginController.breve.setProductStatus(true);
            LoginController.breve.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane8);
        }

        else if (sourceButton == Buy9) {
            LoginController.mocha.setProductStatus(true);
            LoginController.mocha.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane9);
        }
        else if (sourceButton == Buy10) {
            LoginController.affogato.setProductStatus(true);
            LoginController.affogato.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane10);
        }
        else if (sourceButton == Buy11) {
            LoginController.flatwhite.setProductStatus(true);
            LoginController.flatwhite.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane11);
        }
        else if (sourceButton == Buy12) {
            LoginController.matchalatte.setProductStatus(true);
            LoginController.matchalatte.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane12);
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


    public void gottomenu(ActionEvent event) throws IOException {
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Menu.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void aboutus(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/AboutUs.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

}
