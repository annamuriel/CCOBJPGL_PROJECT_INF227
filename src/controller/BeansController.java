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

public class BeansController implements Initializable {

    @FXML
    Label name9, name10, name11, price9, price10, price11;

    @FXML
    ImageView img9, img10, img11;

    @FXML
    Button button9, button10, button11, cartbutton, homebutton;

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

        // ============== arabica ==================//

        name9.setText(LoginController.arabica.getProductName());
        price9.setText(Double.toString(LoginController.arabica.getProductPrice()));
        Image arabicab = new Image(LoginController.arabica.getProductImage());
        img9.setImage(arabicab);

        // ============== robusta ==================//

        name10.setText(LoginController.robusta.getProductName());
        price10.setText(Double.toString(LoginController.robusta.getProductPrice()));
        Image robustab = new Image(LoginController.robusta.getProductImage());
        img10.setImage(robustab);

        // ============== liberica ==================//

        name11.setText(LoginController.liberica.getProductName());
        price11.setText(Double.toString(LoginController.liberica.getProductPrice()));
        Image libericab = new Image(LoginController.liberica.getProductImage());
        img11.setImage(libericab);

    }

    

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(button9)) {
            LoginController.arabica.setProductStatus(true);
            LoginController.arabica.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane9);
        }

        else if (sourceButton == button10) {
            LoginController.robusta.setProductStatus(true);
            LoginController.robusta.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane10);
        }

        else if (sourceButton == button11) {
            LoginController.liberica.setProductStatus(true);
            LoginController.liberica.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane11);
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
