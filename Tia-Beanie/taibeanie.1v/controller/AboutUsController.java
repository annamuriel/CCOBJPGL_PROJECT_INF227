package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class AboutUsController  {

    @FXML
    ImageView aboutus;

    @FXML
    Button backtohome;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    FXMLLoader loader;

    // Goes to Home.fxml
    public void menu (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Menu.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}