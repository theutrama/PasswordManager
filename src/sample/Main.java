package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mail.fxml"));

        primaryStage.setTitle("PasswordManager");
        primaryStage.setScene(new Scene(root, Color.BLACK));

        Image icon = new Image("shieldIcon.png");
        primaryStage.getIcons().add(icon);

        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
