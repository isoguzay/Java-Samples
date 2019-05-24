package com.ioay.javasamples.exceptions.trycatchsamples;

public class TryCatchMain {

    public static void main(String args[]) {

        int x = 5;
        int y = 1;

        int[] array = new int[2];

        try {
            System.out.println("Result : " + (x / y));
            System.out.println("Complete ");
            array[4] = 8;
        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                System.out.println("Numbers not divided by zero !");
            } else if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("Array index out of bounds exception !");
            }
        }
    }
}
