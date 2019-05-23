package com.ioay.javasamples.collections.list.arraylist.model;

public class Student implements Comparable<Student>{

    private int id;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*@Override
    public int compareTo(Student o) {
        return new Integer(this.id).compareTo(o.getId());
    }*/

    @Override
    public int compareTo(Student o) {
        return new String(this.name).compareTo(o.getName());
    }
}
