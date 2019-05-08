package com.ioay.javasamples.mainactivity;

import com.ioay.javasamples.modifiers.Personal;

public class PersonalMain {

    public static void main(String args[]){

        Personal personal = new Personal("iso",1,27);
        Personal personal2 = new Personal("oguz",2,28);
        Personal personal3 = new Personal();

        personal3.setPersonalName("isoguzay");
        personal3.setPersonalId(3);
        personal3.setPersonalAge(30);

        personal3.personalPassword = 123;

        Personal.personalUsername = "isoguzay";

        System.out.println(Personal.counter);
        System.out.println(Personal.personalUsername);
        System.out.println(personal3.personalPassword);


    }
}
