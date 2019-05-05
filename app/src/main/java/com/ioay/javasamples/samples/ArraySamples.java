package com.ioay.javasamples.samples;

import java.util.Scanner;

public class ArraySamples {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        int inputs[] = new int[3];

        for (int i = 0; i < inputs.length; i++) {
            System.out.println((i + 1) + ") Enter number: ");
            int input = scan.nextInt();

            inputs[i] = input;
        }

        for (int number : inputs) {
            System.out.println(number);
        }

    }
}
