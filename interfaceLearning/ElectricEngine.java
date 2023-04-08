package com.sarthak.java.interfaceLearning;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("This is a upgraded electric engine");
    }

    @Override
    public void stop() {
        System.out.println("this system has high stopping power");
    }
}
