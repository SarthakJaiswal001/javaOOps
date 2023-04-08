package com.sarthak.java.interfaceLearning;

public class NiceCar {
    private Engine engine;
    private Accelerator a1=new AccelerateFast();
    public NiceCar(){
        engine=new ElectricEngine();
    }
    public NiceCar(Engine engine){
        this.engine=engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        a1.start();
    }
    public void stopMusic(){
        a1.stop();
    }
}
