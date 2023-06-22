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

public class PastryController implements Initializable {

    @FXML
    Label name5, name6, name7, name8, price5, price6, price7, price8;

    @FXML
    ImageView img5, img6, img7, img8;

    @FXML
    Button button5, button6, button7, button8, cartbutton, homebutton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    HomeController homeController = null;

    @FXML
    static CheckoutController checkoutController = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== croissant ==================//

        name5.setText(LoginController.croissant.getProductName());
        price5.setText(Double.toString(LoginController.croissant.getProductPrice()));
        Image criossantp = new Image(LoginController.croissant.getProductImage());
        img5.setImage(criossantp);

        // ============== cookies ==================//

        name6.setText(LoginController.cookies.getProductName());
        price6.setText(Double.toString(LoginController.cookies.getProductPrice()));
        Image cookiesp = new Image(LoginController.cookies.getProductImage());
        img6.setImage(cookiesp);

        // ============== pandesal ==================//

        name7.setText(LoginController.pandesal.getProductName());
        price7.setText(Double.toString(LoginController.pandesal.getProductPrice()));
        Image pandesalp = new Image(LoginController.pandesal.getProductImage());
        img7.setImage(pandesalp);

        // ============== cinnamon ==================//

        name8.setText(LoginController.cinnamon.getProductName());
        price8.setText(Double.toString(LoginController.cinnamon.getProductPrice()));
        Image cinnamonp = new Image(LoginController.cinnamon.getProductImage());
        img8.setImage(cinnamonp);
    }

    

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(button5)) {
            LoginController.croissant.setProductStatus(true);
            LoginController.croissant.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane5);
        }

        else if (sourceButton == button6) {
            LoginController.cookies.setProductStatus(true);
            LoginController.cookies.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane6);
        }

        else if (sourceButton == button7) {
            LoginController.pandesal.setProductStatus(true);
            LoginController.pandesal.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane7);
        }

        else if (sourceButton == button8) {
            LoginController.cinnamon.setProductStatus(true);
            LoginController.cinnamon.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane8);
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

    public void gotohome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
