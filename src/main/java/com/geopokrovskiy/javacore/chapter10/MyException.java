package com.geopokrovskiy.javacore.chapter10;

public class MyException extends Exception {
    private int detail;

    MyException(int a){
        detail = a;
    }

    @Override
    public String toString() {
        return "MyException[" + detail + ']';
    }
}

class ExceptionDemo{
    static void compute(int a) throws MyException{
        System.out.println("compute(" + a + ") method has been called");
        if(a > 10){
            throw new MyException(a);
        }
        System.out.println("Correct termination");
    }

    public static void main(String[] args) {
        try{
            compute(1);
            compute(12);
        } catch (MyException e){
            System.out.println("The exception has been caught ");
        }
    }
}
