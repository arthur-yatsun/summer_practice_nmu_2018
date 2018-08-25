package usage;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Arrays;
import java.util.Collections;

public class Lab3 {

    private StringBuilder sb;
    private static Integer b[] = new Integer[10];
    private static Integer[] result = new Integer[b.length + 1];
    private Label label;

    public void addNumber(Label l, TextField t) {

        sb = new StringBuilder();
        for(int i = 0; i < b.length; i++) {
            result[i] = b[i];
            sb.append(b[i]).append(" ");
        }

        result[result.length - 1] = Integer.valueOf(t.getText());   //fill b as last element of array

        sb.append(result[result.length - 1]);
        l.setText(String.valueOf(sb));
    }

    public void solve(Label l) {

        Arrays.sort(result, Collections.reverseOrder()); // sort by descending

        sb = new StringBuilder();

        for (Integer aResult : result) {
            sb.append(aResult).append(" ");
        }

        l.setText(String.valueOf(sb));
    }

    public void writeIn(Label l){
        sb = new StringBuilder();
        for(int i = 0; i < 10; i++){
            b[i] = (int)(Math.random() * 51);
        }

        Arrays.sort(b, Collections.reverseOrder()); // sort by descending
        for(int i = 0; i < 10; i++){
            sb.append(b[i]).append(" ");
        }
        l.setText(String.valueOf(sb));
    }
}
