package com.ioay.javasamples.examples.internetpricecalculator;

public class Internet {

    int internetUsage;
    double internetFee;

    public double calculateInternetPrice(int internetUsage) {

        int overUsage = internetUsage - 50;

        if (internetUsage >= 50) {
            internetFee = 100 + (overUsage * 4);
        } else {
            internetFee = 100;
        }
        return internetFee;
    }
}
