package com.ioay.javasamples.examples.interfacesample.main;

import com.ioay.javasamples.examples.interfacesample.model.Apple;
import com.ioay.javasamples.examples.interfacesample.model.Chicken;
import com.ioay.javasamples.examples.interfacesample.model.Eatable;
import com.ioay.javasamples.examples.interfacesample.model.GreenApple;
import com.ioay.javasamples.examples.interfacesample.model.Lion;
import com.ioay.javasamples.examples.interfacesample.model.Squueezable;

public class InterfaceMain {

    public static void main(String args[]){

        Object lion = new Lion();

        Apple apple = new Apple();

        GreenApple greenApple = new GreenApple();

        Eatable chicken = new Chicken();

        Object[] objects = new Object[]{lion,apple,greenApple,chicken};

        for (Object o : objects){

            if(o instanceof Eatable){
                ((Eatable)o).howToEat();
            }
            else if(o instanceof Squueezable){
                ((Squueezable)o).howToSquueeze();
            }
        }

    }
}
