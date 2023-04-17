package com.geopokrovskiy.javacore.chapter10;

public class ThrowDemo {
    static void demoproc(){
        try{
            throw new NullPointerException("demonstration");
        } catch (NullPointerException e){
            System.out.println("The exception has been caught in demoproc() method");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            demoproc();
        } catch (NullPointerException e){
            System.out.println("Caught once again: " + e);
        }
    }
}
