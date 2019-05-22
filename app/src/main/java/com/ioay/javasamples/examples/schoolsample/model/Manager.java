package com.ioay.javasamples.examples.schoolsample.model;

public class Manager extends Personal {

    public void bePromoted(Personal personal) {

        if (personal instanceof Teacher) {
            ((Teacher) personal).increaseSalary();
        } else if (personal instanceof Employee) {
            System.out.println("Employee doesnt get promote !");
        }
    }

    public void getJob(Personal personal) {
        personal.getJob();
    }

}
