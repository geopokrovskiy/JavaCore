package com.geopokrovskiy.javacore.chapter15;

public class MyClass1 <T>{
    private T val;

    MyClass1(T val){
        this.val = val;
    }

    MyClass1(){

    }

    T getVal(){ return val;}

}

class ConstructorRefDemo2{
    public static void main(String[] args) {
        // constructor's of generic class reference
        MyFunc2<Integer> myClass1 = MyClass1<Integer>::new;

        // instantiation of MyClass1 using the reference
        MyClass1<Integer> myClass11 = myClass1.func(100500);

        //using the instance
        System.out.println(myClass11.getVal());
    }
}
