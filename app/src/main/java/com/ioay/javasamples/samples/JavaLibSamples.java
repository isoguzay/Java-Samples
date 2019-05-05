package com.ioay.javasamples.samples;

import java.util.Random;

public class JavaLibSamples {

    public static void main(String args[]) {

        int a = -10;


        System.out.println("Absolute value : " + Math.abs(a));
        System.out.println("Value of Pi number : " + Math.PI);
        System.out.println("Exponential number : " + Math.pow(2.0, 5.0));
        System.out.println("Root numbers : " + Math.sqrt(25));

        Random rand = new Random();

        int i = rand.nextInt(5);

        System.out.println(i);

        for (int j = 0; j < 5; j++) {
            int randomNumber = rand.nextInt(10);
            System.out.println(randomNumber);
        }

    }
}
