package com.geopokrovskiy.javacore.chapter15;


import jdk.dynalink.beans.StaticClass;

class MyClass2<T> {
    private T val;

    MyClass2(T val){
        this.val = val;
    }

    T getVal() {return this.val;}
}

class MyClass3{
    private String val;

    MyClass3(String val){
        this.val = val;
    }

    String getVal() {return this.val;}
}
public class ConstructorRefDemo3 {
    static <R, T> R myClass3Factory(MyFunc3<R, T> cons, T v){
        return cons.func(v);
    }

    public static void main(String[] args) {
        // Constructor's of the MyClass2 reference
        MyFunc3<MyClass2<Double>, Double> myClassCons = MyClass2<Double> ::new;

        //instantiation of the MyClass2 using the reference (factory)
        MyClass2<Double> myClass2 = myClassCons.func(12.3);

        //Using the just created instance
        System.out.println(myClass2.getVal());

        // Constructor's of the MyClass3 reference
        MyFunc3<MyClass3, String> myFunc = MyClass3::new;

        //instantiation of the MyClass2 using the myClass3Factory
        MyClass3 mc3 = myClass3Factory(myFunc, "lambda");

        //Using the just created instance
        System.out.println(mc3.getVal());
    }
}
