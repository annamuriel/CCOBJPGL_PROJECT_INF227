package controller;

import model.Pastry.CheesyEnsaymada;
import model.Pastry.GlazedDonut;
import model.Pastry.PichiCroissant;
import model.Pastry.SausageBacon;
import model.Pastry.TiaWaffle;

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
    Label namep1, namep2, namep3, namep4, namep5, pricep1, pricep2, pricep3, pricep4, pricep5;

    @FXML
    ImageView imgp1, imgp2, imgp3, imgp4, imgp5;

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

    static CheesyEnsaymada cheesyensaymada = new CheesyEnsaymada();
    static GlazedDonut glazeddonut = new GlazedDonut();
    static PichiCroissant pichicroissant = new PichiCroissant();
    static SausageBacon sausagebacon = new SausageBacon();
    static TiaWaffle tiawaffle = new TiaWaffle();

     @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== cheesy ensaymada ==================//
        cheesyensaymada.setProductName("Cheesy Ensaymada");
        namep1.setText(cheesyensaymada.getProductName());

        cheesyensaymada.setProductPrice(5.00);
        pricep1.setText(Double.toString(cheesyensaymada.getProductPrice()));

        cheesyensaymada.setProductImage("images/ensaymada.png");
        Image cheesyensaymadapastry = new Image(cheesyensaymada.getProductImage());
        imgp1.setImage(cheesyensaymadapastry);

        // ============== glazed donut ==================//
        glazeddonut.setProductName("Glazed Donut");
        namep2.setText(glazeddonut.getProductName());

        glazeddonut.setProductPrice(5.00);
        pricep2.setText(Double.toString(glazeddonut.getProductPrice()));

        glazeddonut.setProductImage("images/donut.png");
        Image glazeddonutpastry = new Image(glazeddonut.getProductImage());
        imgp2.setImage(glazeddonutpastry);

        // ============== pichi croissant ==================//
        pichicroissant.setProductName("Pichi Croissant");
        namep3.setText(pichicroissant.getProductName());

        pichicroissant.setProductPrice(5.00);
        pricep3.setText(Double.toString(pichicroissant.getProductPrice()));

        pichicroissant.setProductImage("images/croissant.png");
        Image pichicroissantpastry = new Image(pichicroissant.getProductImage());
        imgp3.setImage(pichicroissantpastry);

        // ============== Sausage Bacon ==================//
        sausagebacon.setProductName("Sausage Bacon");
        namep4.setText(sausagebacon.getProductName());

        sausagebacon.setProductPrice(5.00);
        pricep4.setText(Double.toString(sausagebacon.getProductPrice()));

        sausagebacon.setProductImage("images/sausagebacon.png");
        Image sausagebaconpastry = new Image(sausagebacon.getProductImage());
        imgp4.setImage(sausagebaconpastry);

             // ============== Tia Waffle ==================//
        tiawaffle.setProductName("Tia Waffle");
        namep5.setText(tiawaffle.getProductName());

        tiawaffle.setProductPrice(5.00);
        pricep5.setText(Double.toString(tiawaffle.getProductPrice()));

        tiawaffle.setProductImage("images/waffle.png");
        Image tiawafflepastry = new Image(tiawaffle.getProductImage());
        imgp5.setImage(tiawafflepastry);

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
             cheesyensaymada.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane1);
        }

        else if (sourceButton == (Buy2)) {
            glazeddonut.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane2);
        }

        else if (sourceButton == (Buy3)) {
            pichicroissant.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane3);
        }

        else if (sourceButton == (Buy4)) {
            sausagebacon.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane4);
        }
        if (sourceButton.equals(Buy5)) {
            tiawaffle.setProductStatus(true);
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


