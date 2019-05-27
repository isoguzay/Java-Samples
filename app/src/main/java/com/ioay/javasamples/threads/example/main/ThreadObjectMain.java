package com.ioay.javasamples.threads.example.main;

import com.ioay.javasamples.threads.example.model.Student;

public class ThreadObjectMain {

    public static void main(String args[]) {

        Student student = new Student(1, "isoguzay");

        MyThread job1 = new MyThread("FirstJob", student);

        job1.run();

        MyThread job2 = new MyThread("SecondJob", student);

        job2.run();

    }


    static class MyThread extends Thread {

        public String jobName;
        private Student student;

        public MyThread(String jobName, Student student) {
            this.jobName = jobName;
            this.student = student;
        }

        @Override
        public void run() {
            student.getInfo(jobName);
        }
    }
}
