package com.ioay.javasamples.samples;

import java.util.Scanner;

public class SwitchMenu {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("1) Delete");
        System.out.println("2) Update");
        System.out.println("3) Backup");

        int type = scan.nextInt();

        switch (type){
            case 1:
                System.out.println("Data deleted.");
                break;
            case 2:
                System.out.println("Data updated.");
                break;
            case 3:
                System.out.println("Data backup success.");
                break;
            default:
                System.out.println("None type");
                break;
        }
    }
}
