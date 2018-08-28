package controllers.charts;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import usage.Lab5;

import java.io.IOException;

public class Charts {

    private Parent root = null;
    private Stage stage;

    @FXML
    private Button returnToMainWindow;
    @FXML
    private Button gr1;
    @FXML
    private Button gr2;
    @FXML
    private Button gr3;
    @FXML
    private Button gr4;
    @FXML
    private Button gr5;
    @FXML
    private Button gr6;
    @FXML
    private Button gr7;

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

        gr1.setOnAction(event -> {

            try {
                root = FXMLLoader.load(getClass().getResource("/models/charts/gr1.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });


        gr2.setOnAction(event -> {

            try {
                root = FXMLLoader.load(getClass().getResource("/models/charts/gr2.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });

    }
}
