package usage;

import javafx.scene.control.Label;

import java.util.Scanner;

import static java.lang.Math.*;
import static util.Print.println;

public class Lab1 {

    Scanner scanner = new Scanner(System.in);

    private final int n = 10;
    private final double eps = pow(10, -3);
    private double sum = 0;

    private final double x1 = 0.2;
    private final double x2 = 1.0;

    public void countX1(Label[][] labels) {
        x(x1, labels);
    }

    public void countX2(Label[][] labels) {
        x(x2, labels);
    }

    public void countX3(Label[][] labels, double usersNumber) {
        x(usersNumber, labels);
    }


    private void x(double x, Label[][] labels){
        double s = 0;
        int i = 0;
        do {
            s += pow((x-1)/(x+1),2*i+1)/(2*i+1);
            sum = f(x) - s;
            println("i=" + i + " s=" + s + " y=" + f(x));
            i++;
        } while (abs(sum) >= eps);
    }

    private double f(double x){
        return (double)1/2 * log(x);
    }
}
