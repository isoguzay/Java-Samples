package com.ioay.javasamples.examples.lettersinwordcalculator;

import java.util.Scanner;

public class WordLetterCalculator {

    public static void main(String args[]) {

        Word word = new Word();

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word : ");

        word.word = scan.next();

        System.out.println("Please enter a letter for your word : ");

        word.letter = scan.next().charAt(0); // get 0. char value

        int result = word.letterInWord(word.word, word.letter);

        System.out.println("Letter counts in your word : " + result);

    }
}

