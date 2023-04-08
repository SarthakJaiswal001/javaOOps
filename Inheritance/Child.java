package com.sarthak.java.Inheritance;
import java.util.HashMap;
public class Child extends Parent {
    double weight;
    double dimensions;
    public Child(double l,double h,double w,double weight){
       super(l,h,w);
        this.weight=-1;
        System.out.println(this.w);
    }
Child(Child obj2){
        super(obj2);
        super.w=obj2.w; //we can use this as well in place of super , but if parent has variable of same name,super will give value of parents variable w
        //we can pass object as well but parent will only take those variable as arguments which it already has
    System.out.println(obj2.w);
    }

    public static void main(String[] args) {
        Child hello=new Child(4,5,6,7);
        System.out.println(hello.w);
        Child hello2=new Child(hello);
        System.out.println(hello2.w);
        HashMap<String,Integer> yo=new HashMap<>();

    }
}
