package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckoutController implements Initializable {

    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8 , pane9, pane10, pane11, pane12, pane13, pane14, pane15, pane16, pane17, pane18, pane19, pane20, pane21, pane22;

    @FXML
    VBox myvbox;

    @FXML
    Button gotomenu;

    @FXML
    Label  namec1, namec2, namec3, namec4, namec5, namec6, namec7, namec8,namec9, namec10, namec11, namec12, nameb13, nameb14, nameb15,
     nameb16, nameb17, namec18, namec19, namec20, namec21, namec22, pricec1, pricec2, pricec3, pricec4, pricec5,
     pricec6, pricec7, pricec8, pricec9, pricec10, pricec11, pricec12 , priceb13, priceb14, priceb15, priceb16, priceb17, pricec18, pricec19,
     pricec20, pricec21, pricec22, total;

    @FXML
    ImageView imgc1, imgc2, imgc3, imgc4,imgc5, imgc6, imgc7, imgc8, imgc9, imgc10, imgc11, imgc12, imgb13, imgb14, imgb15, imgb16, imgb17, imgc18,
     imgc19, imgc20, imgc21, imgc22;

    @FXML
    private ChoiceBox<String> choicebox1, choicebox2, choicebox3, choicebox4, choicebox5, choicebox6, choicebox7, choicebox8, choicebox9, choicebox10, choicebox11, choicebox12, 
    choicebox13, choicebox14, choicebox15, choicebox16, choicebox17, choicebox18, choicebox19, choicebox20, choicebox21, choicebox22;

    private String[] quantity = { "1", "2", "3", "4" , "5" , "6" , "7" , "8" , "9" ,  "10" , "11" , "12" , "13" , "14" , "15" , "16" , "17" , "18" , "19" , "20" , "21" , "22" };

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

        nameb13.setText(Beans.barakoeh.getProductName());
        priceb13.setText(Double.toString(Beans.barakoeh.getProductPrice()));
        Image barakoeh = new Image(Beans.barakoeh.getProductImage());
        imgb13.setImage(barakoeh);

        nameb14.setText(Beans.brobeans.getProductName());
        priceb14.setText(Double.toString(Beans.brobeans.getProductPrice()));
        Image brobeans = new Image(Beans.brobeans.getProductImage());
        imgb14.setImage(brobeans);

        nameb15.setText(Beans.coffeellera.getProductName());
        priceb15.setText(Double.toString(Beans.coffeellera.getProductPrice()));
        Image coffeellera = new Image(Beans.coffeellera.getProductImage());
        imgb15.setImage(coffeellera);

        nameb16.setText(Beans.jordanbeans.getProductName());
        priceb16.setText(Double.toString(Beans.jordanbeans.getProductPrice()));
        Image jordanbeans = new Image(Beans.jordanbeans.getProductImage());
        imgb16.setImage(jordanbeans);

        nameb17.setText(Beans.mrbeans.getProductName());
        priceb17.setText(Double.toString(Beans.mrbeans.getProductPrice()));
        Image mrbeans = new Image(Beans.mrbeans.getProductImage());
        imgb17.setImage(mrbeans);

        namec18.setText(Pastry.cheesyensaymada.getProductName());
        pricec18.setText(Double.toString(Pastry.cheesyensaymada.getProductPrice()));
        Image cheesyensaymada = new Image(Pastry.cheesyensaymada.getProductImage());
        imgc18.setImage(cheesyensaymada);

        namec19.setText(Pastry.glazeddonut.getProductName());
        pricec19.setText(Double.toString(Pastry.glazeddonut.getProductPrice()));
        Image glazeddonut = new Image(Pastry.glazeddonut.getProductImage());
        imgc19.setImage(glazeddonut);

        namec20.setText(Pastry.pichicroissant.getProductName());
        pricec20.setText(Double.toString(Pastry.pichicroissant.getProductPrice()));
        Image pichicroissant = new Image(Pastry.pichicroissant.getProductImage());
        imgc20.setImage(pichicroissant);

        namec21.setText(Pastry.sausagebacon.getProductName());
        pricec21.setText(Double.toString(Pastry.sausagebacon.getProductPrice()));
        Image sausagebacon = new Image(Pastry.sausagebacon.getProductImage());
        imgc21.setImage(sausagebacon);

        namec22.setText(Pastry.tiawaffle.getProductName());
        pricec22.setText(Double.toString(Pastry.tiawaffle.getProductPrice()));
        Image tiawaffle = new Image(Pastry.tiawaffle.getProductImage());
        imgc22.setImage(tiawaffle);

    

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
        choicebox13.setValue("1");
        choicebox14.setValue("1");
        choicebox15.setValue("1");
        choicebox16.setValue("1");
        choicebox17.setValue("1");
        choicebox18.setValue("1");
        choicebox19.setValue("1");
        choicebox20.setValue("1");
        choicebox21.setValue("1");
        choicebox22.setValue("1");
     


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
        choicebox13.getItems().addAll(quantity);
        choicebox14.getItems().addAll(quantity);
        choicebox15.getItems().addAll(quantity);
        choicebox16.getItems().addAll(quantity);
        choicebox17.getItems().addAll(quantity);
        choicebox18.getItems().addAll(quantity);
        choicebox19.getItems().addAll(quantity);
        choicebox20.getItems().addAll(quantity);
        choicebox21.getItems().addAll(quantity);
        choicebox22.getItems().addAll(quantity);
      

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
        choicebox13.setOnAction(this::computeTotal);
        choicebox14.setOnAction(this::computeTotal);
        choicebox15.setOnAction(this::computeTotal);
        choicebox16.setOnAction(this::computeTotal);
        choicebox17.setOnAction(this::computeTotal);
        choicebox18.setOnAction(this::computeTotal);
        choicebox19.setOnAction(this::computeTotal);
        choicebox20.setOnAction(this::computeTotal);
        choicebox21.setOnAction(this::computeTotal);
        choicebox22.setOnAction(this::computeTotal);
      

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
                + Double.parseDouble(choicebox12.getValue()) * Coffee.matchalatte.getProductPrice()
                + Double.parseDouble(choicebox13.getValue()) * Beans.barakoeh.getProductPrice()
                + Double.parseDouble(choicebox14.getValue()) * Beans.brobeans.getProductPrice()
                + Double.parseDouble(choicebox15.getValue()) * Beans.coffeellera.getProductPrice()
                + Double.parseDouble(choicebox16.getValue()) * Beans.jordanbeans.getProductPrice()
                + Double.parseDouble(choicebox17.getValue()) * Beans.mrbeans.getProductPrice()
                + Double.parseDouble(choicebox18.getValue()) * Pastry.cheesyensaymada.getProductPrice()
                + Double.parseDouble(choicebox19.getValue()) * Pastry.glazeddonut.getProductPrice()
                + Double.parseDouble(choicebox10.getValue()) * Pastry.pichicroissant.getProductPrice()
                + Double.parseDouble(choicebox21.getValue()) * Pastry.sausagebacon.getProductPrice()
                + Double.parseDouble(choicebox22.getValue()) * Pastry.tiawaffle.getProductPrice();
        

              

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
        double item13Amount = 0;
        double item14Amount = 0;
        double item15Amount = 0;
        double item16Amount = 0;
        double item17Amount = 0;
        double item18Amount = 0;
        double item19Amount = 0;
        double item20Amount = 0;
        double item21Amount = 0;
        double item22Amount = 0;
    

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

        if (Beans.barakoeh.getProductStatus()) {

            double qty = Double.parseDouble(choicebox13.getValue());
            item13Amount = Beans.barakoeh.getProductPrice() * qty;

            if (source == choicebox13) {
                item13Amount = Beans.barakoeh.getProductPrice() * qty;
            }
        }

        if (Beans.brobeans.getProductStatus()) {

            double qty = Double.parseDouble(choicebox14.getValue());
            item14Amount = Beans.brobeans.getProductPrice() * qty;

            if (source == choicebox14) {
                item14Amount = Beans.brobeans.getProductPrice() * qty;
            }
        }

        if (Beans.coffeellera.getProductStatus()) {

            double qty = Double.parseDouble(choicebox15.getValue());
            item15Amount = Beans.coffeellera.getProductPrice() * qty;

            if (source == choicebox15) {
                item15Amount = Beans.coffeellera.getProductPrice() * qty;
            }
        }

        if (Beans.jordanbeans.getProductStatus()) {

            double qty = Double.parseDouble(choicebox16.getValue());
            item16Amount = Beans.jordanbeans.getProductPrice() * qty;

            if (source == choicebox16) {
                item16Amount = Beans.jordanbeans.getProductPrice() * qty;
            }
        }

        if (Beans.mrbeans.getProductStatus()) {

            double qty = Double.parseDouble(choicebox17.getValue());
            item17Amount = Beans.mrbeans.getProductPrice() * qty;

            if (source == choicebox17) {
                item17Amount = Beans.mrbeans.getProductPrice() * qty;
            }
        }

        if (Pastry.cheesyensaymada.getProductStatus()) {

            double qty = Double.parseDouble(choicebox18.getValue());
            item18Amount = Pastry.cheesyensaymada.getProductPrice() * qty;

            if (source == choicebox18) {
                item18Amount = Pastry.cheesyensaymada.getProductPrice() * qty;
            }
        }

        if (Pastry.glazeddonut.getProductStatus()) {

            double qty = Double.parseDouble(choicebox19.getValue());
            item19Amount = Pastry.glazeddonut.getProductPrice() * qty;

            if (source == choicebox19) {
                item19Amount = Pastry.glazeddonut.getProductPrice() * qty;
            }
        }

        if (Pastry.pichicroissant.getProductStatus()) {

            double qty = Double.parseDouble(choicebox20.getValue());
            item20Amount = Pastry.pichicroissant.getProductPrice() * qty;

            if (source == choicebox20) {
                item20Amount = Pastry.pichicroissant.getProductPrice() * qty;
            }
        }

        if (Pastry.sausagebacon.getProductStatus()) {

            double qty = Double.parseDouble(choicebox21.getValue());
            item21Amount = Pastry.sausagebacon.getProductPrice() * qty;

            if (source == choicebox21) {
                item21Amount = Pastry.sausagebacon.getProductPrice() * qty;
            }
        }

        if (Pastry.tiawaffle.getProductStatus()) {

            double qty = Double.parseDouble(choicebox22.getValue());
            item22Amount = Pastry.tiawaffle.getProductPrice() * qty;

            if (source == choicebox22) {
                item22Amount = Pastry.tiawaffle.getProductPrice() * qty;
            }
        }

    

        // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item7Amount + item8Amount + item9Amount + item10Amount + item11Amount + item12Amount + item13Amount + item14Amount + item15Amount + item16Amount + item17Amount + item18Amount + item19Amount + item20Amount + item21Amount + item22Amount ;

        // Display total amount in total label
        total.setText(Double.toString(totalAmount));
    }

    public void gottomenu(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Menu.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
