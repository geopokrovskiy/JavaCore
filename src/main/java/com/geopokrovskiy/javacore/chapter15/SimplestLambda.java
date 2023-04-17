package com.geopokrovskiy.javacore.chapter15;

public class SimplestLambda {
    public static void main(String[] args) {
        MyNumber myNum = () -> 1234.5;
        System.out.println(myNum.getValue());
    }
}
