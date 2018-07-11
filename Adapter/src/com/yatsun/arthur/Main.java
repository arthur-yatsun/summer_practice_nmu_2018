package com.yatsun.arthur;

import com.yatsun.arthur.adapter.PrinterAdapter;

import java.util.ArrayList;
import java.util.List;

/*
* Помогает двум разным интерфесам работать вместе
* Реализуется 2 способами: наследованием и композицией
*/
public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("text1");
        list.add("text2");
        list.add("text3");

        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.print(list);
    }
}
