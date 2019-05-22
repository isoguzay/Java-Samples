package com.ioay.javasamples.examples.stringsample.main;

public class StringMain {

    public static void main(String args[]) {

        String s1 = "Hello World!";

        String s2 = s1;

        String s3 = "Hello World!";

        String s4 = "Hello ";

        String s5 = s4 + "World!";

        String s6 = new String("Hello World!");

        if (s1 == s5) {
            System.out.println("Equal ! ");
        } else {
            System.out.println("Not Equal ! ");
        }

        String s7 = "Hello";
        String s8 = "HELLO";

        if (s7.equalsIgnoreCase(s8)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        /*
         * More performance with string usages
         * */

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("hello");
        stringBuilder.append(" world");
        System.out.println(stringBuilder.toString());

    }
}
