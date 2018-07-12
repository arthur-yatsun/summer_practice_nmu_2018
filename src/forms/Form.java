package forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by arthur on 12.07.18.
 */
public class Form {

    public Form(){
        // создаем окно и устанавливаем его размер.
        JFrame jf = new JFrame("Практическая работа");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 300);
        jf.setVisible(true);

        JButton button1 = new JButton("Функциональные ряды");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Form1();
                jf.setVisible(false);
            }
        });

        JButton button2 = new JButton("Операции с массивам");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Form1();
                jf.setVisible(false);
            }
        });

        JButton button3 = new JButton("Сортировка массивов");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Form1();
                jf.setVisible(false);
            }
        });

        JButton button4 = new JButton("Операции с файлами");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Form1();
                jf.setVisible(false);
            }
        });

        JButton button5 = new JButton("Табулирование ф-ий");
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Form1();
                jf.setVisible(false);
            }
        });


        // создаем  панель.
        JPanel p = new JPanel();
        jf.add(p);

        // к панели добавляем менеджер FlowLayout.
        p.setLayout(new FlowLayout());

        // к панели добавляем кнопки.
        p.add(button1);
        p.add(button2);
        p.add(button3);
        p.add(button4);
        p.add(button5);
    }
}
