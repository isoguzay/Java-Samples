package com.ioay.javasamples.samples;

import java.util.Scanner;

public class NameRepeaterLoopSample {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name : ");

        String name = scan.next();

        System.out.println("Define your repeater count : ");

        int count = scan.nextInt();

        for (int x = 0; x < count; x++) {
            System.out.println("Your name is " + name + " Count is " + (x+1));
        }
    }
}
