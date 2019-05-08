package com.ioay.javasamples.modifiers;

public class Color {

    /*
     * final variables
     * */

    public static final int WHITE = 1111;
    public static final int BLACK = 0000;
    public static final int RED = 3333;

    public void paint(int colorPrefer) {
        switch (colorPrefer) {
            case 1111:
                System.out.println("Colored by WHITE");
                break;
            case 0000:
                System.out.println("Colored by BLACK");
                break;
            case 3333:
                System.out.println("Colored by RED");
                break;
            default:
                System.out.println("Unknown Color Type !");
                break;
        }
    }
}
