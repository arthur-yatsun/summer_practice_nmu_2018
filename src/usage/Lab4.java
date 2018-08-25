package usage;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Lab4 {

    private static ArrayList<Integer> numbers = new ArrayList<Integer>();;

    public void writeInFile(Label label) throws IOException {

        FileWriter fw = new FileWriter("src/files/f");
        System.out.println(numbers);

        Set<Integer> hs = new HashSet<>();
        hs.addAll(numbers);
        numbers.clear();
        numbers.addAll(hs);


        for(int i = 0; i < numbers.size(); i++) {
            fw.write(numbers.get(i) + " ");
        }

        label.setText(String.valueOf(numbers));
        fw.close();
    }

    public void readFromFile(Label label) throws IOException {

        if(!numbers.isEmpty()){
            numbers.clear();
        }

        FileReader fr = new FileReader("src/files/h");
        Scanner sc = new Scanner(fr);

        while (sc.hasNextLine()){
            numbers.add(Integer.valueOf(sc.next()));
        }
        label.setText(String.valueOf(numbers));
        fr.close();
    }
}
