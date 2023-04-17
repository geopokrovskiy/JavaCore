package com.geopokrovskiy.javacore.chapter15;

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;

            for(i = str.length() - 1; i >= 0; i--){
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Lambda is inverted to " + reverse.func("lambda"));
        System.out.println("Expression is inverted to " + reverse.func("expression"));

        SomeFunc<Integer> factorial = (n) -> {
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
