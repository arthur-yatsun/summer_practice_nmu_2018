import controller.Controller;
import forms.Form;

import java.awt.*;
import java.io.IOException;
import javax.swing.*;

public class Main {
    private static Controller controller = new Controller();

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Form();
            }
        });
//          controller.count();
//
//        controller.getArray1();
//
//        controller.getArray2();
//
//        try {
//            controller.files();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        controller.grafics();
}
}