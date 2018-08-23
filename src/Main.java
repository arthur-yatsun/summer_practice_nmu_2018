import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    private static Adapter controller = new Adapter();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("models/enterWindow.fxml"));
        primaryStage.setScene(new Scene(root, 601, 394 ));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
//      controllers.count();
//
//        controllers.getArray1();
//
//        controllers.getArray2();
//
//        try {
//            controllers.files();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        controller.grafics();
    }
}