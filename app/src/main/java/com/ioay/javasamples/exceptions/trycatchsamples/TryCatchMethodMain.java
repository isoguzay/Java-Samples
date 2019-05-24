package com.ioay.javasamples.exceptions.trycatchsamples;

public class TryCatchMethodMain {

    public static void main(String args[]){

        Calculator calculator = new Calculator();

        try {
            calculator.divide(3,0);
        } catch (Exception e) {
           System.out.println("Error occured.");
        }
    }
}
