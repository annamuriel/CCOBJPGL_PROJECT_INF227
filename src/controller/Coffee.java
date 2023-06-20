package controller;

import model.Coffee.Affogato;
import model.Coffee.Breve;
import model.Coffee.Cortado;
import model.Coffee.Cuppocino;
import model.Coffee.Espresso;
import model.Coffee.FlatWhite;
import model.Coffee.IcedCoffee;
import model.Coffee.Longblack;
import model.Coffee.Macchiato;
import model.Coffee.MatchaLatte;
import model.Coffee.Mocha;
import model.Coffee.Vienna;

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


public class Coffee implements Initializable {

    @FXML
    Label namec1, namec2, namec3, namec4, namec5, namec6, namec7, namec8,namec9, namec10, namec11, namec12, pricec1, pricec2, pricec3, pricec4, pricec5, pricec6, pricec7, pricec8, pricec9, pricec10, pricec11, pricec12;

    @FXML
    ImageView imgc1, imgc2, imgc3, imgc4,imgc5, imgc6, imgc7, imgc8,imgc9,imgc10,imgc11,imgc12;

    @FXML
    Button Buy1, Buy2, Buy3, Buy4, Buy5, Buy6, Buy7, Buy8, Buy9, Buy10, Buy11, Buy12, cartbutton, aboutusbtn ;

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

    @FXML
    AboutUsController AboutUsController;

    static Longblack longblack = new Longblack();
    static Espresso espresso = new Espresso();
    static Macchiato macchiato = new Macchiato();
    static Cuppocino cuppocino = new Cuppocino();
    static Vienna vienna = new Vienna();
    static IcedCoffee icedcoffee = new IcedCoffee();
    static Cortado cortado = new Cortado();
    static Breve breve = new Breve();
    static Mocha mocha = new Mocha();
    static Affogato affogato = new Affogato();
    static FlatWhite flatwhite = new FlatWhite();
    static MatchaLatte matchalatte = new MatchaLatte();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== vienna ==================//
        longblack.setProductName("Long Black");
        namec1.setText(longblack.getProductName());

        longblack.setProductPrice(5.00);
        pricec1.setText(Double.toString(longblack.getProductPrice()));

        longblack.setProductImage("images/img1.png");
        Image longblackcoffee = new Image(longblack.getProductImage());
        imgc1.setImage(longblackcoffee);

        // ============== Espresso ==================//

        espresso.setProductName("Espresso");
        namec2.setText(espresso.getProductName());

        espresso.setProductPrice(10.00);
        pricec2.setText(Double.toString(espresso.getProductPrice()));

        espresso.setProductImage("images/img2.png");
        Image espressocoffee = new Image(espresso.getProductImage());
        imgc2.setImage(espressocoffee);

        // ============== Macchiato ==================//
        macchiato.setProductName("Macchiato");
        namec3.setText(macchiato.getProductName());

        macchiato.setProductPrice(15.00);
        pricec3.setText(Double.toString(macchiato.getProductPrice()));

        macchiato.setProductImage("images/img3.png");
        Image macchiatocoffee = new Image(macchiato.getProductImage());
        imgc3.setImage(macchiatocoffee);

        // ============== Cuppocino ==================//

        cuppocino.setProductName("Cuppocino");
        namec4.setText(cuppocino.getProductName());

        cuppocino.setProductPrice(35.00);
        pricec4.setText(Double.toString(cuppocino.getProductPrice()));

        cuppocino.setProductImage("images/img4.png");
        Image cuppocinocoffee = new Image(cuppocino.getProductImage());
        imgc4.setImage(cuppocinocoffee);

        // ============== Vienna ==================//
        vienna.setProductName("Vienna");
        namec5.setText(vienna.getProductName());

        vienna.setProductPrice(5.00);
        pricec5.setText(Double.toString(vienna.getProductPrice()));

        vienna.setProductImage("images/img5.png");
        Image viennacoffee = new Image(vienna.getProductImage());
        imgc5.setImage(viennacoffee);

        // ============== Iced Coffee ==================//

        icedcoffee.setProductName("Iced Coffee");
        namec6.setText(icedcoffee.getProductName());

        icedcoffee.setProductPrice(10.00);
        pricec6.setText(Double.toString(icedcoffee.getProductPrice()));

        icedcoffee.setProductImage("images/img6.png");
        Image icedcoffeecoffee = new Image(icedcoffee.getProductImage());
        imgc6.setImage(icedcoffeecoffee);

       // ============== Cortado ==================//
       cortado.setProductName("Cortado");
       namec7.setText(cortado.getProductName());

       cortado.setProductPrice(5.00);
       pricec7.setText(Double.toString(cortado.getProductPrice()));

       cortado.setProductImage("images/img7.png");
       Image cortadocoffee = new Image(cortado.getProductImage());
       imgc7.setImage(cortadocoffee);

       // ============== Breve ==================//
       breve.setProductName("Breve");
       namec8.setText(cortado.getProductName());

       breve.setProductPrice(5.00);
       pricec8.setText(Double.toString(breve.getProductPrice()));

       breve.setProductImage("images/img8.png");
       Image brevecoffee = new Image(breve.getProductImage());
       imgc8.setImage(brevecoffee);

      // ============== Mocha ==================//
      mocha.setProductName("Mocha");
      namec9.setText(mocha.getProductName());

      mocha.setProductPrice(5.00);
      pricec9.setText(Double.toString(mocha.getProductPrice()));

      mocha.setProductImage("images/img9.png");
      Image mochacoffee = new Image(mocha.getProductImage());
      imgc9.setImage(mochacoffee);

      // ============== Affogato ==================//

      affogato.setProductName("affogato");
      namec10.setText(affogato.getProductName());

      affogato.setProductPrice(10.00);
      pricec10.setText(Double.toString(affogato.getProductPrice()));

      affogato.setProductImage("images/img10.png");
      Image affogatocoffee = new Image(affogato.getProductImage());
      imgc10.setImage(affogatocoffee);

      // ==============Flat White ==================//
      flatwhite.setProductName("flatwhite");
      namec11.setText(flatwhite.getProductName());

      flatwhite.setProductPrice(15.00);
      pricec11.setText(Double.toString(flatwhite.getProductPrice()));

      flatwhite.setProductImage("images/img11.png");
      Image flatwhitecoffee = new Image(flatwhite.getProductImage());
      imgc11.setImage(flatwhitecoffee);

      // ============== Matchalatte ==================//

      matchalatte.setProductName("Matcha Latte");
      namec12.setText(matchalatte.getProductName());

      matchalatte.setProductPrice(35.00);
      pricec12.setText(Double.toString(matchalatte.getProductPrice()));

      matchalatte.setProductImage("images/img12.png");
      Image matchalattecoffee = new Image(matchalatte.getProductImage());
      imgc12.setImage(matchalattecoffee);

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
             longblack.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane1);
        }

        else if (sourceButton == (Buy2)) {
            espresso.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane2);
        }

        else if (sourceButton == (Buy3)) {
            macchiato.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane3);
        }

        else if (sourceButton == (Buy4)) {
            cuppocino.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane4);
        }
        if (sourceButton.equals(Buy5)) {
            vienna.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane5);
        }

        else if (sourceButton == (Buy6)) {
            icedcoffee.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane6);
        }

        else if (sourceButton == (Buy7)) {
            cortado.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane7);
        }

        else if (sourceButton == (Buy8)) {
            breve.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane8);
        }
        else if (sourceButton == (Buy9)) {
            mocha.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane9);
        }
        else if (sourceButton == (Buy10)) {
            affogato.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane10);
        }
        else if (sourceButton == (Buy11)) {
            flatwhite.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane11);
        }
        else if (sourceButton == (Buy12)) {
            matchalatte.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane12);
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
