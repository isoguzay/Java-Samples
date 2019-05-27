package com.ioay.javasamples.threads.example.model;

public class Student {

    private int studentNo;
    private String studentName;

    public Student() {
    }

    public Student(int studentNo, String studentName) {
        this.studentNo = studentNo;
        this.studentName = studentName;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void getInfo(String jobName) {
        for (int i = 0; i < 100; i++) {
            System.out.println(jobName + " : " + i);
        }
    }

}
