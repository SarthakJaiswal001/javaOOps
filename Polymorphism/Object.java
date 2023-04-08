package com.sarthak.java.Polymorphism;

public class Object {
    // every class in java extends Object class by default
    //we know that every class is inherited from object class
    int num;
    public Object (int number){
        this.num=number;
    }
//at runtime the compiler decides that this method will run
    //polymorphism is of two types runtime(Dynamic) polymorphism and Compile time (static) polymorphism
    @Override
    public String toString() {
        return "Object{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        Object n1=new Object(54);
        System.out.println(n1);

    }
}
