package com.geopokrovskiy.javacore.chapter15;

public class EmptyArrayException extends Exception{

    public EmptyArrayException() {
        super("The array is empty");
    }
}
