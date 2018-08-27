package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller5 {

    private Parent root = null;
    private Stage stage;

    @FXML
    private Button returnToMainWindow;
    @FXML
    private Button trigonometry;
    @FXML
    private Button linear;

    @FXML
    void initialize() {
        returnToMainWindow.setOnAction(event -> {
            returnToMainWindow.getScene().getWindow().hide();
            try {
                root = FXMLLoader.load(getClass().getResource("/models/enterWindow.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });

        trigonometry.setOnAction(event -> {
            try {
                root = FXMLLoader.load(getClass().getResource("/models/lab5/trigonometry.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });

        linear.setOnAction(event -> {
            try {
                root = FXMLLoader.load(getClass().getResource("/models/lab5/linear.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });
    }

    class ControllLinear {

    }
}
