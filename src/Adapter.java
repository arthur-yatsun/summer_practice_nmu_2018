import usage.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Adapter {

    private Lab1 lab1 = new Lab1();
    private Lab2 lab2 = new Lab2();
    private Lab3 lab3 = new Lab3();
    private Lab4 lab4 = new Lab4();
    private Lab5 lab5 = new Lab5();

    private double[] a = new double[15];
    private int[] b = new int[10];

    public void count(){
        lab1.count();
    }

    public void getArray1(){
        lab2.fill(a);
        lab2.sum(a);
    }

    public void getArray2(){
        lab3.solve(b);
    }

    public void files() throws IOException {
        lab4.readFromFile();
        lab4.writeInFile();
    }

    public void grafics(){
        lab5.display();
    }
}
