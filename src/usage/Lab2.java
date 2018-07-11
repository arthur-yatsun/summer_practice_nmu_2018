package usage;

import static util.Print.println;

/**
 * Created by arthur on 10.07.18.
 */
public class Lab2 {

    public void fill(double[] d) {
        println("Enter 15 elements of array: ");
        for(int i = 0; i < 15; i++){
            d[i] = (Math.random() * 10);
            println(d[i] + " ");
        }
    }

    public double composition(double d) {
        double result = 0;
        double b = 1.0;
        for(int i = 0; i < 10; i++){
            result = (d + b)/2;
            i++;
            b += 0.1;
        }
        return result;
    }


    public void sum(double[] d) {
        double result = 0;
        for(int i = 0; i < 15; i++){
            result += composition(d[i]);
            i++;
        }
        println("Result : " + result);
    }
}
