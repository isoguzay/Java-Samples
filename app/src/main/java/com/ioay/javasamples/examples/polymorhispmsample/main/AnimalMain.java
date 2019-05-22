package com.ioay.javasamples.examples.polymorhispmsample.main;

import com.ioay.javasamples.examples.polymorhispmsample.model.Animal;
import com.ioay.javasamples.examples.polymorhispmsample.model.Cat;
import com.ioay.javasamples.examples.polymorhispmsample.model.Dog;
import com.ioay.javasamples.examples.polymorhispmsample.model.Mammal;

public class AnimalMain {

    public static void main(String args[]) {

        Animal animal = new Cat();
        animal.makeNoise();

        Animal animal1 = new Dog();
        animal1.makeNoise();

        Mammal mammal = new Cat();
        mammal.makeNoise();

        Animal animal2 = new Mammal();
        animal2.makeNoise();
    }
}
