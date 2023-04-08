package com.sarthak.java.interfaceLearning;

public class BrakesSlower implements Brakes{
    @Override
    public void braking() {
        System.out.println("this has upgraded versions of braking");
    }

    @Override
    public void timeToBrake() {
        System.out.println("its braking time is much less");
    }
}
