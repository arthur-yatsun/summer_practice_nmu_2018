package usage;

import javafx.scene.control.Label;

public class Lab2 {

    private int[] d = new int[15];
    private StringBuilder sb;

    public void fill(Label l) {
        sb = new StringBuilder();
        for(int i = 0; i < 15; i++){
            d[i] = (int)(Math.random() * 100);
            sb.append(d[i]).append(" ");
        }
        l.setText(String.valueOf(sb));
    }

    public void sum(Label l) {
        double result = 0;
        for(int i = 0; i < 15; i++){
            result += composition(d[i]);
            i++;
        }
        l.setText(String.valueOf(result));
    }

    private double composition(double d) {
        double result = 0;
        double b = 1.0;
        for(int i = 0; i < 10; i++){
            result = (d + b)/2;
            i++;
            b += 0.1;
        }
        return result;
    }
}
