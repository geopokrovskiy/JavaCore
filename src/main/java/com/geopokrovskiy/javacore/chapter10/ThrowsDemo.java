package com.geopokrovskiy.javacore.chapter10;

public class ThrowsDemo {

    static void throwOne() throws IllegalAccessException{
        System.out.println("In the throwOne() method's body");
        throw new IllegalAccessException("demonstration");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("The exception has been caught ");
        }
    }
}
