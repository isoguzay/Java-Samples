package com.ioay.javasamples.examples.rectanglecalculator;

public class Rectangle {

    int shortSide, longSide;  // global variables

    public double calculateSquare(int shortSide, int longSide) { // local variables

        double result = shortSide * longSide;

        return result;
    }
}
