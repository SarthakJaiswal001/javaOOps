package com.sarthak.java.b;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(23);
        l1.add(24);
        l1.add(53);
        l1.add(31);
        for (Integer integer : l1) {
            System.out.println(integer);
        }
      //  for(int i=0;i<l1.size();i++){
        //    System.out.println(l1.get(i));
        //}
    }
}
