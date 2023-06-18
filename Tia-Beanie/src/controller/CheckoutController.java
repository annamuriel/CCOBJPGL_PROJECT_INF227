package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class CheckoutController implements Initializable {

    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8 , pane9, pane10, pane11, pane12;

    @FXML
    VBox myvbox;

    @FXML
    Label  namec1, namec2, namec3, namec4, namec5, namec6, namec7, namec8,namec9, namec10, namec11, namec12, pricec1, pricec2, pricec3, pricec4, pricec5, pricec6, pricec7, pricec8, pricec9, pricec10, pricec11, pricec12 ,total;

    @FXML
    ImageView imgc1, imgc2, imgc3, imgc4,imgc5, imgc6, imgc7, imgc8,imgc9,imgc10,imgc11,imgc12;

    @FXML
    private ChoiceBox<String> choicebox1, choicebox2, choicebox3, choicebox4, choicebox5, choicebox6, choicebox7,choicebox8, choicebox9,choicebox10,choicebox11,choicebox12;

    private String[] quantity = { "1", "2", "3", "4" , "5" , "6" , "7" , "8" , "9" ,  "10" , "11" , "12" };

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        namec1.setText(Coffee.longblack.getProductName());
        pricec1.setText(Double.toString(Coffee.longblack.getProductPrice()));
        Image longblackcoffee = new Image(Coffee.longblack.getProductImage());
        imgc1.setImage(longblackcoffee);

        namec2.setText(Coffee.espresso.getProductName());
        pricec2.setText(Double.toString(Coffee.espresso.getProductPrice()));
        Image espressocoffee = new Image(Coffee.espresso.getProductImage());
        imgc2.setImage(espressocoffee);

        namec3.setText(Coffee.macchiato.getProductName());
        pricec3.setText(Double.toString(Coffee.macchiato.getProductPrice()));
        Image macchiatocoffee = new Image(Coffee.macchiato.getProductImage());
        imgc3.setImage(macchiatocoffee);

        namec4.setText(Coffee.cuppocino.getProductName());
        pricec4.setText(Double.toString(Coffee.cuppocino.getProductPrice()));
        Image cuppocinocoffee = new Image(Coffee.cuppocino.getProductImage());
        imgc4.setImage(cuppocinocoffee);

        namec5.setText(Coffee.vienna.getProductName());
        pricec5.setText(Double.toString(Coffee.vienna.getProductPrice()));
        Image viennacoffee = new Image(Coffee.vienna.getProductImage());
        imgc5.setImage(viennacoffee);

        namec6.setText(Coffee.icedcoffee.getProductName());
        pricec6.setText(Double.toString(Coffee.icedcoffee.getProductPrice()));
        Image icedcoffeee = new Image(Coffee.icedcoffee.getProductImage());
        imgc6.setImage(icedcoffeee);

        namec7.setText(Coffee.cortado.getProductName());
        pricec7.setText(Double.toString(Coffee.cortado.getProductPrice()));
        Image cortadocoffee = new Image(Coffee.cortado.getProductImage());
        imgc7.setImage(cortadocoffee);

        namec8.setText(Coffee.breve.getProductName());
        pricec8.setText(Double.toString(Coffee.breve.getProductPrice()));
        Image brevecoffee = new Image(Coffee.breve.getProductImage());
        imgc8.setImage(brevecoffee);

        namec9.setText(Coffee.mocha.getProductName());
        pricec9.setText(Double.toString(Coffee.mocha.getProductPrice()));
        Image mochacoffee = new Image(Coffee.mocha.getProductImage());
        imgc9.setImage(mochacoffee);

        namec10.setText(Coffee.affogato.getProductName());
        pricec10.setText(Double.toString(Coffee.affogato.getProductPrice()));
        Image affogatocoffee = new Image(Coffee.affogato.getProductImage());
        imgc10.setImage(affogatocoffee);

        namec11.setText(Coffee.flatwhite.getProductName());
        pricec11.setText(Double.toString(Coffee.flatwhite.getProductPrice()));
        Image flatwhitecoffee= new Image(Coffee.flatwhite.getProductImage());
        imgc11.setImage(flatwhitecoffee);

        namec12.setText(Coffee.matchalatte.getProductName());
        pricec12.setText(Double.toString(Coffee.matchalatte.getProductPrice()));
        Image matchalattecoffee = new Image(Coffee.matchalatte.getProductImage());
        imgc12.setImage(matchalattecoffee);

        // Set default quantities in choicebox to 1
        choicebox1.setValue("1");
        choicebox2.setValue("1");
        choicebox3.setValue("1");
        choicebox4.setValue("1");
        choicebox5.setValue("1");
        choicebox6.setValue("1");
        choicebox7.setValue("1");
        choicebox8.setValue("1");
        choicebox9.setValue("1");
        choicebox10.setValue("1");
        choicebox11.setValue("1");
        choicebox12.setValue("1");


        // Insert quantity array to choicebox
        choicebox1.getItems().addAll(quantity);
        choicebox2.getItems().addAll(quantity);
        choicebox3.getItems().addAll(quantity);
        choicebox4.getItems().addAll(quantity);
        choicebox5.getItems().addAll(quantity);
        choicebox6.getItems().addAll(quantity);
        choicebox7.getItems().addAll(quantity);
        choicebox8.getItems().addAll(quantity);
        choicebox9.getItems().addAll(quantity);
        choicebox10.getItems().addAll(quantity);
        choicebox11.getItems().addAll(quantity);
        choicebox12.getItems().addAll(quantity);

        // Add event handler on all choiceboxes
        choicebox1.setOnAction(this::computeTotal);
        choicebox2.setOnAction(this::computeTotal);
        choicebox3.setOnAction(this::computeTotal);
        choicebox4.setOnAction(this::computeTotal);
        choicebox5.setOnAction(this::computeTotal);
        choicebox6.setOnAction(this::computeTotal);
        choicebox7.setOnAction(this::computeTotal);
        choicebox8.setOnAction(this::computeTotal);
        choicebox9.setOnAction(this::computeTotal);
        choicebox10.setOnAction(this::computeTotal);
        choicebox11.setOnAction(this::computeTotal);
        choicebox12.setOnAction(this::computeTotal);

        // Set total initial amount
        double totalInitialAmount = Double.parseDouble(choicebox1.getValue()) * Coffee.longblack.getProductPrice() +
                +Double.parseDouble(choicebox2.getValue()) * Coffee.espresso.getProductPrice()
                + Double.parseDouble(choicebox3.getValue()) * Coffee.macchiato.getProductPrice()
                + Double.parseDouble(choicebox4.getValue()) * Coffee.cuppocino.getProductPrice()
                + Double.parseDouble(choicebox5.getValue()) * Coffee.vienna.getProductPrice() 
                + Double.parseDouble(choicebox6.getValue()) * Coffee.icedcoffee.getProductPrice()
                + Double.parseDouble(choicebox7.getValue()) * Coffee.cortado.getProductPrice()
                + Double.parseDouble(choicebox8.getValue()) * Coffee.breve.getProductPrice()
                + Double.parseDouble(choicebox9.getValue()) * Coffee.mocha.getProductPrice()
                + Double.parseDouble(choicebox10.getValue()) * Coffee.affogato.getProductPrice()
                + Double.parseDouble(choicebox11.getValue()) * Coffee.flatwhite.getProductPrice()
                + Double.parseDouble(choicebox12.getValue()) * Coffee.matchalatte.getProductPrice();
              

        // Display total initial amount in total label
        total.setText(Double.toString(totalInitialAmount));
    }

    public void addItem(Pane pane) {
        myvbox.getChildren().add(pane);
    }

    public void computeTotal(ActionEvent event) {

        double totalAmount = 0;
        double item1Amount = 0;
        double item2Amount = 0;
        double item3Amount = 0;
        double item4Amount = 0;
        double item5Amount = 0;
        double item6Amount = 0;
        double item7Amount = 0;
        double item8Amount = 0;
        double item9Amount = 0;
        double item10Amount = 0;
        double item11Amount = 0;
        double item12Amount = 0;

        ChoiceBox source = (ChoiceBox) event.getSource();

        // If product is chosen, compute item amount
        if (Coffee.longblack.getProductStatus()) {

            double qty = Double.parseDouble(choicebox1.getValue());
            item1Amount = Coffee.longblack.getProductPrice() * qty;

            if (source == choicebox1) {
                item1Amount = Coffee.longblack.getProductPrice() * qty;
            }
        }

        if (Coffee.espresso.getProductStatus()) {

            double qty = Double.parseDouble(choicebox2.getValue());
            item2Amount = Coffee.espresso.getProductPrice() * qty;

            if (source == choicebox2) {
                item2Amount = Coffee.espresso.getProductPrice() * qty;
            }
        }

        if (Coffee.macchiato.getProductStatus()) {

            double qty = Double.parseDouble(choicebox3.getValue());
            item3Amount = Coffee.macchiato.getProductPrice() * qty;

            if (source == choicebox3) {
                item3Amount = Coffee.macchiato.getProductPrice() * qty;
            }
        }

        if (Coffee.cuppocino.getProductStatus()) {

            double qty = Double.parseDouble(choicebox4.getValue());
            item4Amount = Coffee.cuppocino.getProductPrice() * qty;

            if (source == choicebox4) {
                item4Amount = Coffee.cuppocino.getProductPrice() * qty;
            }
        }

        if (Coffee.vienna.getProductStatus()) {

            double qty = Double.parseDouble(choicebox5.getValue());
            item5Amount = Coffee.vienna.getProductPrice() * qty;

            if (source == choicebox5) {
                item5Amount = Coffee.vienna.getProductPrice() * qty;
            }
        }

        if (Coffee.icedcoffee.getProductStatus()) {

            double qty = Double.parseDouble(choicebox6.getValue());
            item6Amount = Coffee.icedcoffee.getProductPrice() * qty;

            if (source == choicebox6) {
                item2Amount = Coffee.icedcoffee.getProductPrice() * qty;
            }
        }

        if (Coffee.cortado.getProductStatus()) {

            double qty = Double.parseDouble(choicebox7.getValue());
            item7Amount = Coffee.cortado.getProductPrice() * qty;

            if (source == choicebox7) {
                item7Amount = Coffee.cortado.getProductPrice() * qty;
            }
        }

        if (Coffee.breve.getProductStatus()) {

            double qty = Double.parseDouble(choicebox8.getValue());
            item8Amount = Coffee.breve.getProductPrice() * qty;

            if (source == choicebox8) {
                item8Amount = Coffee.breve.getProductPrice() * qty;
            }
        }
        if (Coffee.mocha.getProductStatus()) {

            double qty = Double.parseDouble(choicebox9.getValue());
            item9Amount = Coffee.mocha.getProductPrice() * qty;

            if (source == choicebox9) {
                item9Amount = Coffee.mocha.getProductPrice() * qty;
            }
        }

        if (Coffee.affogato.getProductStatus()) {

            double qty = Double.parseDouble(choicebox10.getValue());
            item10Amount = Coffee.affogato.getProductPrice() * qty;

            if (source == choicebox10) {
                item10Amount = Coffee.affogato.getProductPrice() * qty;
            }
        }

        if (Coffee.flatwhite.getProductStatus()) {

            double qty = Double.parseDouble(choicebox11.getValue());
            item11Amount = Coffee.flatwhite.getProductPrice() * qty;

            if (source == choicebox11) {
                item11Amount = Coffee.flatwhite.getProductPrice() * qty;
            }
        }

        if (Coffee.matchalatte.getProductStatus()) {

            double qty = Double.parseDouble(choicebox12.getValue());
            item12Amount = Coffee.matchalatte.getProductPrice() * qty;

            if (source == choicebox12) {
                item12Amount = Coffee.matchalatte.getProductPrice() * qty;
            }
        }
    

        // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item7Amount + item8Amount + item9Amount + item10Amount + item11Amount + item12Amount;

        // Display total amount in total label
        total.setText(Double.toString(totalAmount));
    }
}
