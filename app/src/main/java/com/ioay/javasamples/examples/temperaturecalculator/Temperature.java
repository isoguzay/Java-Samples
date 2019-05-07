package com.ioay.javasamples.examples.temperaturecalculator;

public class Temperature {

    int centigrade;
    double fahrenhiet;

    public double centigradeToFahrenhiet(int centigrade) {

        double fahrenhiet = (centigrade * 1.8) + 32;
        System.out.println("Fahrenhiet : " + fahrenhiet);
        return fahrenhiet;
    }
}
