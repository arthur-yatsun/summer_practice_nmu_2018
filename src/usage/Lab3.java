package usage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static util.Print.print;
import static util.Print.println;

public class Lab3 {

    private Scanner scanner = new Scanner(System.in);

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
}
