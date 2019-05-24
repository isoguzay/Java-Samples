package com.ioay.javasamples.examples.collectionsample.example4.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberMain {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        Random rand = new Random();

        int number = rand.nextInt(101);

        System.out.println("Rand number is : " + number);

        ArrayList<Integer> guessList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            System.out.println("Please enter " + (i + 1) + ". guess number for finding secret number ! ");
            int userGuess = scan.nextInt();

            guessList.add(userGuess);

            if (userGuess == number) {
                System.out.println("Congratulations, you know number !");
                break;
            } else if (userGuess > number) {
                System.out.println("Decrease your guess");
            } else if (userGuess < number) {
                System.out.println("Increase your guess");
            }
        }

        System.out.println(" \n------------------- ");
        System.out.println(" The Result :");
        System.out.println("Your Guess numbers : ");

        for (Integer i : guessList) {
            System.out.print(i + " - ");
        }
    }
}
