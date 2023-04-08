package com.sarthak.java.Inheritance;

public class Main {
    public static void main(String[] args) {
        Parent b1=new Parent();
        Parent b2=new Parent(b1);
        Child b3=new Child(2,3,4,5);
        System.out.println(b3.h);
        System.out.println(b3.l);
       Parent b4=new Child(2,3,4,5);//this is possible

  //     Child b5=new Parent(4,5,6,7);
        //we Cannot have child reference variable and parent as a object
    }
}
