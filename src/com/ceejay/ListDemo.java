package com.ceejay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void show(){
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d");
        list.set(0,"op");
        list.contains("b");

        System.out.println(list);
    }
}
