package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import usage.Lab4;
import java.io.IOException;

public class Controller4 {

    private Parent root = null;
    private Stage stage;
    private Lab4 l = new Lab4();

    @FXML
    private Button returnToMainWindow;
    @FXML
    private Button task;
    @FXML
    private Button write;
    @FXML
    private Label textOut;
    @FXML
    private Label textIn;
    @FXML
    private Button read;

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
                root = FXMLLoader.load(getClass().getResource("/models/lab4/task.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });



        read.setOnAction(event -> {
            try {
                l.readFromFile(textOut);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        write.setOnAction(event -> {
            try {
                l.writeInFile(textIn);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
