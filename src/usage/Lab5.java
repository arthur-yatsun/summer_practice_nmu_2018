package usage;

import static java.lang.Math.*;
import static java.lang.Math.PI;
import static java.lang.Math.sin;
import static util.Print.println;

/**
 * Created by arthur on 10.07.18.
 */
public class Lab5 {

    public double f1(double x){
        return 1/((x*x) * pow(1 + x*x, 2));
    }

    public double f2(double x){
        return pow(x, 4) / (sqrt(1 + x*x));
    }

    public double f3(double x){
        return 1/(pow(1 + pow(sin(x), 2), 1/4));
    }

    public double f4(double x){
        return 1/ (x*x*pow(E , x));
    }

    public double f5(double x){
        return (Math.cosh(x) - 1) / x;
    }

    public double f6(double x){
        return (1 - x) / pow(log(x), 2);
    }

    public double f7(double x){
        return 1 /(sinh(x) + sin(x));
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
            println("");
            x += 0.1;
        }

        println("----------------------------------------------------------------------------");

        double[] r  = {PI/3, PI/4, 2*PI/3, PI};
        for (double aR : r) {
            System.out.printf("%-22.3f %-22.3f %-22.3f %-22.3f %-22.3f",
                    aR, f1(aR), f2(aR), f4(aR), f6(aR));
            println("");
        }
    }
}
