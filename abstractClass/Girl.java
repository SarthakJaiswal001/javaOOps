package com.sarthak.java.abstractClass;

public class Girl extends Parent{

   String theCareer;
    String girlsName;

    public Girl(int age) {
        super(age);
        System.out.println(age);
    }

    @Override
    void career(String nameOfCareer) {
     this.theCareer=nameOfCareer;
    }

    @Override
    void name(String nameOfGirl) {
this.girlsName=nameOfGirl;
    }
}
