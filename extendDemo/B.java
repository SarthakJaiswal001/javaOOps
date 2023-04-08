package com.sarthak.java.extendDemo;

public interface B extends A{
    public void thisIsFunctionInB();
    static void yoyo(){
        System.out.println("just printing something");
    }
    default void fun(){
        System.out.println("having fun");
    }
    //static interface methods should always have a body
}
