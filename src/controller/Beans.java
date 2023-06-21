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



public class Beans implements Initializable {

    @FXML
    Label nameb13, nameb14, nameb15, nameb16, nameb17, priceb13, priceb14, priceb15, priceb16, priceb17;

    @FXML
    ImageView imgb13, imgb14, imgb15, imgb16, imgb17;

    @FXML
    Button Buyb13, Buyb14, Buyb15, Buyb16, Buyb17, aboutus, menubutton, cartbutton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    static Parent homeRoot = null;;

    FXMLLoader loader;

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

        // ============== barako eh ==================//

        nameb13.setText(LoginController.barakoeh.getProductName());
        priceb13.setText(Double.toString(LoginController.barakoeh.getProductPrice()));
        Image barakoehe = new Image(LoginController.barakoeh.getProductImage());
        imgb13.setImage(barakoehe);

        // ============== bro beans ==================//
        
        nameb14.setText(LoginController.brobeans.getProductName());
        priceb14.setText(Double.toString(LoginController.brobeans.getProductPrice()));
        Image brobeanie = new Image(LoginController.brobeans.getProductImage());
        imgb14.setImage(brobeanie);

        // ============== coffeellera ==================//
     
        nameb15.setText(LoginController.coffeellera.getProductName());
        priceb15.setText(Double.toString(LoginController.coffeellera.getProductPrice()));
        Image coffeelleraa = new Image(LoginController.coffeellera.getProductImage());
        imgb15.setImage(coffeelleraa);

        // ============== jordan beans ==================//
    
        nameb16.setText(LoginController.jordanbeans.getProductName());
        priceb16.setText(Double.toString(LoginController.jordanbeans.getProductPrice()));
        Image jordanbeanie = new Image(LoginController.jordanbeans.getProductImage());
        imgb16.setImage(jordanbeanie);

        // ============== mr beans ==================//

        nameb17.setText(LoginController.mrbeans.getProductName());
        priceb17.setText(Double.toString(LoginController.mrbeans.getProductPrice()));
        Image mrbeanie = new Image(LoginController.mrbeans.getProductImage());
        imgb17.setImage(mrbeanie);

    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

           // If addtocart button is pressed, set product status to true
           if (sourceButton.equals(Buyb13)) {
            LoginController.barakoeh.setProductStatus(true);
            LoginController.barakoeh.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane13);
        }

        else if (sourceButton == Buyb14) {
            LoginController.brobeans.setProductStatus(true);
            LoginController.brobeans.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane14);
        }

        else if (sourceButton == Buyb15) {
            LoginController.coffeellera.setProductStatus(true);
            LoginController.coffeellera.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane15);
        }

        else if (sourceButton == Buyb16) {
            LoginController.jordanbeans.setProductStatus(true);
            LoginController.jordanbeans.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane16);
        }

        else if (sourceButton == Buyb17) {
            LoginController.mrbeans.setProductStatus(true);
            LoginController.mrbeans.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane17);
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
