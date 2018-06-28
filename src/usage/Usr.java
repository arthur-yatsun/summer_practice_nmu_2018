package usage;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by arthur on 25.06.18.
 */
abstract public class Usr {

    public abstract void count();

    public abstract void fill(double[] d);
    public abstract double composition(double d);
    public abstract void sum(double[] d);

    public abstract void solve(int[] b);

    public abstract void writeInFile() throws IOException;
    public abstract void readFromFile() throws IOException;

    public abstract double f1(double d);
    public abstract double f2(double d);
    public abstract double f3(double d);
    public abstract double f4(double d);
    public abstract double f5(double d);
    public abstract double f6(double d);
    public abstract double f7(double d);
    public abstract void display();

}

