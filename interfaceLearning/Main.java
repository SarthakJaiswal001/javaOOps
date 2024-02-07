package com.sarthak.java.interfaceLearning;

import javax.print.attribute.standard.Media;

public class Main {
    public static void main(String[] args) {
     //   Engine car=new Car();

       // car.start();car.stop();//it decides at runtime which method to be run
// Car.a;
        //Accelerator fast=new Car() ;
        //fast.start();
        //fast.stop();
        NiceCar mstCar=new NiceCar();
mstCar.start();
mstCar.stop();
mstCar.startMusic();
mstCar.stopMusic();

    }
}
//in interface methods are always abstract and variables can be final or static
//interface allows multiple inheritance
//a class maintains information using an instance variable but the interface does not
//cannot create objects of interface
//interface vs abstract
// interface only has abstract methods whereas abstract classes can have both abstract and normal methods.
//in abstract classes we cannot create abstract constructors
//interfaces can have default and static methods as well
//in interfaces variables are final whereas in abstract classes they can be final or nonfinal
//in the interface the variables are final because if we don't have constructors then it can't be initialized, so final variables are compulsory to initialize.
//abstract classes can provide an implementation of the interface but the interface cannot provide an implementation of an abstract class.
//in the interface we can use public only

