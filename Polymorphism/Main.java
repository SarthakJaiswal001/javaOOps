package com.sarthak.java.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Shapes circle=new Circle();
        Rectangle quad = new Rectangle();
        Circle c2=new Circle();
        shape.area();//this is determined at runtime which function area() will be called.
        circle.area();
        //This is called overriding when there are functions of same name in parent and child classes
        //area() function of that class will be called whose object has been created
        //in overriding the same function must also be present in parent class as well.
        //then only we can use reference variable of parent and object of child
        //POLYMORPHISM means many ways to represent
        //function overloading
        //like many constructors with different numbers of parameters and arguments can be created which is example of polymorphism
    }//adding final in function disables it from overriding
}//adding final in front of a class disables it from inheritance of any other thing
//static method cannot be overridden but can be inherited
//overriding depends on objects but static does not depend on object so static methods cannot be overridden
// overloading and override does not apply to instance variables