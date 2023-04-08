package com.sarthak.java.interfaceLearning;

public class Car implements Engine,Brakes,Accelerator{
    int a=1000;

    @Override
    public void stop() {
        System.out.println("the stop time of car at 200km/h is 3 seconds");
    }

    @Override
    public void braking() {
        System.out.println("the braking is fairly good");
    }

    @Override
    public void timeToBrake() {
        System.out.println("the time to brake is fast");
    }

    @Override
    public void start() {
        System.out.println("the start car time is normal instant");
    }


}
