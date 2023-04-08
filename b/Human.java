package com.sarthak.java.b;

public class Human {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
    int birthYear;
    String name;
    long salary;
    boolean married;
static int population;
static void info(){
    //System.out.println(this.birthYear);
    //we cannot use this keyword inside static function because it is references to an object
}
    public Human(int year,String name,int salary,boolean married){//this is a constructor
        this.birthYear=year;
        this.name=name;
        this.salary=salary;
        this.married=married;
Human.population+=1;
    }
}
