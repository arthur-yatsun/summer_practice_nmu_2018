package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import usage.Lab3;

import java.io.IOException;


public class Controller3 {

    private Parent root = null;
    private Stage stage;
    private Lab3 l = new Lab3();

    @FXML
    private Button returnToMainWindow;
    @FXML
    private Button task;
    @FXML
    private Button randomFill;
    @FXML
    private Button addNumber;
    @FXML
    private Button sort;
    @FXML
    private TextField newNumber;
    @FXML
    private Label array;

    @FXML
    void initialize() {

        task.setOnAction(event -> {

            try {
                root = FXMLLoader.load(getClass().getResource("/models/lab3/task.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });

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

        randomFill.setOnAction(event -> {
            l.writeIn(array);
        });

        addNumber.setOnAction(event -> {
            l.addNumber(array, newNumber);
        });

        sort.setOnAction(event -> {
            l.solve(array);
        });

    }
}
