package com.sarthak.java.b;

public class StaticBlock {
    static int a=4;
    static int b;
    static{
        System.out.println("inside the staticblock");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock onject=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock.b+=3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock object2=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
