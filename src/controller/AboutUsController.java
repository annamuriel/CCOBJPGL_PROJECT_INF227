package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.stage.Stage;

public class AboutUsController  implements Initializable  {



    @FXML
    Button home;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;


    FXMLLoader loader;

    @FXML
    static HomeController HomeController;

    @FXML
    static Parent homeRoot = null;

    @FXML
    static CheckoutController checkoutController;

    @FXML
    static AboutUsController AboutUsController;

    @FXML
    static ReceiptController receiptController;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    // Goes to home.fxml

    public void gotohome(ActionEvent event) throws IOException {

        
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }
}