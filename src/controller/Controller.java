package controller;

import usage.Executor;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by arthur on 18.06.18.
 */
public class Controller {

    private Executor ex = new Executor();

    private double[] a = new double[15];
    private int[] b = new int[10];

    public void getArray1(){
        ex.fill(a);     //заполнение массива
        ex.sum(a);      //подсчет
    }

    public void getArray2(){
        ex.solve(b);
    }

    public void files() throws IOException {
        ex.readFromFile();
        ex.writeInFile();
    }
    public void grafics(){
        ex.display();
    }
}
