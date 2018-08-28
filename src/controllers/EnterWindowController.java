package controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EnterWindowController {

    private Parent root = null;
    private Stage stage = new Stage();

    @FXML
    private Button l1;
    @FXML
    private Button l2;
    @FXML
    private Button l3;
    @FXML
    private Button l4;
    @FXML
    private Button l5;
    @FXML
    private Button chart;

    @FXML
    void initialize() {
        l1.setOnAction((ActionEvent event) -> {
            l1.getScene().getWindow().hide();

            try {
                root = FXMLLoader.load(getClass().getResource("/models/lab1/model.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            stage.setScene(new Scene(root));
            stage.show();
        });

        l2.setOnAction(event -> {
            l2.getScene().getWindow().hide();

            try {
                root = FXMLLoader.load(getClass().getResource("/models/lab2/model.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            stage.setScene(new Scene(root));
            stage.show();
        });

        l3.setOnAction(event -> {
            l3.getScene().getWindow().hide();

            try {
                root = FXMLLoader.load(getClass().getResource("/models/lab3/model.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            stage.setScene(new Scene(root));
            stage.show();
        });

        l4.setOnAction(event -> {
            l4.getScene().getWindow().hide();

            try {
                root = FXMLLoader.load(getClass().getResource("/models/lab4/model.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            stage.setScene(new Scene(root));
            stage.show();
        });

        l5.setOnAction(event -> {
            l5.getScene().getWindow().hide();

            try {
                root = FXMLLoader.load(getClass().getResource("/models/lab5/model.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            stage.setScene(new Scene(root));
            stage.show();
        });

        chart.setOnAction(event -> {
            chart.getScene().getWindow().hide();

            try {
                root = FXMLLoader.load(getClass().getResource("/models/charts/charts.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            stage.setScene(new Scene(root));
            stage.show();
        });

    }
}