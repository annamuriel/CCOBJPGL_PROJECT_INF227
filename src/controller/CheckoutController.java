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
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckoutController implements Initializable {

    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8, pane9, pane10, pane11;

    @FXML
    VBox myvbox;

    @FXML
    Label name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, price1, price2, price3, price4, price5, price6, price7, price8, price9, price10, price11, total;

    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11;

    @FXML
    private ChoiceBox<String> choicebox1, choicebox2, choicebox3, choicebox4, choicebox5, choicebox6, choicebox7, choicebox8, choicebox9, choicebox10, choicebox11;

    private String[] quantity = { "1", "2", "3",};

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        name1.setText(LoginController.espresso.getProductName());
        price1.setText(Double.toString(LoginController.espresso.getProductPrice()));
        Image espressocoffee = new Image(LoginController.espresso.getProductImage());
        img1.setImage(espressocoffee);

        name2.setText(LoginController.affogato.getProductName());
        price2.setText(Double.toString(LoginController.affogato.getProductPrice()));
        Image affogatocoffee = new Image(LoginController.affogato.getProductImage());
        img2.setImage(affogatocoffee);

        name3.setText(LoginController.matcha.getProductName());
        price3.setText(Double.toString(LoginController.matcha.getProductPrice()));
        Image matchacoffee = new Image(LoginController.matcha.getProductImage());
        img3.setImage(matchacoffee);

        name5.setText(LoginController.croissant.getProductName());
        price5.setText(Double.toString(LoginController.croissant.getProductPrice()));
        Image croissantp = new Image(LoginController.croissant.getProductImage());
        img5.setImage(croissantp);

        name6.setText(LoginController.cookies.getProductName());
        price6.setText(Double.toString(LoginController.cookies.getProductPrice()));
        Image cookiesp = new Image(LoginController.cookies.getProductImage());
        img6.setImage(cookiesp);

        name7.setText(LoginController.pandesal.getProductName());
        price7.setText(Double.toString(LoginController.pandesal.getProductPrice()));
        Image pandesalp = new Image(LoginController.pandesal.getProductImage());
        img7.setImage(pandesalp);

        name8.setText(LoginController.cinnamon.getProductName());
        price8.setText(Double.toString(LoginController.cinnamon.getProductPrice()));
        Image cinnamonp = new Image(LoginController.cinnamon.getProductImage());
        img8.setImage(cinnamonp);

        name9.setText(LoginController.arabica.getProductName());
        price9.setText(Double.toString(LoginController.arabica.getProductPrice()));
        Image arabicab = new Image(LoginController.arabica.getProductImage());
        img9.setImage(arabicab);

        name10.setText(LoginController.robusta.getProductName());
        price10.setText(Double.toString(LoginController.robusta.getProductPrice()));
        Image robusta = new Image(LoginController.robusta.getProductImage());
        img10.setImage(robusta);

        name11.setText(LoginController.liberica.getProductName());
        price11.setText(Double.toString(LoginController.liberica.getProductPrice()));
        Image libericab = new Image(LoginController.liberica.getProductImage());
        img11.setImage(libericab);

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
    

        ChoiceBox source = (ChoiceBox) event.getSource();

        // If product is chosen, compute item amount
        if (LoginController.espresso.getProductStatus()) {

            double qty = Double.parseDouble(choicebox1.getValue());
            LoginController.espresso.setProductQuantity(qty);
            item1Amount = LoginController.espresso.getProductPrice() * qty;

            if (source == choicebox1) {
                item1Amount = LoginController.espresso.getProductPrice() * qty;
            }
        }

        if (LoginController.affogato.getProductStatus()) {

            double qty = Double.parseDouble(choicebox2.getValue());
            LoginController.affogato.setProductQuantity(qty);
            item2Amount = LoginController.affogato.getProductPrice() * qty;

            if (source == choicebox2) {
                item2Amount = LoginController.affogato.getProductPrice() * qty;
            }
        }

        if (LoginController.matcha.getProductStatus()) {

            double qty = Double.parseDouble(choicebox3.getValue());
            LoginController.matcha.setProductQuantity(qty);
            item3Amount = LoginController.matcha.getProductPrice() * qty;

            if (source == choicebox3) {
                item3Amount = LoginController.matcha.getProductPrice() * qty;
            }
        }

        if (LoginController.cuppocino.getProductStatus()) {

            double qty = Double.parseDouble(choicebox4.getValue());
            LoginController.cuppocino.setProductQuantity(qty);
            item4Amount = LoginController.cuppocino.getProductPrice() * qty;

            if (source == choicebox4) {
                item4Amount = LoginController.cuppocino.getProductPrice() * qty;
            }
        }

        if (LoginController.croissant.getProductStatus()) {

            double qty = Double.parseDouble(choicebox5.getValue());
            LoginController.croissant.setProductQuantity(qty);
            item5Amount = LoginController.croissant.getProductPrice() * qty;

            if (source == choicebox5) {
                item5Amount = LoginController.croissant.getProductPrice() * qty;
            }
        }

        if (LoginController.cookies.getProductStatus()) {

            double qty = Double.parseDouble(choicebox6.getValue());
            LoginController.cookies.setProductQuantity(qty);
            item6Amount = LoginController.cookies.getProductPrice() * qty;

            if (source == choicebox6) {
                item6Amount = LoginController.cookies.getProductPrice() * qty;
            }
        }

        if (LoginController.pandesal.getProductStatus()) {

            double qty = Double.parseDouble(choicebox7.getValue());
            LoginController.pandesal.setProductQuantity(qty);
            item7Amount = LoginController.pandesal.getProductPrice() * qty;

            if (source == choicebox7) {
                item7Amount = LoginController.pandesal.getProductPrice() * qty;
            }
        }

        if (LoginController.cinnamon.getProductStatus()) {

            double qty = Double.parseDouble(choicebox8.getValue());
            LoginController.cinnamon.setProductQuantity(qty);
            item8Amount = LoginController.cinnamon.getProductPrice() * qty;

            if (source == choicebox8) {
                item8Amount = LoginController.cinnamon.getProductPrice() * qty;
            }
        }

        if (LoginController.arabica.getProductStatus()) {

            double qty = Double.parseDouble(choicebox9.getValue());
            LoginController.arabica.setProductQuantity(qty);
            item9Amount = LoginController.arabica.getProductPrice() * qty;

            if (source == choicebox9) {
                item9Amount = LoginController.arabica.getProductPrice() * qty;
            }
        }

        if (LoginController.robusta.getProductStatus()) {

            double qty = Double.parseDouble(choicebox10.getValue());
            LoginController.robusta.setProductQuantity(qty);
            item10Amount = LoginController.robusta.getProductPrice() * qty;

            if (source == choicebox10) {
                item10Amount = LoginController.robusta.getProductPrice() * qty;
            }
        }

        if (LoginController.liberica.getProductStatus()) {

            double qty = Double.parseDouble(choicebox11.getValue());
            LoginController.liberica.setProductQuantity(qty);
            item11Amount = LoginController.liberica.getProductPrice() * qty;

            if (source == choicebox11) {
                item11Amount = LoginController.liberica.getProductPrice() * qty;
            }
        }

        // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item7Amount + item8Amount + item9Amount + item10Amount + item11Amount;

        // Display total amount in total label
        total.setText(Double.toString(totalAmount));
    }

    // Computes initial Amount before modifying item quantity
    public void getInitialAmount() {

        double totalAmount = 0.00;

        if (LoginController.espresso.getProductStatus()) {
            totalAmount += LoginController.espresso.getProductPrice();
        }

        if (LoginController.affogato.getProductStatus()) {
            totalAmount += LoginController.affogato.getProductPrice();
        }

        if (LoginController.matcha.getProductStatus()) {
            totalAmount += LoginController.matcha.getProductPrice();
        }

        if (LoginController.cuppocino.getProductStatus()) {
            totalAmount += LoginController.cuppocino.getProductPrice();
        }

        if (LoginController.croissant.getProductStatus()) {
            totalAmount += LoginController.croissant.getProductPrice();
        }

        if (LoginController.cookies.getProductStatus()) {
            totalAmount += LoginController.cookies.getProductPrice();
        }

        if (LoginController.pandesal.getProductStatus()) {
            totalAmount += LoginController.pandesal.getProductPrice();
        }

        if (LoginController.cinnamon.getProductStatus()) {
            totalAmount += LoginController.cinnamon.getProductPrice();
        }

        if (LoginController.arabica.getProductStatus()) {
            totalAmount += LoginController.arabica.getProductPrice();
        }

        if (LoginController.robusta.getProductStatus()) {
            totalAmount += LoginController.robusta.getProductPrice();
        }

        if (LoginController.liberica.getProductStatus()) {
            totalAmount += LoginController.liberica.getProductPrice();
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

}
