package com.cyan.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] array = new String[2];
        array[0] = "e1";
        array[1] = "e2";

        System.out.println(Arrays.toString(array));

        List<String> list = new ArrayList<>();

        list.add("e1");
        list.add("e2");
        list.add("e3");

        System.out.println(list);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
