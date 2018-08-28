package usage;

import javafx.scene.control.Label;
import static java.lang.Math.*;
import static java.lang.Math.PI;
import static java.lang.Math.sin;

public class Lab5 {

    public static double f1(double x){
        return 1/((x*x) * pow(1 + x*x, 2));
    }

    public static double f2(double x){
        return pow(x, 4) / (sqrt(1 + x*x));
    }

    public static double f3(double x){
        return 1/(pow(1 + pow(sin(x), 2), 1/4));
    }

    public static double f4(double x){
        return 1/ (x*x*pow(E , x));
    }

    public static double f5(double x){
        return (Math.cosh(x) - 1) / x;
    }

    public static double f6(double x){
        return (1 - x) / (pow(log(x), 2));
    }

    public static double f7(double x){
        return 1 /(sinh(x) + sin(x));
    }

    public void linear(Label[][] labels) {
        double x = 0.0;
        int i = 0;
        while (x < 3.1){

            if (f1(x) == Double.POSITIVE_INFINITY || f1(x) == Double.NEGATIVE_INFINITY){
                labels[0][i].setText(String.valueOf(x));
                labels[1][i].setText(String.valueOf("Разрыв"));
                labels[2][i].setText(String.valueOf(f2(x)));
                labels[3][i].setText(String.valueOf("Разрыв"));
                labels[4][i].setText(String.valueOf(f6(x)));

            } else {
                labels[0][i].setText(String.valueOf(x));
                labels[1][i].setText(String.valueOf(f1(x)));
                labels[2][i].setText(String.valueOf(f2(x)));
                labels[3][i].setText(String.valueOf(f4(x)));
                labels[4][i].setText(String.valueOf(f6(x)));
            }
            x += 0.1;
            i++;
        }
    }

    public void trig(Label[][] labels) {
        double[] r  = {PI/3, PI/4, 2*PI/3, PI};
        for (int i = 0; i < r.length; i++) {
            labels[0][i].setText(String.valueOf(r[i]));
            labels[1][i].setText(String.valueOf(f3(r[i])));
            labels[2][i].setText(String.valueOf(f5(r[i])));
            labels[3][i].setText(String.valueOf(f7(r[i])));
        }
    }

    public void display() {
        double x = 0.0;
        while (x < 3.1){

            if (f1(x) == Double.POSITIVE_INFINITY || f1(x) == Double.NEGATIVE_INFINITY){
                System.out.printf("%-22.1f %-22s %-22.3f %-22s %-22.3f",
                        x, "Разрыв", f2(x), "Разрыв",f6(x));
            } else {

                System.out.printf("%-22.1f %-22.3f %-22.3f %-22.3f %-22.3f",
                        x, f1(x), f2(x), f4(x), f6(x));
            }

            x += 0.1;
        }



        double[] r  = {PI/3, PI/4, 2*PI/3, PI};
        for (double aR : r) {
            System.out.println(aR + " " + f3(aR) + " " + f5(aR) + " " + f7(aR));

        }
    }
}
