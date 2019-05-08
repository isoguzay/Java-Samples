package com.ioay.javasamples.examples.internetpricecalculator;

import java.util.Scanner;

public class InternetPriceCalculator {

    public static void main(String args[]){

        Internet internet = new Internet();

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your internet usage by GB : ");

        internet.internetUsage = scan.nextInt();

        double totalFee = internet.calculateInternetPrice(internet.internetUsage);

        System.out.println("Your total fee is " + totalFee);

    }
}
