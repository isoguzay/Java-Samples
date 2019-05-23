package com.ioay.javasamples.collections.set.hashset.main;

import java.util.HashSet;

public class HashSetMain {

    public static void main(String args[]){

        HashSet<String> cars = new HashSet<>();

        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("VW");

        cars.remove("BMW");

        cars.add("VW");

        for (String car : cars){
            System.out.print(car + " ");
        }
    }
}
