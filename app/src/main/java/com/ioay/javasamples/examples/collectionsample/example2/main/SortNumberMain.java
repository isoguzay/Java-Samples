package com.ioay.javasamples.examples.collectionsample.example2.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortNumberMain {

    public static void main(String args[]) {

        ArrayList<Integer> numbers = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            int randNumber = rand.nextInt(101);

            numbers.add(randNumber);
        }

        Collections.sort(numbers);

        for (Integer i : numbers){
            System.out.println(i);
        }

    }
}
