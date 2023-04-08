package com.sarthak.java.interfaceLearning;

public class AccelerateFast implements Accelerator{
    @Override
    public void start() {
        System.out.println("this accelerates fast");
    }

    @Override
    public void stop() {
        System.out.println("this stops fast");
    }
}
