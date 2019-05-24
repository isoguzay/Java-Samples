package com.ioay.javasamples.threads.main;

public class ThreadMain {

    public static void main(String args[]) {

        FirstThread firstThread = new FirstThread();

        /*
        * when call with start method Threads, multitasking running
        * */

        firstThread.start();

        Thread secondThread = new Thread(new SecondThread());

        secondThread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Main : " + i);
        }
    }

    static class FirstThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("First Thread : " + i);
            }
        }
    }

}
