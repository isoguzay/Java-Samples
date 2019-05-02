package com.ioay.javasamples.samples;

public class ComparisonOperators {

    public static void main(String args[]) {

        int number1 = 35;
        int number2 = 45;

        boolean control = number1 == number2;

        System.out.println(number1 == number2); // return false

        System.out.println(number1 <= number2); // return true

        System.out.println(number1 > number2);

        /*
         * && -> And , || -> Or operations
         * && -> true, true -> true
         * && -> true, false -> false
         * && -> false, true -> false
         * && -> false, false -> false
         *
         * || -> true, true -> true
         * || -> true, false -> true
         * || -> false, true -> true
         * || -> false, false -> false
         * */

        System.out.println(number1 != number2 || number1>= number2); // true

        System.out.println(number1 == number2 && number1< number2); // false

        System.out.println(control);



    }
}
