package com.ioay.javasamples.samples;

public class Loops {

    public static void main(String args[]) {

        for (int i = 0; i < 4; i++) {
            System.out.println("Numbers : " + i);
        }


        int a = 0;

        while (a < 4) {
            System.out.println("Value of a : " + a);
            a++;
        }

        for (int b = 7; b <= 10; b++) {
            System.out.println("Value of b : " + b);
        }

        int c = 7;

        while (c < 10) {
            System.out.println("Value of c: " + c);
            c++;
        }

        for (int y = 0; y < 9; y += 2) {
            System.out.println("Value of y : " + y);
        }

        int e = 0;

        while (e < 9) {
            System.out.println("Value of e : " + e);
            e = e + 2;
        }

    }
}
