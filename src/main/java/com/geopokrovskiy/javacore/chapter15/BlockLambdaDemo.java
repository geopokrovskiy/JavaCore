package com.geopokrovskiy.javacore.chapter15;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int result = 1;
            for(int i = 1; i <= n; i++){
                result *= i;
            }
            return  result;
        };

        System.out.println("Factorial of 3 is " + factorial.func(3));
        System.out.println("Factorial of 6 is " + factorial.func(6));
    }
}
