package com.sarthak.java.b;
//static means it is not dependent on any instance or any object
public class New {
    //main function is static because it is not dependent on any object
    public static void main(String[] args) {
     //we cannot call a non-static function or method in a static function because
        // hello is dependent on
     //other objects
        New pp=new New();
        pp.hello();
        pp.fun2();
        //fun2(); this will not run until its object is created
    }

    static void fun(){
        System.out.println("this is fun");
        // hello(); we cannot call hello() because it is not static and depends on a instance
        //here we have referencing the instance of hello() in static manner
       // New obj=new New();
        //obj.hello();
    }
    void fun2(){
        //hello();
    }
     void hello(){
        fun();//but we can call a static function in non-static function
        System.out.println("hello,this is sarthak");
    }
}
