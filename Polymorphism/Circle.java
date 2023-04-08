package com.sarthak.java.Polymorphism;

public class Circle extends Shapes {
    @Override
    //This is called overriding when there are functions of same name in parent and child classes

    public void area(){
        System.out.println("pi*r*r");
    }

}
