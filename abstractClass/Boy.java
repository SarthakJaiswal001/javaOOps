package com.sarthak.java.abstractClass;

public class Boy extends Parent{
    public Boy(int age) {
        super(age);
        System.out.println(age);
    }
    String hisCareer;
     String herName;
    @Override
    void career(String nameOfCareer) {
            this.hisCareer=nameOfCareer;
    }

    @Override
    void name(String nameOfGirl) {
      this.herName=nameOfGirl;
    }
}
