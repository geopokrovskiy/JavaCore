package com.geopokrovskiy.javacore.chapter10;

public class ChainExcDemo {
    static void demoproc(){
        NullPointerException exception = new NullPointerException("upper level");
        exception.initCause(new ArithmeticException("cause"));
        throw exception;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        } catch (NullPointerException e){
            System.out.println("Exception caught: " + e);
            System.out.println("Cause of the exception: " + e.getCause());
        }
    }
}
