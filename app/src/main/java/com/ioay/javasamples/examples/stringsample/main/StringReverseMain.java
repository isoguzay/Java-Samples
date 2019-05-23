package com.ioay.javasamples.examples.stringsample.main;

import java.util.Scanner;

public class StringReverseMain {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your word! ");

        String word = scanner.next();

        int length = word.length();

        char[] array = new char[length];

        for (int i = 0; i < length; i++) {
            array[i] = word.charAt(i);
        }

        for (int i = (length - 1); i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
