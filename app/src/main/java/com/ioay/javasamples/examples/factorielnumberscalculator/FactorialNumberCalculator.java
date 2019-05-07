package com.ioay.javasamples.examples.factorielnumberscalculator;

import java.util.Scanner;

public class FactorialNumberCalculator {

    public static void main(String args[]) {

        FactorialNumber factorialNumber = new FactorialNumber();

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter a Value for Factoriel : ");

        factorialNumber.factorialNumber = scan.nextInt();

        int result = factorialNumber.calculateFactorielNumber(factorialNumber.factorialNumber);

        System.out.println("The result is " + result);

    }
}
