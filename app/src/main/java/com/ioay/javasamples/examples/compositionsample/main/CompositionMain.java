package com.ioay.javasamples.examples.compositionsample.main;

import com.ioay.javasamples.examples.compositionsample.model.Address;
import com.ioay.javasamples.examples.compositionsample.model.Person;

public class CompositionMain {

    public static void main(String args[]){

        Address address = new Address("Berlin", "Mitte");

        Person person = new Person("isoguzay", 123456, address);

        System.out.println(person.getAddress().getCityName());  // using Composition sample
        System.out.println(person.getAddress().getCountyName());
        System.out.println(person.getPersonName());
        System.out.println(person.getPersonPhone());

    }
}
