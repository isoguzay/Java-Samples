package com.ioay.javasamples.samples;

import java.util.Scanner;

public class WhileOperations {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your value : ");

        int type = scan.nextInt();

        while (type >= 0) {
            System.out.println("Data : " + type);
            type--;
        }
    }
}
