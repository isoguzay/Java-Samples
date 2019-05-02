package com.ioay.javasamples;

import java.util.Scanner;

public class ScannerInputClass {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number for Sum with 5 : ");

        int value = scan.nextInt();

        int sum = value + 5;

        System.out.println("Total : " + sum);

        System.out.println("Hello, What is your name ?");

        String userName = scan.next();

        System.out.println("Nice to meet you, Sir " + userName);

        System.out.println("Excuse me, how old are you? ");

        int userAge = scan.nextInt();

        System.out.println("Hmm, you are \""+ userAge + "\" years old.");

        System.out.println("Do you have any children ? ");

        boolean isHave = scan.nextBoolean();

        System.out.println("You say me, " + isHave + " ha? Ok, thanks so much these informations.");

    }
}
