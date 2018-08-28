package usage;

import javafx.scene.Parent;
import javafx.stage.Stage;

import static java.lang.Math.pow;

/**
 * Created by arthur on 28.08.18.
 */
public class Source {

    public static final String PATH = "/models/enterWindow.fxml";
    public static final String PATH_TO_LAB1 = "/models/lab1/model.fxml";
    public static final String PATH_TO_LAB2 = "/models/lab2/model.fxml";
    public static final String PATH_TO_LAB3 = "/models/lab3/model.fxml";
    public static final String PATH_TO_LAB4 = "/models/lab4/model.fxml";
    public static final String PATH_TO_LAB5 = "/models/lab5/model.fxml";

    public static final String PATH_TO_TASK1 = "/models/lab1/task.fxml";
    public static final String PATH_TO_TASK2 = "/models/lab2/task.fxml";
    public static final String PATH_TO_TASK3 = "/models/lab3/task.fxml";
    public static final String PATH_TO_TASK4 = "/models/lab4/task.fxml";
    public static final String PATH_TO_TASK5 = "/models/lab5/task.fxml";

    public static Parent root;
    public Stage stage;
    public static final double EPS = pow(10, -3);
}
