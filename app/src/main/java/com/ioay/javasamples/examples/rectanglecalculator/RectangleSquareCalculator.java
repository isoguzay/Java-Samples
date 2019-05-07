package com.ioay.javasamples.examples.rectanglecalculator;

import java.util.Scanner;

public class RectangleSquareCalculator {

    public static void main(String args[]) {

        Rectangle rectangle = new Rectangle();

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Rectangle Square Calculator ! \nPlease Enter Short Side Value : ");
        rectangle.shortSide = scan.nextInt();

        System.out.println("Please Enter Long Side Value : ");
        rectangle.longSide = scan.nextInt();

        double result = rectangle.calculateSquare(rectangle.shortSide, rectangle.longSide);

        System.out.println("The result is " + result);
    }
}
