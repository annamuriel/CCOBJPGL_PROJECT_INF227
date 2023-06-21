package controller;

import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HomeController implements Initializable {

    @FXML
    Button menubutton, menubtn, cartbutton, aboutusbtn;

    @FXML
    ImageView homeimg;

    @FXML
    Label name1, name2, name3, name4;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    static Parent homeRoot = null;


    FXMLLoader loader;

    @FXML
    static MenuController MenuController;

    @FXML
    static AboutUsController AboutUsController;

    @FXML
    static CheckoutController CheckoutController;
    
    @FXML
    static ReceiptController  receiptController;
    
    @FXML
    static HomeController HomeController;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void aboutus(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/AboutUs.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
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

   
    
}
