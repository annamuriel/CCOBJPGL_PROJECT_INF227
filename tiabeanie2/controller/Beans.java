package controller;

import model.Beans.BarakoEH;
import model.Beans.BroBeans;
import model.Beans.Coffeellera;
import model.Beans.JordanBeans;
import model.Beans.MrBeansCoffee;

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
    Label nameb1, nameb2, nameb3, nameb4, nameb5, priceb1, priceb2, priceb3, priceb4, priceb5;

    @FXML
    ImageView imgb1, imgb2, imgb3, imgb4, imgb5;

    @FXML
    Button Buy1, Buy2, Buy3, Buy4, Buy5, aboutus, menubutton, cartbutton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root;

    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController;

    static BarakoEH barakoeh = new BarakoEH();
    static BroBeans brobeans = new BroBeans();
    static Coffeellera coffeellera = new Coffeellera();
    static JordanBeans jordanbeans = new JordanBeans();
    static MrBeansCoffee mrbeans = new MrBeansCoffee();

     @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== barako eh ==================//
        barakoeh.setProductName("Barako-EH");
        nameb1.setText(barakoeh.getProductName());

        barakoeh.setProductPrice(5.00);
        priceb1.setText(Double.toString(barakoeh.getProductPrice()));

        barakoeh.setProductImage("images/barakoeh.png");
        Image barakoehBeans = new Image(barakoeh.getProductImage());
        imgb1.setImage(barakoehBeans);

        // ============== bro beans ==================//
        brobeans.setProductName("Bro Beans");
        nameb2.setText(brobeans.getProductName());

        brobeans.setProductPrice(5.00);
        priceb2.setText(Double.toString(brobeans.getProductPrice()));

        brobeans.setProductImage("images/brobeans.png");
        Image brobeansBeans = new Image(brobeans.getProductImage());
        imgb2.setImage(brobeansBeans);

        // ============== coffeellera ==================//
        coffeellera.setProductName("Coffeelera");
        nameb3.setText(coffeellera.getProductName());

        coffeellera.setProductPrice(5.00);
        priceb3.setText(Double.toString(coffeellera.getProductPrice()));

        coffeellera.setProductImage("images/coffeellera.png");
        Image coffeelleraBeans = new Image(coffeellera.getProductImage());
        imgb3.setImage(coffeelleraBeans);

        // ============== jordan beans ==================//
        jordanbeans.setProductName("Jordan Beans");
        nameb4.setText(jordanbeans.getProductName());

        jordanbeans.setProductPrice(5.00);
        priceb4.setText(Double.toString(jordanbeans.getProductPrice()));

        jordanbeans.setProductImage("images/jordanbeans.png");
        Image jordanbeansBeans = new Image(jordanbeans.getProductImage());
        imgb4.setImage(jordanbeansBeans);

             // ============== mr beans ==================//
        mrbeans.setProductName("Mr. Beans");
        nameb5.setText(mrbeans.getProductName());

        mrbeans.setProductPrice(5.00);
        priceb5.setText(Double.toString(mrbeans.getProductPrice()));

        mrbeans.setProductImage("images/mrbeans.png");
        Image mrbeansBeans = new Image(mrbeans.getProductImage());
        imgb5.setImage(mrbeansBeans);

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
             barakoeh.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane1);
        }

        else if (sourceButton == (Buy2)) {
            brobeans.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane2);
        }

        else if (sourceButton == (Buy3)) {
            coffeellera.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane3);
        }

        else if (sourceButton == (Buy4)) {
            jordanbeans.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane4);
        }
        if (sourceButton.equals(Buy5)) {
            mrbeans.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane5);

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
