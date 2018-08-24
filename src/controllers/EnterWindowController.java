package controllers;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EnterWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button l3;

    @FXML
    private Button l1;

    @FXML
    private Button l2;

    @FXML
    private Button l4;

    @FXML
    private Button l5;

    @FXML
    void initialize() {
        l1.setOnAction((ActionEvent event) -> {
            l1.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();

            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("/models/lab1/model.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            Stage stage = new Stage();

            stage.setScene(new Scene(root));
            stage.showAndWait();
        });


    }
}