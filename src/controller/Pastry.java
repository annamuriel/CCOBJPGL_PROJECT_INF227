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
    Label namep18, namep19, namep20, namep21, namep22, pricep18, pricep19, pricep20, pricep21, pricep22;

    @FXML
    ImageView imgp18, imgp19, imgp20, imgp21, imgp22;

    @FXML
    Button buyp18, Buyp19, Buyp20, Buyp21, Buyp22, aboutus, menubutton, cartbutton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;


    @FXML
    private Parent root;

    FXMLLoader loader;

    @FXML
    MenuController menuController;

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
        namep18.setText(cheesyensaymada.getProductName());

        cheesyensaymada.setProductPrice(5.00);
        pricep18.setText(Double.toString(cheesyensaymada.getProductPrice()));

        cheesyensaymada.setProductImage("images/ensaymada.png");
        Image cheesyensaymadapastry = new Image(cheesyensaymada.getProductImage());
        imgp18.setImage(cheesyensaymadapastry);

        // ============== glazed donut ==================//
        glazeddonut.setProductName("Glazed Donut");
        namep19.setText(glazeddonut.getProductName());

        glazeddonut.setProductPrice(5.00);
        pricep19.setText(Double.toString(glazeddonut.getProductPrice()));

        glazeddonut.setProductImage("images/donut.png");
        Image glazeddonutpastry = new Image(glazeddonut.getProductImage());
        imgp19.setImage(glazeddonutpastry);

        // ============== pichi croissant ==================//
        pichicroissant.setProductName("Pichi Croissant");
        namep20.setText(pichicroissant.getProductName());

        pichicroissant.setProductPrice(5.00);
        pricep20.setText(Double.toString(pichicroissant.getProductPrice()));

        pichicroissant.setProductImage("images/croissant.png");
        Image pichicroissantpastry = new Image(pichicroissant.getProductImage());
        imgp20.setImage(pichicroissantpastry);

        // ============== Sausage Bacon ==================//
        sausagebacon.setProductName("Sausage Bacon");
        namep21.setText(sausagebacon.getProductName());

        sausagebacon.setProductPrice(5.00);
        pricep21.setText(Double.toString(sausagebacon.getProductPrice()));

        sausagebacon.setProductImage("images/sausagebacon.png");
        Image sausagebaconpastry = new Image(sausagebacon.getProductImage());
        imgp21.setImage(sausagebaconpastry);

             // ============== Tia Waffle ==================//
        tiawaffle.setProductName("Tia Waffle");
        namep22.setText(tiawaffle.getProductName());

        tiawaffle.setProductPrice(5.00);
        pricep22.setText(Double.toString(tiawaffle.getProductPrice()));

        tiawaffle.setProductImage("images/waffle.png");
        Image tiawafflepastry = new Image(tiawaffle.getProductImage());
        imgp22.setImage(tiawafflepastry);

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
        if (sourceButton.equals(buyp18)) {
             cheesyensaymada.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane18);
        }

        else if (sourceButton == (Buyp19)) {
            glazeddonut.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane19);
        }

        else if (sourceButton == (Buyp20)) {
            pichicroissant.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane20);
        }

        else if (sourceButton == (Buyp21)) {
            sausagebacon.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane21);
        }
        if (sourceButton.equals(Buyp22)) {
            tiawaffle.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane22);
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


