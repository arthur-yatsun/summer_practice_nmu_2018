package usage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by arthur on 10.07.18.
 */
public class Lab4 {

    private ArrayList<Integer> numbers = new ArrayList<Integer>();

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

    public void readFromFile() throws IOException {

        FileReader fr = new FileReader("src/files/h");
        Scanner sc = new Scanner(fr);

        while (sc.hasNextLine()){
            numbers.add(sc.nextInt());
        }
        System.out.println(numbers);

        fr.close();
    }
}
