package usage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static java.lang.Math.*;
import static util.Print.*;

public class Executor extends Usr {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Integer> numbers = new ArrayList<Integer>();

//---------------------------------lab1------------------------------------\\

    @Override
    public void count() {

    }

//---------------------------------lab2------------------------------------\\
    @Override
    public void fill(double[] d) {
        println("Enter 15 elements of array: ");
        for(int i = 0; i < 15; i++){
            d[i] = (Math.random() * 10);
            println(d[i] + " ");
        }
    }

    @Override
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

    @Override
    public void sum(double[] d) {
        double result = 0;
        for(int i = 0; i < 15; i++){
            result += composition(d[i]);
            i++;
        }
        println("Result : " + result);
    }
//---------------------------------lab3------------------------------------\\
    @Override
    public void solve(int[] b) {

        Integer[] result = new Integer[b.length + 1];
        writeIn(b); // write random numbers

        for(int i = 0; i < b.length; i++){
            result[i] = b[i];
            print(b[i] + " ");
        }

        println("Enter b: ");
        result[result.length - 1] = scanner.nextInt();   //fill b as last element of array

        Arrays.sort(result, Collections.reverseOrder()); // sort by descending

        show(result);
    }

    private void writeIn(int[] a){
        for(int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random() * 51); //from 1 till 50
        }
    }

    private void show(Integer[] result){
        for(int i = 0; i < result.length; i++){
            print(result[i] + " ");
        }
    }
//---------------------------------lab4------------------------------------\\
    @Override
    public void writeInFile() throws IOException {
        FileWriter fw = new FileWriter("src/files/f");

        for(int i = 0; i < numbers.size(); i++) {
            for(int k = i + 1; k < numbers.size(); k++){
                if(Objects.equals(numbers.get(i), numbers.get(k))){
                    numbers.remove(k);
                }
            }
        }
        System.out.println(numbers);

        for(int i = 0; i < numbers.size(); i++){
            fw.write(String.valueOf(numbers.get(i)) + " ");
        }
        fw.close();
    }

    @Override
    public void readFromFile() throws IOException {

        FileReader fr = new FileReader("src/files/h");
        Scanner sc = new Scanner(fr);

        while (sc.hasNextLine()){
            numbers.add(sc.nextInt());
        }
        System.out.println(numbers);

        fr.close();
    }
//---------------------------------lab4------------------------------------\\
    @Override
    public double f1(double x){
        return 1/((x*x) * pow(1 + x*x, 2));
    }

    @Override
    public double f2(double x){
        return pow(x, 4) / (sqrt(1 + x*x));
    }

    @Override
    public double f3(double x){
        return 1/(pow(1 + pow(sin(x), 2), 1/4));
    }

    @Override
    public double f4(double x){
        return 1/ (x*x*pow(E , x));
    }

    @Override
    public double f5(double x){
        return (Math.cosh(x) - 1) / x;
    }

    @Override
    public double f6(double x){
        return (1 - x) / pow(log(x), 2);
    }

    @Override
    public double f7(double x){
        return 1 /(sinh(x) + sin(x));
    }

    @Override
    public void display() {
        double x = 0.0;

        while (x <= 3.0){
            System.out.printf("%-22.3f %-22.3f %-22.3f %-22.3f %-22.3f %-22.3f %-22.3f",
                    f1(x), f2(x), f3(x), f4(x),f5(x),f6(x),f7(x));
            System.out.println();
            x += 0.1;
        }
    }
}