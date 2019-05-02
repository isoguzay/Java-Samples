package com.ioay.javasamples;

public class TypeConversionsClass {

    public static void main(String args[]){

        double x = 35.34;
        long y = (long) x;
        int a = (int) y;

        System.out.println("x : " + x + "\ny : " + y + "\na : " + a);

        int b = 34;
        long c = (long) b;
        double d = (double) c;

        System.out.println("b : " + b + "\nc : " + c + "\nd : " + d);

        String word = "7";
        int number = 35;

        word = String.valueOf(number);
        number = Integer.valueOf(word);

        int number2 = 10;
        word = Integer.toString(number2);

        int sum = number + Integer.valueOf(word);

        System.out.println("Word : " + word + "\nNumber : " + number + "\nSum : " + sum);
    }
}
