package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add(6);
        collection.add(7);
        collection.add(8);
        collection.add(9);
        collection.add(10);
        collection.add(10);

        System.out.println(collection);
        for(int i = collection.size(); i >= 0; i --) {
            if (i >= 0) {
                collection.remove(i);
            }

        }
        System.out.println(collection);
    }
}
