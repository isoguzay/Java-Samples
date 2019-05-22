package com.ioay.javasamples.examples.inheritanceanimalsample.main;

import com.ioay.javasamples.examples.inheritanceanimalsample.model.Animal;
import com.ioay.javasamples.examples.inheritanceanimalsample.model.Cat;
import com.ioay.javasamples.examples.inheritanceanimalsample.model.Dog;
import com.ioay.javasamples.examples.inheritanceanimalsample.model.Mammal;

public class AnimalMain {

    public static void main(String args[]) {

        Cat cat = new Cat();

        cat.makeNoise();

        Dog dog = new Dog();

        dog.makeNoise();

        Mammal mammal = new Mammal();

        mammal.makeNoise();

        Animal animal = new Animal();

        animal.makeNoise();

    }
}
