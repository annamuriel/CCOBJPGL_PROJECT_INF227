package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
    Button gotomenu, checkoutbtn;

    @FXML
    Label  namec1, namec2, namec3, namec4, namec5, namec6, namec7, namec8,namec9, namec10, namec11, namec12, nameb13, nameb14, nameb15,
     nameb16, nameb17, namep18, namep19, namep20, namep21, namep22, pricec1, pricec2, pricec3, pricec4, pricec5,
     pricec6, pricec7, pricec8, pricec9, pricec10, pricec11, pricec12 , priceb13, priceb14, priceb15, priceb16, priceb17, pricep18, pricep19,
     pricep20, pricep21, pricep22, total;

    @FXML
    ImageView imgc1, imgc2, imgc3, imgc4,imgc5, imgc6, imgc7, imgc8, imgc9, imgc10, imgc11, imgc12, imgb13, imgb14, imgb15, imgb16, imgb17, imgp18,
     imgp19, imgp20, imgp21, imgp22;

    @FXML
    private ChoiceBox<String> choicebox1, choicebox2, choicebox3, choicebox4, choicebox5, choicebox6, choicebox7, choicebox8, choicebox9, choicebox10, choicebox11, choicebox12, 
    choicebox13, choicebox14, choicebox15, choicebox16, choicebox17, choicebox18, choicebox19, choicebox20, choicebox21, choicebox22;

    private String[] quantity = { "1", "2", "3", "4" , "5" , "6" , "7" , "8" , "9" ,  "10" , "11" , "12" , "13" , "14" , "15" , "16" , "17" , "18" , "19" , "20" , "21" , "22" };


    FXMLLoader loader;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    static Parent homeRoot = null;

    @FXML
    static MenuController menuController;

    @FXML
    static CheckoutController checkoutController;

    @FXML
    static AboutUsController AboutUsController;

    @FXML
    static ReceiptController receiptController;
    
    @FXML
    static HomeController HomeController;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        namec1.setText(LoginController.longblack.getProductName());
        pricec1.setText(Double.toString(LoginController.longblack.getProductPrice()));
        Image longblackLoginController = new Image(LoginController.longblack.getProductImage());
        imgc1.setImage(longblackLoginController);

        namec2.setText(LoginController.espresso.getProductName());
        pricec2.setText(Double.toString(LoginController.espresso.getProductPrice()));
        Image espressoLoginController = new Image(LoginController.espresso.getProductImage());
        imgc2.setImage(espressoLoginController);

        namec3.setText(LoginController.macchiato.getProductName());
        pricec3.setText(Double.toString(LoginController.macchiato.getProductPrice()));
        Image macchiatoLoginController = new Image(LoginController.macchiato.getProductImage());
        imgc3.setImage(macchiatoLoginController);

        namec4.setText(LoginController.cuppocino.getProductName());
        pricec4.setText(Double.toString(LoginController.cuppocino.getProductPrice()));
        Image cuppocinoLoginController = new Image(LoginController.cuppocino.getProductImage());
        imgc4.setImage(cuppocinoLoginController);

        namec5.setText(LoginController.vienna.getProductName());
        pricec5.setText(Double.toString(LoginController.vienna.getProductPrice()));
        Image viennaLoginController = new Image(LoginController.vienna.getProductImage());
        imgc5.setImage(viennaLoginController);

        namec6.setText(LoginController.icedcoffee.getProductName());
        pricec6.setText(Double.toString(LoginController.icedcoffee.getProductPrice()));
        Image icedLoginControllere = new Image(LoginController.icedcoffee.getProductImage());
        imgc6.setImage(icedLoginControllere);

        namec7.setText(LoginController.cortado.getProductName());
        pricec7.setText(Double.toString(LoginController.cortado.getProductPrice()));
        Image cortadoLoginController = new Image(LoginController.cortado.getProductImage());
        imgc7.setImage(cortadoLoginController);

        namec8.setText(LoginController.breve.getProductName());
        pricec8.setText(Double.toString(LoginController.breve.getProductPrice()));
        Image breveLoginController = new Image(LoginController.breve.getProductImage());
        imgc8.setImage(breveLoginController);

        namec9.setText(LoginController.mocha.getProductName());
        pricec9.setText(Double.toString(LoginController.mocha.getProductPrice()));
        Image mochaLoginController = new Image(LoginController.mocha.getProductImage());
        imgc9.setImage(mochaLoginController);

        namec10.setText(LoginController.affogato.getProductName());
        pricec10.setText(Double.toString(LoginController.affogato.getProductPrice()));
        Image affogatoLoginController = new Image(LoginController.affogato.getProductImage());
        imgc10.setImage(affogatoLoginController);

        namec11.setText(LoginController.flatwhite.getProductName());
        pricec11.setText(Double.toString(LoginController.flatwhite.getProductPrice()));
        Image flatwhiteLoginController= new Image(LoginController.flatwhite.getProductImage());
        imgc11.setImage(flatwhiteLoginController);

        namec12.setText(LoginController.matchalatte.getProductName());
        pricec12.setText(Double.toString(LoginController.matchalatte.getProductPrice()));
        Image matchalatteLoginController = new Image(LoginController.matchalatte.getProductImage());
        imgc12.setImage(matchalatteLoginController);

        nameb13.setText(LoginController.barakoeh.getProductName());
        priceb13.setText(Double.toString(LoginController.barakoeh.getProductPrice()));
        Image barakoeh = new Image(LoginController.barakoeh.getProductImage());
        imgb13.setImage(barakoeh);

        nameb14.setText(LoginController.brobeans.getProductName());
        priceb14.setText(Double.toString(LoginController.brobeans.getProductPrice()));
        Image brobeans = new Image(LoginController.brobeans.getProductImage());
        imgb14.setImage(brobeans);

        nameb15.setText(LoginController.coffeellera.getProductName());
        priceb15.setText(Double.toString(LoginController.coffeellera.getProductPrice()));
        Image LoginControllerllera = new Image(LoginController.coffeellera.getProductImage());
        imgb15.setImage(LoginControllerllera);

        nameb16.setText(LoginController.jordanbeans.getProductName());
        priceb16.setText(Double.toString(LoginController.jordanbeans.getProductPrice()));
        Image jordanbeans = new Image(LoginController.jordanbeans.getProductImage());
        imgb16.setImage(jordanbeans);

        nameb17.setText(LoginController.mrbeans.getProductName());
        priceb17.setText(Double.toString(LoginController.mrbeans.getProductPrice()));
        Image mrbeans = new Image(LoginController.mrbeans.getProductImage());
        imgb17.setImage(mrbeans);

        namep18.setText(LoginController.cheesyensaymada.getProductName());
        pricep18.setText(Double.toString(LoginController.cheesyensaymada.getProductPrice()));
        Image cheesyensaymada = new Image(LoginController.cheesyensaymada.getProductImage());
        imgp18.setImage(cheesyensaymada);

        namep19.setText(LoginController.glazeddonut.getProductName());
        pricep19.setText(Double.toString(LoginController.glazeddonut.getProductPrice()));
        Image glazeddonut = new Image(LoginController.glazeddonut.getProductImage());
        imgp19.setImage(glazeddonut);

        namep20.setText(LoginController.pichicroissant.getProductName());
        pricep20.setText(Double.toString(LoginController.pichicroissant.getProductPrice()));
        Image pichicroissant = new Image(LoginController.pichicroissant.getProductImage());
        imgp20.setImage(pichicroissant);

        namep21.setText(LoginController.sausagebacon.getProductName());
        pricep21.setText(Double.toString(LoginController.sausagebacon.getProductPrice()));
        Image sausagebacon = new Image(LoginController.sausagebacon.getProductImage());
        imgp21.setImage(sausagebacon);

        namep22.setText(LoginController.tiawaffle.getProductName());
        pricep22.setText(Double.toString(LoginController.tiawaffle.getProductPrice()));
        Image tiawaffle = new Image(LoginController.tiawaffle.getProductImage());
        imgp22.setImage(tiawaffle);

    

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
        double totalInitialAmount = Double.parseDouble(choicebox1.getValue()) * LoginController.longblack.getProductPrice() +
                +Double.parseDouble(choicebox2.getValue()) * LoginController.espresso.getProductPrice()
                + Double.parseDouble(choicebox3.getValue()) * LoginController.macchiato.getProductPrice()
                + Double.parseDouble(choicebox4.getValue()) * LoginController.cuppocino.getProductPrice()
                + Double.parseDouble(choicebox5.getValue()) * LoginController.vienna.getProductPrice() 
                + Double.parseDouble(choicebox6.getValue()) * LoginController.icedcoffee.getProductPrice()
                + Double.parseDouble(choicebox7.getValue()) * LoginController.cortado.getProductPrice()
                + Double.parseDouble(choicebox8.getValue()) * LoginController.breve.getProductPrice()
                + Double.parseDouble(choicebox9.getValue()) * LoginController.mocha.getProductPrice()
                + Double.parseDouble(choicebox10.getValue()) * LoginController.affogato.getProductPrice()
                + Double.parseDouble(choicebox11.getValue()) * LoginController.flatwhite.getProductPrice()
                + Double.parseDouble(choicebox12.getValue()) * LoginController.matchalatte.getProductPrice()
                + Double.parseDouble(choicebox13.getValue()) * LoginController.barakoeh.getProductPrice()
                + Double.parseDouble(choicebox14.getValue()) * LoginController.brobeans.getProductPrice()
                + Double.parseDouble(choicebox15.getValue()) * LoginController.coffeellera.getProductPrice()
                + Double.parseDouble(choicebox16.getValue()) * LoginController.jordanbeans.getProductPrice()
                + Double.parseDouble(choicebox17.getValue()) * LoginController.mrbeans.getProductPrice()
                + Double.parseDouble(choicebox18.getValue()) * LoginController.cheesyensaymada.getProductPrice()
                + Double.parseDouble(choicebox19.getValue()) * LoginController.glazeddonut.getProductPrice()
                + Double.parseDouble(choicebox10.getValue()) * LoginController.pichicroissant.getProductPrice()
                + Double.parseDouble(choicebox21.getValue()) * LoginController.sausagebacon.getProductPrice()
                + Double.parseDouble(choicebox22.getValue()) * LoginController.tiawaffle.getProductPrice();
        

              

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
        if (LoginController.longblack.getProductStatus()) {

            double qty = Double.parseDouble(choicebox1.getValue());
            item1Amount = LoginController.longblack.getProductPrice() * qty;

            if (source == choicebox1) {
                item1Amount = LoginController.longblack.getProductPrice() * qty;
            }
        }

        if (LoginController.espresso.getProductStatus()) {

            double qty = Double.parseDouble(choicebox2.getValue());
            item2Amount = LoginController.espresso.getProductPrice() * qty;

            if (source == choicebox2) {
                item2Amount = LoginController.espresso.getProductPrice() * qty;
            }
        }

        if (LoginController.macchiato.getProductStatus()) {

            double qty = Double.parseDouble(choicebox3.getValue());
            item3Amount = LoginController.macchiato.getProductPrice() * qty;

            if (source == choicebox3) {
                item3Amount = LoginController.macchiato.getProductPrice() * qty;
            }
        }

        if (LoginController.cuppocino.getProductStatus()) {

            double qty = Double.parseDouble(choicebox4.getValue());
            item4Amount = LoginController.cuppocino.getProductPrice() * qty;

            if (source == choicebox4) {
                item4Amount = LoginController.cuppocino.getProductPrice() * qty;
            }
        }

        if (LoginController.vienna.getProductStatus()) {

            double qty = Double.parseDouble(choicebox5.getValue());
            item5Amount = LoginController.vienna.getProductPrice() * qty;

            if (source == choicebox5) {
                item5Amount = LoginController.vienna.getProductPrice() * qty;
            }
        }

        if (LoginController.icedcoffee.getProductStatus()) {

            double qty = Double.parseDouble(choicebox6.getValue());
            item6Amount = LoginController.icedcoffee.getProductPrice() * qty;

            if (source == choicebox6) {
                item2Amount = LoginController.icedcoffee.getProductPrice() * qty;
            }
        }

        if (LoginController.cortado.getProductStatus()) {

            double qty = Double.parseDouble(choicebox7.getValue());
            item7Amount = LoginController.cortado.getProductPrice() * qty;

            if (source == choicebox7) {
                item7Amount = LoginController.cortado.getProductPrice() * qty;
            }
        }

        if (LoginController.breve.getProductStatus()) {

            double qty = Double.parseDouble(choicebox8.getValue());
            item8Amount = LoginController.breve.getProductPrice() * qty;

            if (source == choicebox8) {
                item8Amount = LoginController.breve.getProductPrice() * qty;
            }
        }
        if (LoginController.mocha.getProductStatus()) {

            double qty = Double.parseDouble(choicebox9.getValue());
            item9Amount = LoginController.mocha.getProductPrice() * qty;

            if (source == choicebox9) {
                item9Amount = LoginController.mocha.getProductPrice() * qty;
            }
        }

        if (LoginController.affogato.getProductStatus()) {

            double qty = Double.parseDouble(choicebox10.getValue());
            item10Amount = LoginController.affogato.getProductPrice() * qty;

            if (source == choicebox10) {
                item10Amount = LoginController.affogato.getProductPrice() * qty;
            }
        }

        if (LoginController.flatwhite.getProductStatus()) {

            double qty = Double.parseDouble(choicebox11.getValue());
            item11Amount = LoginController.flatwhite.getProductPrice() * qty;

            if (source == choicebox11) {
                item11Amount = LoginController.flatwhite.getProductPrice() * qty;
            }
        }

        if (LoginController.matchalatte.getProductStatus()) {

            double qty = Double.parseDouble(choicebox12.getValue());
            item12Amount = LoginController.matchalatte.getProductPrice() * qty;

            if (source == choicebox12) {
                item12Amount = LoginController.matchalatte.getProductPrice() * qty;
            }
        }

        if (LoginController.barakoeh.getProductStatus()) {

            double qty = Double.parseDouble(choicebox13.getValue());
            item13Amount = LoginController.barakoeh.getProductPrice() * qty;

            if (source == choicebox13) {
                item13Amount = LoginController.barakoeh.getProductPrice() * qty;
            }
        }

        if (LoginController.brobeans.getProductStatus()) {

            double qty = Double.parseDouble(choicebox14.getValue());
            item14Amount = LoginController.brobeans.getProductPrice() * qty;

            if (source == choicebox14) {
                item14Amount = LoginController.brobeans.getProductPrice() * qty;
            }
        }

        if (LoginController.coffeellera.getProductStatus()) {

            double qty = Double.parseDouble(choicebox15.getValue());
            item15Amount = LoginController.coffeellera.getProductPrice() * qty;

            if (source == choicebox15) {
                item15Amount = LoginController.coffeellera.getProductPrice() * qty;
            }
        }

        if (LoginController.jordanbeans.getProductStatus()) {

            double qty = Double.parseDouble(choicebox16.getValue());
            item16Amount = LoginController.jordanbeans.getProductPrice() * qty;

            if (source == choicebox16) {
                item16Amount = LoginController.jordanbeans.getProductPrice() * qty;
            }
        }

        if (LoginController.mrbeans.getProductStatus()) {

            double qty = Double.parseDouble(choicebox17.getValue());
            item17Amount = LoginController.mrbeans.getProductPrice() * qty;

            if (source == choicebox17) {
                item17Amount = LoginController.mrbeans.getProductPrice() * qty;
            }
        }

        if (LoginController.cheesyensaymada.getProductStatus()) {

            double qty = Double.parseDouble(choicebox18.getValue());
            item18Amount = LoginController.cheesyensaymada.getProductPrice() * qty;

            if (source == choicebox18) {
                item18Amount = LoginController.cheesyensaymada.getProductPrice() * qty;
            }
        }

        if (LoginController.glazeddonut.getProductStatus()) {

            double qty = Double.parseDouble(choicebox19.getValue());
            item19Amount = LoginController.glazeddonut.getProductPrice() * qty;

            if (source == choicebox19) {
                item19Amount = LoginController.glazeddonut.getProductPrice() * qty;
            }
        }

        if (LoginController.pichicroissant.getProductStatus()) {

            double qty = Double.parseDouble(choicebox20.getValue());
            item20Amount = LoginController.pichicroissant.getProductPrice() * qty;

            if (source == choicebox20) {
                item20Amount = LoginController.pichicroissant.getProductPrice() * qty;
            }
        }

        if (LoginController.sausagebacon.getProductStatus()) {

            double qty = Double.parseDouble(choicebox21.getValue());
            item21Amount = LoginController.sausagebacon.getProductPrice() * qty;

            if (source == choicebox21) {
                item21Amount = LoginController.sausagebacon.getProductPrice() * qty;
            }
        }

        if (LoginController.tiawaffle.getProductStatus()) {

            double qty = Double.parseDouble(choicebox22.getValue());
            item22Amount = LoginController.tiawaffle.getProductPrice() * qty;

            if (source == choicebox22) {
                item22Amount = LoginController.tiawaffle.getProductPrice() * qty;
            }
        }

    

        // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item7Amount + item8Amount + item9Amount + item10Amount + item11Amount + item12Amount + item13Amount + item14Amount + item15Amount + item16Amount + item17Amount + item18Amount + item19Amount + item20Amount + item21Amount + item22Amount ;

        // Display total amount in total label
        total.setText(Double.toString(totalAmount));
    }

    
    // Computes initial Amount before modifying item quantity
    public void getInitialAmount() {

        double totalAmount = 0.00;
      ///coffeee
        if (LoginController.longblack.getProductStatus()) {
            totalAmount += LoginController.longblack.getProductPrice();
        }

        if (LoginController.espresso.getProductStatus()) {
            totalAmount += LoginController.espresso.getProductPrice();
        }

        if (LoginController.macchiato.getProductStatus()) {
            totalAmount += LoginController.macchiato.getProductPrice();
        }

        if (LoginController.cuppocino.getProductStatus()) {
            totalAmount += LoginController.cuppocino.getProductPrice();
        }
        if (LoginController.vienna.getProductStatus()) {
            totalAmount += LoginController.vienna.getProductPrice();
        }

        if (LoginController.icedcoffee.getProductStatus()) {
            totalAmount += LoginController.icedcoffee.getProductPrice();
        }

        if (LoginController.cortado.getProductStatus()) {
            totalAmount += LoginController.cortado.getProductPrice();
        }

        if (LoginController.breve.getProductStatus()) {
            totalAmount += LoginController.breve.getProductPrice();
        }
        if (LoginController.mocha.getProductStatus()) {
            totalAmount += LoginController.mocha.getProductPrice();
        }

        if (LoginController.affogato.getProductStatus()) {
            totalAmount += LoginController.affogato.getProductPrice();
        }

        if (LoginController.flatwhite.getProductStatus()) {
            totalAmount += LoginController.flatwhite.getProductPrice();
        }

        if (LoginController.matchalatte.getProductStatus()) {
            totalAmount += LoginController.matchalatte.getProductPrice();
        }

        ///beans

        if (LoginController.barakoeh.getProductStatus()) {
            totalAmount += LoginController.longblack.getProductPrice();
        }

        if (LoginController.espresso.getProductStatus()) {
            totalAmount += LoginController.espresso.getProductPrice();
        }

        if (LoginController.macchiato.getProductStatus()) {
            totalAmount += LoginController.macchiato.getProductPrice();
        }

        if (LoginController.cuppocino.getProductStatus()) {
            totalAmount += LoginController.cuppocino.getProductPrice();
        }
        if (LoginController.vienna.getProductStatus()) {
            totalAmount += LoginController.vienna.getProductPrice();
        }

      
        total.setText(Double.toString(totalAmount));
    }

    // Go to Receipt Page
    public void checkout(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Receipt.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    // Show all items in ArrayList
    public void showItems(ArrayList<Pane> itemList) {
        for (Pane p : itemList) {
            myvbox.getChildren().add(p);
        }
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
