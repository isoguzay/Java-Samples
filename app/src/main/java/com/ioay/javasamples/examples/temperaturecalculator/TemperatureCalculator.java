package com.ioay.javasamples.examples.temperaturecalculator;

import java.util.Scanner;

public class TemperatureCalculator {

    public static void main(String args[]) {

        Temperature temperature = new Temperature();

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter temperature centigrade : ");

        temperature.centigrade = scan.nextInt();

        temperature.centigradeToFahrenhiet(temperature.centigrade);

    }
}
