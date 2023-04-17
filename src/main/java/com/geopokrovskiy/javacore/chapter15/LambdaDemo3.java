package com.geopokrovskiy.javacore.chapter15;

public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (n, d) -> (n % d == 0);
        if(isFactor.test(10, 2)) System.out.println("10 is a multiple of 2");
        if(!isFactor.test(10, 3)) System.out.println("10 is not a multiple of 3");
    }



}
