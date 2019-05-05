package com.ioay.javasamples.samples;

import java.util.Arrays;

public class ArrayOperations {

    public static void main(String args[]) {

        int luckyNumbers[] = new int[6];

        luckyNumbers[0] = 34;
        luckyNumbers[1] = 35;
        luckyNumbers[3] = 75;

        System.out.println(Arrays.toString(luckyNumbers));

        String [] luckyDays = {"Saturday", "Monday"};

        System.out.println(luckyDays[1]);

        luckyDays[1] = "Wednesday";

        System.out.println(Arrays.toString(luckyDays));


    }
}
