package usage;

import javafx.scene.control.Label;
import static java.lang.Math.*;

public class Lab1 {

    private static final double EPS = pow(10, -3);

    public void countX1(Label[][] labels) {
        double x1 = 0.2;
        x(x1, labels);
    }

    public void countX2(Label[][] labels) {
        double x2 = 1.0;
        x(x2, labels);
    }

    public void countX3(Label[][] labels, double usersNumber) {
        x(usersNumber, labels);
    }

    private void x(double x, Label[][] labels){
        double s = 0;
        int i = 0;
        double sum = 0;
        do {
            s += pow((x-1)/(x+1),2*i+1)/(2*i+1);
            sum = f(x) - s;

            labels[0][i].setText(String.valueOf(i));
            labels[1][i].setText(String.valueOf(s));
            labels[2][i].setText(String.valueOf(f(x)));
            i++;

        } while (abs(sum) >= Source.EPS);
    }

    private double f(double x){
        return (double)1/2 * log(x);
    }
}
