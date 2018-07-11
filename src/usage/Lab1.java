package usage;

import java.util.Scanner;

import static java.lang.Math.*;
import static util.Print.println;

public class Lab1 {

    Scanner scanner = new Scanner(System.in);

    final int n = 10;
    final double eps = pow(10, -3);
    double sum = 0;

    public void count() {
        println("Enter x3 form 0.2 to 1.0 : ");
        final double x3 = scanner.nextDouble();
        final double x2 = 1.0;
        final double x1 = 0.2;

        println("x1 = " + x1);
        x(x1);
        println("x2 = " + x2);
        x(x2);
        println("x3 = " + x3);
        x(x3);
    }

    private void x(double x){
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
