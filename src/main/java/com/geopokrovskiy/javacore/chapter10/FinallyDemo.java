package com.geopokrovskiy.javacore.chapter10;

public class FinallyDemo {
    static void procA(){
        try{
            System.out.println("in procA() method");
            throw new RuntimeException("demonstration");
        } finally {
            System.out.println("finally clause in procA()");
        }
    }

    static void procB(){
        try{
            System.out.println("in procB() method");
            return;
        } finally {
            System.out.println("finally clause in procB()"); // Всё равно выполнится, несмотря на return!!!
        }
    }

    static void procC(){
        try{
            System.out.println("in procC() method");
        } finally {
            System.out.println("finally clause in procB()");
        }
    }

    public static void main(String[] args) {
        try{
            procA();
        } catch (Exception e){
            System.out.println("The exception has been caught ");
        }
        procB();
        procC();
    }
}
