package com.ioay.javasamples.collections.list.arraylist.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMain {

    public static void main(String args[]) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Length : " + fruits.size());

        System.out.println("Fruits name : " + fruits.get(1));

        fruits.add("Pineapple");

        fruits.remove("Banana");
        fruits.remove(1);

        fruits.set(1,"Avocado");

        fruits.add(1,"Banana");

        Collections.sort(fruits); // sort an array with collections sort method

        for (String fruit : fruits) {
            System.out.print(fruit + " - ");
        }
    }
}
