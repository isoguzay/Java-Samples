package com.ioay.javasamples.samples;

public class ArrayLoopSamples {

    public static void main(String args[]) {

        String cities[] = {"Istanbul", "Izmir",
                "Berlin", "Amsterdam", "Hamburg"};

        System.out.println("Hello, These are my favourite cities; \n");

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }

        String names[] = {"isoguzay", "Jack", "James", "Jones"};

        for (String s : names) {
            System.out.println(s);
        }

        int luckyNumbers[] = {1, 3, 7, 10, 23, 35};

        for (int i : luckyNumbers) {
            System.out.println(i);
        }

    }
}
