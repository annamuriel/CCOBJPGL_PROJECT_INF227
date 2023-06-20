package controller;

import model.Accessories.Planner;
import model.Accessories.Straw;
import model.Accessories.Tumbler;

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

public class Accessories implements Initializable {

    @FXML
    Label namea1, namea2, namea3, pricea1, pricea2, pricea3;

    @FXML
    ImageView imga1, imga2, imga3;
    @FXML
    Button Buy1, Buy2, Buy3, aboutus, menubutton, cartbutton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root;

    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController;

    static Planner planner = new Planner();
    static Straw straw = new Straw();
    static Tumbler tumbler = new Tumbler();

     @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== planner ==================//
        planner.setProductName("Planner");
        namea1.setText(planner.getProductName());

        planner.setProductPrice(30.00);
        pricea1.setText(Double.toString(planner.getProductPrice()));

        planner.setProductImage("images/planner.png");
        Image plannerBeans = new Image(planner.getProductImage());
        imga1.setImage(plannerBeans);

        // ============== straw ==================//
        straw.setProductName("Straw");
        namea2.setText(straw.getProductName());

        straw.setProductPrice(30.00);
        pricea2.setText(Double.toString(straw.getProductPrice()));

        straw.setProductImage("images/straw.png");
        Image strawBeans = new Image(straw.getProductImage());
        imga2.setImage(strawBeans);

        // ============== tumbler ==================//
        tumbler.setProductName("Tumbler");
        namea3.setText(tumbler.getProductName());

        tumbler.setProductPrice(5.00);
        pricea3.setText(Double.toString(tumbler.getProductPrice()));

        tumbler.setProductImage("images/tumbler.png");
        Image tumblerBeans = new Image(tumbler.getProductImage());
        imga3.setImage(tumblerBeans);


        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            root = loader.load();
        } catch (Exception e) {
            // TODO: handle exception
        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());
    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(Buy1)) {
             planner.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane1);
        }

        else if (sourceButton == (Buy2)) {
            straw.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane2);
        }

        else if (sourceButton == (Buy3)) {
            tumbler.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane3);
        }

        }

        // Goes to Checkout.fxml
        public void gotocart(ActionEvent event) throws IOException {

        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        }

        public void gottomenu(ActionEvent event) throws IOException {
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/Menu.fxml"));
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
