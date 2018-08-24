package controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import usage.Lab1;

public class Controller1 {

    private Parent root = null;
    private Stage stage;
    private Label[][] labels = new Label[3][10];
    private Lab1 l = new Lab1();

    @FXML
    private GridPane results;
    @FXML
    private Button returnToMainWindow;
    @FXML
    private Button task;
    @FXML
    private Button minValue;
    @FXML
    private Button maxValue;
    @FXML
    private TextField nextValue;
    @FXML
    private Button nextValueResult;

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
                root = FXMLLoader.load(getClass().getResource("/models/lab1/task.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 10; j++) {
                labels[i][j] = new Label();
                results.add(labels[i][j], i, j);
            }
        }

        minValue.setOnAction(event -> {
            clean();
            l.countX1(labels);
        });

        maxValue.setOnAction(event -> {
            clean();
            l.countX2(labels);
        });

        nextValueResult.setOnAction(event -> {
            double x3 = Double.parseDouble(nextValue.getText());
            clean();
            l.countX3(labels, x3);
        });
    }

    private void clean() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 10; j++) {
                labels[i][j].setText("");
            }
        }
    }
}
