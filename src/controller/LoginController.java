package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.Affogato;
import model.BarakoEH;
import model.Breve;
import model.BroBeans;
import model.Cart;
import model.CheesyEnsaymada;
import model.Coffeellera;
import model.Cortado;
import model.Cuppocino;
import model.Espresso;
import model.FlatWhite;
import model.GlazedDonut;
import model.IcedCoffee;
import model.JordanBeans;
import model.Longblack;
import model.Macchiato;
import model.MatchaLatte;
import model.Mocha;
import model.MrBeansCoffee;
import model.PichiCroissant;
import model.SausageBacon;
import model.TiaWaffle;
import model.Vienna;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
  

public class LoginController implements Initializable {


    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    TextField mytextfieldpassword;

    @FXML
    CheckBox mycheckbox;

    @FXML
    Button mybutton;

    @FXML
    Label mywarninglabel;

    @FXML
    private ImageView Pug;
    
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


    FXMLLoader loader;

    static Cart cart = new Cart();

    //beans
    static BarakoEH barakoeh = new BarakoEH();
    static BroBeans brobeans = new BroBeans();
    static Coffeellera coffeellera = new Coffeellera();
    static JordanBeans jordanbeans = new JordanBeans();
    static MrBeansCoffee mrbeans = new MrBeansCoffee();

    //coffee
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

    //pastry
    static CheesyEnsaymada cheesyensaymada = new CheesyEnsaymada();
    static GlazedDonut glazeddonut = new GlazedDonut();
    static PichiCroissant pichicroissant = new PichiCroissant();
    static SausageBacon sausagebacon = new SausageBacon();
    static TiaWaffle tiawaffle = new TiaWaffle();

    

    
    @FXML
    void changeVisibility(ActionEvent event){


        if(mycheckbox.isSelected()){
            mytextfieldpassword.setText(mypasswordfield.getText());
            mytextfieldpassword.setVisible(true);
            mypasswordfield.setVisible(false);
            return;
        }
        mypasswordfield.setText(mytextfieldpassword.getText());
        mypasswordfield.setVisible(true);
        mytextfieldpassword.setVisible(false);
}


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== long black ==================//

        longblack.setProductName("longblack");
        longblack.setProductPrice(25.00);
        longblack.setProductImage("images/img1.png");

        // ============== espresso ==================//

        espresso.setProductName("espresso");
        espresso.setProductPrice(85.00);
        espresso.setProductImage("images/img2.png");

        // ============== macchiato ==================//

        macchiato.setProductName("macchiato");
        macchiato.setProductPrice(150.00);
        macchiato.setProductImage("images/img3.png");

        // ============== cuppocino ==================//

        cuppocino.setProductName("cuppocino");
        cuppocino.setProductPrice(130.00);
        cuppocino.setProductImage("images/img4.png");

        // ============== vienna ==================//

        vienna.setProductName("vienna");
        vienna.setProductPrice(25.00);
        vienna.setProductImage("images/img5.png");

        // ============== icedcoffee ==================//

        icedcoffee.setProductName("iced coffee");
        icedcoffee.setProductPrice(85.00);
        icedcoffee.setProductImage("images/img6.png");

        // ============== cortado ==================//

        cortado.setProductName("cortado");
        cortado.setProductPrice(150.00);
        cortado.setProductImage("images/img7.png");

        // ============== breve ==================/

        breve.setProductName("breve");
        breve.setProductPrice(130.00);
        breve.setProductImage("images/img8.png");

        // ============== mocha ==================//

        mocha.setProductName("mocha");
        mocha.setProductPrice(25.00);
        mocha.setProductImage("images/img9.png");

        // ============== affogato ==================//

        affogato.setProductName("affogato");
        affogato.setProductPrice(85.00);
        affogato.setProductImage("images/img10.png");

        // ============== flatwhite ==================//
        flatwhite.setProductName("flatwhite");
        flatwhite.setProductPrice(150.00);
        flatwhite.setProductImage("images/img11.png");

        // ============== matchalatte ==================/
        matchalatte.setProductName("matchalatte");
        matchalatte.setProductPrice(130.00);
        matchalatte.setProductImage("images/img12.png");

           //////////////////beans//////////////////////////

           // ============== barakoeh  ==================/
           barakoeh.setProductName("barakoeh");
           barakoeh.setProductPrice(134.00);
           barakoeh.setProductImage("images/barakoeh.png");

            // ============== brobeans  ==================/

           brobeans.setProductName("brobeans");
           brobeans.setProductPrice(180.00);
           brobeans.setProductImage("images/brobeans.png");

           // ============== coffeellera  ==================/
           coffeellera.setProductName("coffeellera ");
           coffeellera.setProductPrice(160.00);
           coffeellera.setProductImage("images/img12.png");

           // ============== jordanbeans ==================/
            jordanbeans.setProductName("jordanbeans");
            jordanbeans.setProductPrice(120.00);
            jordanbeans.setProductImage("images/img12.png");

            // ============== mrbeans ==================/
            mrbeans.setProductName("mrbeans");
            mrbeans.setProductPrice(184.00);
            mrbeans.setProductImage("images/img12.png");

            //////////////////pastry//////////////////////////

            // ============== mrbeans ==================/

            mrbeans.setProductName("mrbeans");
            mrbeans.setProductPrice(184.00);
            mrbeans.setProductImage("images/img12.png");


            // ============== mrbeans ==================/
            mrbeans.setProductName("mrbeans");
            mrbeans.setProductPrice(184.00);
            mrbeans.setProductImage("images/img12.png");


           // ============== mrbeans ==================/
             mrbeans.setProductName("mrbeans");
             mrbeans.setProductPrice(184.00);
             mrbeans.setProductImage("images/img12.png");

            
           // ============== mrbeans ==================/
         mrbeans.setProductName("mrbeans");
         mrbeans.setProductPrice(184.00);
         mrbeans.setProductImage("images/img12.png");

           // ============== mrbeans ==================/
            mrbeans.setProductName("mrbeans");
            mrbeans.setProductPrice(184.00);
            mrbeans.setProductImage("images/img12.png");
            

        // TODO Auto-generated method stub

        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            homeRoot = loader.load();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());


    }

    public void login(ActionEvent event) throws IOException {
        

        String username = mytextfield.getText();
        String password = mypasswordfield.getText();
        

        if (username.equals("a") && password.equals("a")) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else {
            mywarninglabel.setVisible(true);
        }



    }
    


}
