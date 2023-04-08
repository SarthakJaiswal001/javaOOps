package com.sarthak.java.a;
//Singleton classes are those classes which can create only one object
public class Singleton {

    public static Singleton instance;//this is an object
    public static Singleton getInstance(){
        if(instance==null){
            instance =new Singleton();
        }
        return instance;
    }
}
