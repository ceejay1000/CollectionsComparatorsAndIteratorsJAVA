package com.ceejay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {

    public static void show(){
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        Collections.addAll(collection, "d","e", "f");
        Collection<String> newCollection = new ArrayList<>();
        var newCollect = collection.toArray(new String[0]);
        newCollection.addAll(collection);
        boolean hasA = collection.contains("a");

        System.out.println(Arrays.toString(newCollect));
        System.out.println(hasA);
        System.out.println(collection);
    }
}
