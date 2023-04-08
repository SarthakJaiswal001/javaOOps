package com.sarthak.java.nested;

public class NestedInterface {
    public interface Nested{
        boolean isOdd(int num);
    }
}
class Second implements NestedInterface.Nested{

    @Override
    public boolean isOdd(int num) {
        return (num & 1)==1;
    }
}
