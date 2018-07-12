package forms;

import javax.swing.*;
import java.awt.*;

/**
 * Created by arthur on 12.07.18.
 */
public class Form1 {
    // создаем окно и устанавливаем его размер.

    Form1() {

        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 300);
        jf.setVisible(true);

        // создаем  панель.
        JPanel p = new JPanel();
        jf.add(p);

        // к панели добавляем менеджер FlowLayout.
        p.setLayout(new FlowLayout());

        // к панели добавляем кнопки.
        p.add(new JButton("Функциональные ряды"));
        p.add(new JButton("Операции с массивам"));
        p.add(new JButton("Сортировка массивов"));
        p.add(new JButton("Операции с файлами"));
        p.add(new JButton("Табулирование ф-ий"));
    }
}
