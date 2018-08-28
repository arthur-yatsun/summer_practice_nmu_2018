package usage;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

import static usage.Source.root;

public class Handler {

    public void getWindow(Button button, String path) {
        button.setOnAction(event -> {

            if(!path.contains("task")) {
                button.getScene().getWindow().hide();
            }
            try {
                root = FXMLLoader.load(getClass().getResource(path));
            } catch (IOException e) {
                e.printStackTrace();
            }

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });
    }
}
