package com.ioay.javasamples.examples.geometricanglecalculator;

import java.util.Scanner;

public class GeometricAngleCalculator {

    public static void main(String args[]){

        Geometric geometric = new Geometric();

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number of sides : ");

        int angle = geometric.numberOfSides=scan.nextInt();

        System.out.println("The result is " + geometric.calculateGeometricAngle(angle));
    }
}
