package com.ioay.javasamples.examples.lettersinwordcalculator;

public class Word {

    String word;
    char letter;

    public int letterInWord(String word, char letter) {

        int wordLength = word.length();

        char[] letters = new char[wordLength];

        for (int i = 0; i < wordLength; i++) {
            letters[i] = word.charAt(i);
        }

        int result = 0;

        for (int i = 0; i < wordLength; i++) {
            if (letters[i] == letter) {
                result++;
            }
        }
        return result;
    }
}
