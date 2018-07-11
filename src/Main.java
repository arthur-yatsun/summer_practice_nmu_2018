import controller.Controller;

import java.io.IOException;

public class Main {
    private static Controller controller = new Controller();
    public static void main(String[] args) {

        controller.count();

        controller.getArray1();

        controller.getArray2();

        try {
            controller.files();
        } catch (IOException e) {
            e.printStackTrace();
        }

        controller.grafics();
    }
}