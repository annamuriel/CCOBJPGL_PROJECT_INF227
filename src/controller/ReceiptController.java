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
    double item1Amount, item2Amount, item3Amount, item4Amount, item5Amount, item6Amount, item7Amount, item8Amount ,item9Amount, item10Amount, 
    item11Amount, item12Amount, item13Amount, item14Amount, item15Amount, item16Amount, item17Amount, item18Amount, item19Amount, item20Amount,item21Amount, item22Amount;

    @FXML
    Label qty1, qty2, qty3, qty4, qty5, qty6, qty7, qty8, qty9, qty10, qty11, qty12, qty13, qty14, qty15, qty16,qty17, qty18, qty19, qty20,qty21, qty22,
     product1, product2, product3, product4 ,product5, product6, product7, product8, product9,product10, product11, product12, product13, product14, product15, product16, product17, product18, product19, product20, product21, product22,
     price1, price2, price3, price4, price5, price6,price7, price8, price9, price10, price11, price12,price13, price14, price15, price16, price17, price18, price19, price20, price21, price22,
     amount1,amount2,amount3, amount4, amount5, amount6, amount7, amount8, amount9, amount10, amount11, amount12, amount13, amount14, amount15, amount16,amount17, amount18, amount19,amount20, amount21, amount22,
     total;
     
     @FXML
     Button gotocheckout;

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

        if (LoginController.longblack.getProductStatus()) {
            product1.setText(LoginController.longblack.getProductName());
            qty1.setText(Double.toString(LoginController.longblack.getProductQuantity()));
            price1.setText(Double.toString(LoginController.longblack.getProductPrice()));
            amount1.setText(Double
                    .toString(LoginController.longblack.getProductPrice() * LoginController.longblack.getProductQuantity()));

            product1.setVisible(true);
            qty1.setVisible(true);
            price1.setVisible(true);
            amount1.setVisible(true);

            item1Amount = LoginController.longblack.getProductPrice() * LoginController.longblack.getProductQuantity();

        }

        if (LoginController.espresso.getProductStatus()) {
            product2.setText(LoginController.espresso.getProductName());
            qty2.setText(Double.toString(LoginController.espresso.getProductQuantity()));
            price2.setText(Double.toString(LoginController.espresso.getProductPrice()));
            amount2.setText(Double
                    .toString(LoginController.espresso.getProductPrice() * LoginController.espresso.getProductQuantity()));

            product2.setVisible(true);
            qty2.setVisible(true);
            price2.setVisible(true);
            amount2.setVisible(true);

            item2Amount = LoginController.espresso.getProductPrice() * LoginController.espresso.getProductQuantity();
        }

        if (LoginController.macchiato.getProductStatus()) {
            product3.setText(LoginController.macchiato.getProductName());
            qty3.setText(Double.toString(LoginController.macchiato.getProductQuantity()));
            price3.setText(Double.toString(LoginController.macchiato.getProductPrice()));
            amount3.setText(Double
                    .toString(LoginController.macchiato.getProductPrice() * LoginController.macchiato.getProductQuantity()));

            product3.setVisible(true);
            qty3.setVisible(true);
            price3.setVisible(true);
            amount3.setVisible(true);

            item3Amount = LoginController.macchiato.getProductPrice() * LoginController.macchiato.getProductQuantity();

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

        if (LoginController.vienna.getProductStatus()) {
            product5.setText(LoginController.vienna.getProductName());
            qty5.setText(Double.toString(LoginController.vienna.getProductQuantity()));
            price5.setText(Double.toString(LoginController.vienna.getProductPrice()));
            amount5.setText(Double
                    .toString(LoginController.vienna.getProductPrice() * LoginController.vienna.getProductQuantity()));

            product5.setVisible(true);
            qty5.setVisible(true);
            price5.setVisible(true);
            amount5.setVisible(true);

            item5Amount = LoginController.vienna.getProductPrice() * LoginController.vienna.getProductQuantity();

        }

        if (LoginController.icedcoffee.getProductStatus()) {
            product6.setText(LoginController.icedcoffee.getProductName());
            qty6.setText(Double.toString(LoginController.icedcoffee.getProductQuantity()));
            price6.setText(Double.toString(LoginController.icedcoffee.getProductPrice()));
            amount6.setText(Double
                    .toString(LoginController.icedcoffee.getProductPrice() * LoginController.icedcoffee.getProductQuantity()));

            product6.setVisible(true);
            qty6.setVisible(true);
            price6.setVisible(true);
            amount6.setVisible(true);

            item6Amount = LoginController.icedcoffee.getProductPrice() * LoginController.icedcoffee.getProductQuantity();

        }

        if (LoginController.cortado.getProductStatus()) {
            product7.setText(LoginController.cortado.getProductName());
            qty7.setText(Double.toString(LoginController.cortado.getProductQuantity()));
            price7.setText(Double.toString(LoginController.cortado.getProductPrice()));
            amount7.setText(Double
                    .toString(LoginController.cortado.getProductPrice() * LoginController.cortado.getProductQuantity()));

            product7.setVisible(true);
            qty7.setVisible(true);
            price7.setVisible(true);
            amount7.setVisible(true);

            item7Amount = LoginController.cortado.getProductPrice() * LoginController.cortado.getProductQuantity();

        }

        if (LoginController.breve.getProductStatus()) {
            product8.setText(LoginController.breve.getProductName());
            qty8.setText(Double.toString(LoginController.breve.getProductQuantity()));
            price8.setText(Double.toString(LoginController.breve.getProductPrice()));
            amount8.setText(Double
                    .toString(LoginController.breve.getProductPrice() * LoginController.breve.getProductQuantity()));

            product8.setVisible(true);
            qty8.setVisible(true);
            price8.setVisible(true);
            amount8.setVisible(true);

            item8Amount = LoginController.breve.getProductPrice() * LoginController.breve.getProductQuantity();

        }

        if (LoginController.mocha.getProductStatus()) {
            product9.setText(LoginController.mocha.getProductName());
            qty9.setText(Double.toString(LoginController.mocha.getProductQuantity()));
            price9.setText(Double.toString(LoginController.mocha.getProductPrice()));
            amount9.setText(Double
                    .toString(LoginController.mocha.getProductPrice() * LoginController.mocha.getProductQuantity()));

            product9.setVisible(true);
            qty9.setVisible(true);
            price9.setVisible(true);
            amount9.setVisible(true);

            item9Amount = LoginController.mocha.getProductPrice() * LoginController.mocha.getProductQuantity();

        }

        if (LoginController.affogato.getProductStatus()) {
            product10.setText(LoginController.affogato.getProductName());
            qty10.setText(Double.toString(LoginController.affogato.getProductQuantity()));
            price10.setText(Double.toString(LoginController.affogato.getProductPrice()));
            amount10.setText(Double
                    .toString(LoginController.affogato.getProductPrice() * LoginController.affogato.getProductQuantity()));

            product10.setVisible(true);
            qty10.setVisible(true);
            price10.setVisible(true);
            amount10.setVisible(true);

            item10Amount = LoginController.affogato.getProductPrice() * LoginController.affogato.getProductQuantity();

        }

        if (LoginController.flatwhite.getProductStatus()) {
            product11.setText(LoginController.flatwhite.getProductName());
            qty11.setText(Double.toString(LoginController.flatwhite.getProductQuantity()));
            price11.setText(Double.toString(LoginController.flatwhite.getProductPrice()));
            amount11.setText(Double
                    .toString(LoginController.flatwhite.getProductPrice() * LoginController.flatwhite.getProductQuantity()));

            product11.setVisible(true);
            qty11.setVisible(true);
            price11.setVisible(true);
            amount11.setVisible(true);

            item11Amount = LoginController.flatwhite.getProductPrice() * LoginController.flatwhite.getProductQuantity();

        }


        if (LoginController.matchalatte.getProductStatus()) {
            product12.setText(LoginController.matchalatte.getProductName());
            qty12.setText(Double.toString(LoginController.matchalatte.getProductQuantity()));
            price12.setText(Double.toString(LoginController.matchalatte.getProductPrice()));
            amount12.setText(Double
                    .toString(LoginController.matchalatte.getProductPrice() * LoginController.matchalatte.getProductQuantity()));

            product12.setVisible(true);
            qty12.setVisible(true);
            price12.setVisible(true);
            amount12.setVisible(true);

            item12Amount = LoginController.matchalatte.getProductPrice() * LoginController.matchalatte.getProductQuantity();

        }

        if (LoginController.barakoeh.getProductStatus()) {
            product13.setText(LoginController.barakoeh.getProductName());
            qty13.setText(Double.toString(LoginController.barakoeh.getProductQuantity()));
            price13.setText(Double.toString(LoginController.barakoeh.getProductPrice()));
            amount13.setText(Double
                    .toString(LoginController.barakoeh.getProductPrice() * LoginController.barakoeh.getProductQuantity()));

            product13.setVisible(true);
            qty13.setVisible(true);
            price13.setVisible(true);
            amount13.setVisible(true);

            item13Amount = LoginController.barakoeh.getProductPrice() * LoginController.barakoeh.getProductQuantity();

        }

        if (LoginController.brobeans.getProductStatus()) {
            product14.setText(LoginController.brobeans.getProductName());
            qty14.setText(Double.toString(LoginController.brobeans.getProductQuantity()));
            price14.setText(Double.toString(LoginController.brobeans.getProductPrice()));
            amount14.setText(Double
                    .toString(LoginController.brobeans.getProductPrice() * LoginController.brobeans.getProductQuantity()));

            product14.setVisible(true);
            qty14.setVisible(true);
            price14.setVisible(true);
            amount14.setVisible(true);

            item4Amount = LoginController.brobeans.getProductPrice() * LoginController.brobeans.getProductQuantity();

        }

        if (LoginController.coffeellera.getProductStatus()) {
            product15.setText(LoginController.coffeellera.getProductName());
            qty15.setText(Double.toString(LoginController.coffeellera.getProductQuantity()));
            price15.setText(Double.toString(LoginController.coffeellera.getProductPrice()));
            amount15.setText(Double
                    .toString(LoginController.coffeellera.getProductPrice() * LoginController.coffeellera.getProductQuantity()));

            product15.setVisible(true);
            qty15.setVisible(true);
            price15.setVisible(true);
            amount15.setVisible(true);

            item15Amount = LoginController.coffeellera.getProductPrice() * LoginController.coffeellera.getProductQuantity();

        }

        if (LoginController.jordanbeans.getProductStatus()) {
            product16.setText(LoginController.jordanbeans.getProductName());
            qty16.setText(Double.toString(LoginController.jordanbeans.getProductQuantity()));
            price16.setText(Double.toString(LoginController.jordanbeans.getProductPrice()));
            amount16.setText(Double
                    .toString(LoginController.jordanbeans.getProductPrice() * LoginController.jordanbeans.getProductQuantity()));

            product16.setVisible(true);
            qty16.setVisible(true);
            price16.setVisible(true);
            amount16.setVisible(true);

            item16Amount = LoginController.jordanbeans.getProductPrice() * LoginController.jordanbeans.getProductQuantity();

        }

        if (LoginController.mrbeans.getProductStatus()) {
            product17.setText(LoginController.mrbeans.getProductName());
            qty17.setText(Double.toString(LoginController.mrbeans.getProductQuantity()));
            price17.setText(Double.toString(LoginController.mrbeans.getProductPrice()));
            amount17.setText(Double
                    .toString(LoginController.mrbeans.getProductPrice() * LoginController.mrbeans.getProductQuantity()));

            product17.setVisible(true);
            qty17.setVisible(true);
            price17.setVisible(true);
            amount17.setVisible(true);

            item17Amount = LoginController.mrbeans.getProductPrice() * LoginController.mrbeans.getProductQuantity();

        }

        if (LoginController.cheesyensaymada.getProductStatus()) {
            product18.setText(LoginController.cheesyensaymada.getProductName());
            qty18.setText(Double.toString(LoginController.cheesyensaymada.getProductQuantity()));
            price18.setText(Double.toString(LoginController.cheesyensaymada.getProductPrice()));
            amount18.setText(Double
                    .toString(LoginController.cheesyensaymada.getProductPrice() * LoginController.cheesyensaymada.getProductQuantity()));

            product18.setVisible(true);
            qty18.setVisible(true);
            price18.setVisible(true);
            amount18.setVisible(true);

            item18Amount = LoginController.cheesyensaymada.getProductPrice() * LoginController.cheesyensaymada.getProductQuantity();

        }

        if (LoginController.glazeddonut.getProductStatus()) {
            product19.setText(LoginController.glazeddonut.getProductName());
            qty19.setText(Double.toString(LoginController.glazeddonut.getProductQuantity()));
            price19.setText(Double.toString(LoginController.glazeddonut.getProductPrice()));
            amount19.setText(Double
                    .toString(LoginController.glazeddonut.getProductPrice() * LoginController.glazeddonut.getProductQuantity()));

            product19.setVisible(true);
            qty19.setVisible(true);
            price19.setVisible(true);
            amount19.setVisible(true);

            item19Amount = LoginController.glazeddonut.getProductPrice() * LoginController.glazeddonut.getProductQuantity();

        }

        if (LoginController.pichicroissant.getProductStatus()) {
            product20.setText(LoginController.pichicroissant.getProductName());
            qty20.setText(Double.toString(LoginController.pichicroissant.getProductQuantity()));
            price20.setText(Double.toString(LoginController.pichicroissant.getProductPrice()));
            amount20.setText(Double
                    .toString(LoginController.pichicroissant.getProductPrice() * LoginController.pichicroissant.getProductQuantity()));

            product20.setVisible(true);
            qty20.setVisible(true);
            price20.setVisible(true);
            amount20.setVisible(true);

            item20Amount = LoginController.pichicroissant.getProductPrice() * LoginController.pichicroissant.getProductQuantity();

        }

        if (LoginController.sausagebacon.getProductStatus()) {
            product21.setText(LoginController.sausagebacon.getProductName());
            qty21.setText(Double.toString(LoginController.sausagebacon.getProductQuantity()));
            price21.setText(Double.toString(LoginController.sausagebacon.getProductPrice()));
            amount21.setText(Double
                    .toString(LoginController.sausagebacon.getProductPrice() * LoginController.sausagebacon.getProductQuantity()));

            product21.setVisible(true);
            qty21.setVisible(true);
            price21.setVisible(true);
            amount21.setVisible(true);

            item21Amount = LoginController.sausagebacon.getProductPrice() * LoginController.sausagebacon.getProductQuantity();

        }

        if (LoginController.tiawaffle.getProductStatus()) {
            product22.setText(LoginController.tiawaffle.getProductName());
            qty22.setText(Double.toString(LoginController.tiawaffle.getProductQuantity()));
            price22.setText(Double.toString(LoginController.tiawaffle.getProductPrice()));
            amount22.setText(Double
                    .toString(LoginController.tiawaffle.getProductPrice() * LoginController.tiawaffle.getProductQuantity()));

            product22.setVisible(true);
            qty22.setVisible(true);
            price22.setVisible(true);
            amount22.setVisible(true);

            item22Amount = LoginController.tiawaffle.getProductPrice() * LoginController.tiawaffle.getProductQuantity();

        }

        
        double final_amount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item7Amount + item8Amount 
        + item9Amount + item10Amount + item11Amount + item12Amount + item13Amount + item14Amount + item15Amount + item16Amount + item17Amount 
        + item18Amount + item19Amount + item20Amount + item21Amount+ item22Amount;
        total.setText(Double.toString(final_amount));

    }
    public void gotocheckout(ActionEvent event) throws IOException {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

    }
}