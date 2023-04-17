package com.geopokrovskiy.javacore.chapter10;

public class MethNestTry {
    static void nesttry(int a){
        try {
            // if a is 0, an ArithmeticException will be generated in the line 7
            int b = 42 / a;
            System.out.println("a = " + a);
            try { //nested try
                if (a == 1) a = a / (a - a); // if a is 1, an ArithmeticException will be generated here
                if (a == 2) {
                    int[] c = {1};
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bound: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Division by 0: " + e);
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a ;
            System.out.println("a = " + a);
            nesttry(a);
        } catch (ArithmeticException e){
            System.out.println("Division by zero: " + e);
        }
    }
}
