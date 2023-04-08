package com.sarthak.java.Inheritance;
//taking example of boxes
public class Parent {
    double l;
    double h;
    double w;
    public Parent(){
        this.l=-1;
        this.h=-1;
        this.w=-1;

    }
    public Parent(double length,double height,double width){
        this.l=length;
        this.h=height;
        this.w=width;
    }
    public Parent (Parent obj){
        this.l=obj.l;
        this.h=obj.h;
        this.w=obj.w;
    }

}
