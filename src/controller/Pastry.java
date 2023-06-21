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



public class Pastry implements Initializable {

    @FXML
    Label namep18, namep19, namep20, namep21, namep22, pricep18, pricep19, pricep20, pricep21, pricep22;

    @FXML
    ImageView imgp18, imgp19, imgp20, imgp21, imgp22;

    @FXML
    Button Buyp18, Buyp19, Buyp20, Buyp21, Buyp22, aboutus, menubutton, cartbutton;

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

        // ============== cheesy ensaymada ==================//

        namep18.setText(LoginController.cheesyensaymada.getProductName());
        pricep18.setText(Double.toString(LoginController.cheesyensaymada.getProductPrice()));
        Image cheesyensaymadaa = new Image(LoginController.cheesyensaymada.getProductImage());
        imgp18.setImage(cheesyensaymadaa);

        // ============== glazed donut ==================//

        namep19.setText(LoginController.glazeddonut.getProductName());
        pricep19.setText(Double.toString(LoginController.glazeddonut.getProductPrice()));
        Image glazeddonutt = new Image(LoginController.glazeddonut.getProductImage());
        imgp19.setImage(glazeddonutt);;

        // ============== pichi croissant ==================//

        namep20.setText(LoginController.pichicroissant.getProductName());
        pricep20.setText(Double.toString(LoginController.pichicroissant.getProductPrice()));
        Image pichicroissantt = new Image(LoginController.pichicroissant.getProductImage());
        imgp20.setImage(pichicroissantt);

        // ============== Sausage Bacon ==================//

        namep21.setText(LoginController.sausagebacon.getProductName());
        pricep21.setText(Double.toString(LoginController.sausagebacon.getProductPrice()));
        Image sausagebaconn = new Image(LoginController.sausagebacon.getProductImage());
        imgp21.setImage(sausagebaconn);

             // ============== Tia Waffle ==================//
      
        namep22.setText(LoginController.tiawaffle.getProductName());
        pricep22.setText(Double.toString(LoginController.tiawaffle.getProductPrice()));
        Image tiawafflee = new Image(LoginController.tiawaffle.getProductImage());
        imgp22.setImage(tiawafflee);

    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        if (sourceButton.equals(Buyp18)) {
            LoginController.cheesyensaymada.setProductStatus(true);
            LoginController.cheesyensaymada.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane1);
        }

        else if (sourceButton == Buyp19) {
            LoginController.glazeddonut.setProductStatus(true);
            LoginController.glazeddonut.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane2);
        }

        else if (sourceButton == Buyp20) {
            LoginController.pichicroissant.setProductStatus(true);
            LoginController.pichicroissant.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane3);
        }

        else if (sourceButton == Buyp21) {
            LoginController.sausagebacon.setProductStatus(true);
            LoginController.sausagebacon.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane3);
        }

        else if (sourceButton == Buyp22) {
            LoginController.tiawaffle.setProductStatus(true);
            LoginController.tiawaffle.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane3);
        }

        LoginController.cart.showItems();
            
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

}


