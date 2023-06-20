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
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.animation.*;
  

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
    MenuController menuController = null;

    @FXML
    HomeController  homeController = null;

    @FXML
    CheckoutController checkoutController;
    
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
    public void initialize(URL arg0, ResourceBundle arg1) {

        // rotate
  RotateTransition rotate = new RotateTransition();
      rotate.setNode(Pug);
      rotate.setDuration(Duration.millis(2000));
      rotate.setCycleCount(TranslateTransition.INDEFINITE);
      rotate.setInterpolator(Interpolator.LINEAR);
      rotate.setByAngle(10);
      rotate.setAxis(Rotate.X_AXIS);
      rotate.play();
    
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
