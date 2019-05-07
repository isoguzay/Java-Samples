package com.ioay.javasamples.examples.factorielnumberscalculator;

public class FactorialNumber {

    int factorialNumber;

    public int calculateFactorielNumber(int factorialNumber) {
        int result = 1;

        if (factorialNumber == 0) {
            result = 1;
        } else {
            for (int i = 1; i <= factorialNumber; i++) {
                result = result * i;
            }
        }

        return result;
    }
}
