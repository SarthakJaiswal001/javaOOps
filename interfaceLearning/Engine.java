package com.sarthak.java.interfaceLearning;

public interface Engine {
    //for interfaces
    //the functions and classes are abstract in it so the variables are static/final because we cannot create object.
    //abstract class can provide implementation of interface but interface cannot provide implementation of abstract class
    //members of java interface are public by default
    //in INTERFACE a single class can inherit multiple interfaces but in abstract class a class can extend single class.
//dynamic method dispatch
    //in interface two classes who are not even connected to each other can inherit same interface unlike in inheritance the child class knows about methods of parent class but parent class does not know about methods of child class.

    int speed=230;//by default this is static final
    void start();
    void stop();
}
