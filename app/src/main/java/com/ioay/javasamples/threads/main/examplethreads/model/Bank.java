package com.ioay.javasamples.threads.main.examplethreads.model;

public class Bank {

    private int myAccountCash;

    public Bank() {
    }

    public Bank(int myAccountCash) {
        this.myAccountCash = myAccountCash;
    }

    public int getMyAccountCash() {
        return myAccountCash;
    }

    public void setMyAccountCash(int myAccountCash) {
        this.myAccountCash = myAccountCash;
    }

    public synchronized void getCash(String accountName, int cash){

        if (cash > myAccountCash){
            System.out.println(accountName + " : No money cash your account! ");

        }else {
            myAccountCash = myAccountCash - cash;
            System.out.println(accountName + " : Your money : " + myAccountCash);
        }
    }
}
