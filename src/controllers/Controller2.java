package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import usage.Lab2;

import java.io.IOException;

public class Controller2 {

    private Parent root = null;
    private Stage stage;
    Lab2 l = new Lab2();

    @FXML
    private Button returnToMainWindow;
    @FXML
    private Button task;
    @FXML
    private Button fillRandom;
    @FXML
    private Label array;
    @FXML
    private Button solve;
    @FXML
    private Label result;

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

        task.setOnAction(event -> {

            try {
                root = FXMLLoader.load(getClass().getResource("/models/lab2/task.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });

        fillRandom.setOnAction(event -> {
            l.fill(array);
        });

        solve.setOnAction(event -> {
            l.sum(result);
        });
    }
}
