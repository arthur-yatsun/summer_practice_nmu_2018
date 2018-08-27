package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import usage.Lab5;

/**
 * Created by arthur on 28.08.18.
 */
public class ControllTrig {

    private Label[][] labels = new Label[4][4];
    private Lab5 l = new Lab5();

    @FXML
    private GridPane grid;

    @FXML
    void initialize() {
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++){
                labels[i][j] = new Label();
                grid.add(labels[i][j], i, j);
            }
        }

        l.trig(labels);
    }
}
