package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLOutput;

public class Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField emailTextField;
    @FXML
    private TextField loginTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private TextField linkTextField;


    public void switchToNewEntryScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("newEntry.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToMainScene(ActionEvent event) throws IOException {

        String email = emailTextField.getText();
        String login = loginTextField.getText();
        String password = passwordTextField.getText();
        String link = linkTextField.getText();


        if(!email.isEmpty() && !login.isEmpty() && !password.isEmpty() && !link.isEmpty()){



            Parent root = FXMLLoader.load(getClass().getResource("mail.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("No Entry created !");
            alert.setContentText("You have to fill out every property!");

            alert.showAndWait();
        }
    }
}
