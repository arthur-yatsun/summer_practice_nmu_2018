package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import usage.Lab5;

public class ControllLinear {

    private Lab5 l = new Lab5();
    private Label[][] labels = new Label[5][31];

    @FXML
    private GridPane grid;
    @FXML
    private Button solve;

    @FXML
    void initialize() {

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 31; j++) {
                labels[i][j] = new Label();
                grid.add(labels[i][j], i, j);
            }
        }

    solve.setOnAction(event -> {
        l.linear(labels);
    });

    }
}
