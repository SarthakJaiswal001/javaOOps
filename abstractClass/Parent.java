package com.sarthak.java.abstractClass;
//even if single method in class is abstract then class has to be abstract as well
//abstract classes need to be extended so that their methods can be overridden
public abstract class Parent {//cannot create object of abstract classes
    //we cannot create abstract constructors as well ,but we can create static methods
    //its is compulsory to override abstract methods
    //static methods cannot be overridden ,so we cannot create static abstract methods.
    //static methods can be created in abstract classes because we don't need to create object of it
    //java does not support multiple inheritance that's why we use Interfaces


   static int age;
    final int VALUE;//once a variable is defined final we have to initialize it
    static void hello(){
        System.out.println("just here to say hello");
    }
    void bye(){
        System.out.println("just here to say bye  bye");

    }

    abstract void career(String nameOfCareer);//abstract methods do not have body
    abstract void name(String nameOfGirl);//we cannot create body of the abstract class because if we try to call this(name) method through Parent we can't call it.

    public Parent(int age){
        this.age=age;
        VALUE=0;
    }
}
