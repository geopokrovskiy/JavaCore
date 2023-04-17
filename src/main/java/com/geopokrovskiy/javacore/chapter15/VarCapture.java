/*package com.geopokrovskiy.javacore.chapter15;

public class VarCapture {

    public static void main(String[] args) {
        //local variable which can be captured
        int n = 10;

        SomeFunc<Integer> myLambda = (num) -> {
          int v =  num + n; // is ok because n is not mutated
            n++; //not ok because n is captured and cannot be mutated
            return v;
        };
    }
}*/
