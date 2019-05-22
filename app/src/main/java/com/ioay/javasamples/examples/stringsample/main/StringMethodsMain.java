package com.ioay.javasamples.examples.stringsample.main;

public class StringMethodsMain {

    public static void main(String args[]) {

        String s1 = "   isoguzay hello world   ";

        System.out.println(s1.charAt(3)); //begins with 0 to n..
        System.out.println(s1.length());
        System.out.println(s1.replace('i', 'I'));
        System.out.println(s1.substring(0, 3));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());

        String[] array = s1.split(" ");

        for (String s : array) {
            System.out.println(s);
        }
    }
}
