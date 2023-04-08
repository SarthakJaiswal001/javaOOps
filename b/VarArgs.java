package com.sarthak.java.b;
import java.util.Scanner; //utility class
public class VarArgs {

    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,4));
        System.out.println(sum(2,3,4,5));
        System.out.println(sum(2,3,4,5,6,7,8,9));
    }
    static int sum(int ...arr){ //...arr is the variable arguments
        int total=0;
        for(int i=0;i<arr.length;i++){
        total=total+arr[i];
        }
        return total;
    }
}
