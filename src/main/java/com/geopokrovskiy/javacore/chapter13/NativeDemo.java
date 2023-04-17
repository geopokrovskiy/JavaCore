package com.geopokrovskiy.javacore.chapter13;

public class NativeDemo {
    int i;

    public static void main(String[] args) {
        NativeDemo obj = new NativeDemo();

        obj.i = 10;
        System.out.println("obj.i before test() native method");
        obj.test();
        System.out.println("obj.i after test() native method");
    }

    public native void test();

    static{
        System.loadLibrary("NativeDemo");
    }
}
