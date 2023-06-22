package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Node;

public class ReceiptController implements Initializable {

    @FXML
    double item1Amount, item2Amount, item3Amount, item4Amount, item5Amount, item6Amount, item7Amount, item8Amount, item9Amount, item10Amount, item11Amount;

    @FXML
    Label qty1, qty2, qty3, qty4, qty5, qty6, qty7, qty8, qty9, qty10, qty11,
    product1, product2, product3, product4, product5, product6, product7, product8, product9, product10, product11,
    price1, price2, price3, price4, price5, price6, price7, price8, price9, price10, price11,
    amount1,amount2,amount3, amount4, amount5, amount6, amount7, amount8, amount9, amount10, amount11, total;

    @FXML
    Button rateus;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (LoginController.espresso.getProductStatus()) {
            product1.setText(LoginController.espresso.getProductName());
            qty1.setText(Double.toString(LoginController.espresso.getProductQuantity()));
            price1.setText(Double.toString(LoginController.espresso.getProductPrice()));
            amount1.setText(Double
                    .toString(LoginController.espresso.getProductPrice() * LoginController.espresso.getProductQuantity()));

            product1.setVisible(true);
            qty1.setVisible(true);
            price1.setVisible(true);
            amount1.setVisible(true);

            item1Amount = LoginController.espresso.getProductPrice() * LoginController.espresso.getProductQuantity();

        }

        if (LoginController.affogato.getProductStatus()) {
            product2.setText(LoginController.affogato.getProductName());
            qty2.setText(Double.toString(LoginController.affogato.getProductQuantity()));
            price2.setText(Double.toString(LoginController.affogato.getProductPrice()));
            amount2.setText(Double
                    .toString(LoginController.affogato.getProductPrice() * LoginController.affogato.getProductQuantity()));

            product2.setVisible(true);
            qty2.setVisible(true);
            price2.setVisible(true);
            amount2.setVisible(true);

            item2Amount = LoginController.affogato.getProductPrice() * LoginController.affogato.getProductQuantity();
        }

        if (LoginController.matcha.getProductStatus()) {
            product3.setText(LoginController.matcha.getProductName());
            qty3.setText(Double.toString(LoginController.matcha.getProductQuantity()));
            price3.setText(Double.toString(LoginController.matcha.getProductPrice()));
            amount3.setText(Double
                    .toString(LoginController.matcha.getProductPrice() * LoginController.matcha.getProductQuantity()));

            product3.setVisible(true);
            qty3.setVisible(true);
            price3.setVisible(true);
            amount3.setVisible(true);

            item3Amount = LoginController.matcha.getProductPrice() * LoginController.matcha.getProductQuantity();

        }

        if (LoginController.cuppocino.getProductStatus()) {
            product4.setText(LoginController.cuppocino.getProductName());
            qty4.setText(Double.toString(LoginController.cuppocino.getProductQuantity()));
            price4.setText(Double.toString(LoginController.cuppocino.getProductPrice()));
            amount4.setText(Double
                    .toString(LoginController.cuppocino.getProductPrice() * LoginController.cuppocino.getProductQuantity()));

            product4.setVisible(true);
            qty4.setVisible(true);
            price4.setVisible(true);
            amount4.setVisible(true);

            item4Amount = LoginController.cuppocino.getProductPrice() * LoginController.cuppocino.getProductQuantity();

        }

        if (LoginController.croissant.getProductStatus()) {
            product5.setText(LoginController.croissant.getProductName());
            qty5.setText(Double.toString(LoginController.croissant.getProductQuantity()));
            price5.setText(Double.toString(LoginController.croissant.getProductPrice()));
            amount5.setText(Double
                    .toString(LoginController.croissant.getProductPrice() * LoginController.croissant.getProductQuantity()));

            product5.setVisible(true);
            qty5.setVisible(true);
            price5.setVisible(true);
            amount5.setVisible(true);

            item5Amount = LoginController.croissant.getProductPrice() * LoginController.croissant.getProductQuantity();

        }

        if (LoginController.cookies.getProductStatus()) {
            product6.setText(LoginController.cookies.getProductName());
            qty6.setText(Double.toString(LoginController.cookies.getProductQuantity()));
            price6.setText(Double.toString(LoginController.cookies.getProductPrice()));
            amount6.setText(Double
                    .toString(LoginController.cookies.getProductPrice() * LoginController.cookies.getProductQuantity()));

            product6.setVisible(true);
            qty6.setVisible(true);
            price6.setVisible(true);
            amount6.setVisible(true);

            item6Amount = LoginController.cookies.getProductPrice() * LoginController.cookies.getProductQuantity();

        }

        if (LoginController.pandesal.getProductStatus()) {
            product7.setText(LoginController.pandesal.getProductName());
            qty7.setText(Double.toString(LoginController.pandesal.getProductQuantity()));
            price7.setText(Double.toString(LoginController.pandesal.getProductPrice()));
            amount7.setText(Double
                    .toString(LoginController.pandesal.getProductPrice() * LoginController.pandesal.getProductQuantity()));

            product7.setVisible(true);
            qty7.setVisible(true);
            price7.setVisible(true);
            amount7.setVisible(true);

            item7Amount = LoginController.pandesal.getProductPrice() * LoginController.pandesal.getProductQuantity();

        }

        if (LoginController.cinnamon.getProductStatus()) {
            product8.setText(LoginController.cinnamon.getProductName());
            qty8.setText(Double.toString(LoginController.cinnamon.getProductQuantity()));
            price8.setText(Double.toString(LoginController.cinnamon.getProductPrice()));
            amount8.setText(Double
                    .toString(LoginController.cinnamon.getProductPrice() * LoginController.cinnamon.getProductQuantity()));

            product8.setVisible(true);
            qty8.setVisible(true);
            price8.setVisible(true);
            amount8.setVisible(true);

            item8Amount = LoginController.cookies.getProductPrice() * LoginController.cookies.getProductQuantity();

        }

        if (LoginController.arabica.getProductStatus()) {
            product9.setText(LoginController.arabica.getProductName());
            qty9.setText(Double.toString(LoginController.arabica.getProductQuantity()));
            price9.setText(Double.toString(LoginController.arabica.getProductPrice()));
            amount9.setText(Double
                    .toString(LoginController.arabica.getProductPrice() * LoginController.arabica.getProductQuantity()));

            product9.setVisible(true);
            qty9.setVisible(true);
            price9.setVisible(true);
            amount9.setVisible(true);

            item9Amount = LoginController.arabica.getProductPrice() * LoginController.arabica.getProductQuantity();

        }

        if (LoginController.robusta.getProductStatus()) {
            product10.setText(LoginController.robusta.getProductName());
            qty10.setText(Double.toString(LoginController.robusta.getProductQuantity()));
            price10.setText(Double.toString(LoginController.robusta.getProductPrice()));
            amount10.setText(Double
                    .toString(LoginController.robusta.getProductPrice() * LoginController.robusta.getProductQuantity()));

            product10.setVisible(true);
            qty10.setVisible(true);
            price10.setVisible(true);
            amount10.setVisible(true);

            item10Amount = LoginController.robusta.getProductPrice() * LoginController.robusta.getProductQuantity();

        }

        if (LoginController.liberica.getProductStatus()) {
            product11.setText(LoginController.liberica.getProductName());
            qty11.setText(Double.toString(LoginController.liberica.getProductQuantity()));
            price11.setText(Double.toString(LoginController.liberica.getProductPrice()));
            amount11.setText(Double
                    .toString(LoginController.liberica.getProductPrice() * LoginController.liberica.getProductQuantity()));

            product11.setVisible(true);
            qty11.setVisible(true);
            price11.setVisible(true);
            amount11.setVisible(true);

            item11Amount = LoginController.cookies.getProductPrice() * LoginController.cookies.getProductQuantity();

        }

        double final_amount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item7Amount + item8Amount + item9Amount + item10Amount + item11Amount;
        total.setText(Double.toString(final_amount));

        
    }

       // Go to Receipt Page
       public void gotorateus(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Feedback.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    
}