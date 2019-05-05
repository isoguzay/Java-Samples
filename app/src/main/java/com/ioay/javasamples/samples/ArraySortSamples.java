package com.ioay.javasamples.samples;

import java.util.Arrays;

public class ArraySortSamples {

    public static void main(String args[]) {

        String cities[] = {"Izmir", "Hamburg", "Zurich"};

        for (String city : cities) {
            System.out.println(city);
        }

        Arrays.sort(cities);

        for (String sort : cities) {
            System.out.println(sort);
        }

        int luckyNumbers[] = {17, 3, 5, 23, 7, 19};

        Arrays.sort(luckyNumbers);

        for (int i : luckyNumbers) {
            System.out.println(i);
        }

    }
}
