package com.geopokrovskiy.javacore.chapter15;

public class LambdaDemo2 {


    public static void main(String[] args) {
        NumericTest isEven = n -> n % 2 == 0;
        if(isEven.test(10)) System.out.println("even");
        if(!isEven.test(11)) System.out.println("odd");

        NumericTest isNonNegative = (n) -> n >= 0;
        System.out.println(isNonNegative.test(-1));

    }
}
