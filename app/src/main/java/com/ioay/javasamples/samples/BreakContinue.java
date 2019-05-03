package com.ioay.javasamples.samples;

public class BreakContinue {

    public static void main(String args[]) {

        for (int i = 0; i < 6; i++) {
            if(i == 3){
                continue;
            }
            System.out.println("Index value : " + i);
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("Index value : " + i);
            if(i == 3){
                break;
            }
        }
    }
}
