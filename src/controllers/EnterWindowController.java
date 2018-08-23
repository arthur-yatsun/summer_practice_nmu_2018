package controllers;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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

    static FXMLLoader loader = new FXMLLoader();

    @FXML
    void initialize() {
        l1.setOnAction(event -> {
            l1.getScene().getWindow().hide();

            loader.setLocation(getClass().getResource("/models/model1.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root ));
            stage.showAndWait();
        });

        l2.setOnAction(event -> {
            l2.getScene().getWindow().hide();

            loader.setLocation(getClass().getResource("/models/model1.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root ));
            stage.showAndWait();
        });
    }
}