package com.ioay.javasamples.examples.geometricanglecalculator;

public class Geometric {

    int numberOfSides;


    public int calculateGeometricAngle(int numberOfSides) {

        int angle = (numberOfSides - 2) * 180;

        return angle;
    }
}
