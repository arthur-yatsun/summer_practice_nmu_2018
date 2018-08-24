package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Controller1 {

    private Parent root = null;
    private Stage stage;
    private Label[][] labels = new Label[3][10];

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
    private Button cleanUp;

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
            FXMLLoader loader = new FXMLLoader();

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
//                labels[i][j].setText("a");
            }
        }

    }
}
