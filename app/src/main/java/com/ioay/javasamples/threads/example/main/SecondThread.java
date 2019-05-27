package com.ioay.javasamples.threads.example.main;

public class SecondThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Second Thread : " + i);
        }
    }
}
