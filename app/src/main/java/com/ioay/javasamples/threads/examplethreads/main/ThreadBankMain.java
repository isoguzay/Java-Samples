package com.ioay.javasamples.threads.examplethreads.main;

import com.ioay.javasamples.threads.examplethreads.model.Bank;

public class ThreadBankMain {

    public static void main(String args[]) {

        Bank bank = new Bank(600);

        BankOperationsThread operation1 = new BankOperationsThread(bank, "iso", 500);
        BankOperationsThread operation2 = new BankOperationsThread(bank, "oguz", 600);
        operation1.start();
        operation2.start();
    }

    static class BankOperationsThread extends Thread {

        private Bank bank;
        private String accountName;
        private int cash;

        public BankOperationsThread(Bank bank, String account, int cash) {

            this.bank = bank;
            this.accountName = account;
            this.cash = cash;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                bank.getCash(accountName, cash);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
