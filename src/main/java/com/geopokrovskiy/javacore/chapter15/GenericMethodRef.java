package com.geopokrovskiy.javacore.chapter15;

class MyArrayOps{
    static <T> int countMatching(T[] vals, T v){
        int count = 0;
        for(int i = 0; i < vals.length; i++){
            if(vals[i] == v) count++;
        }
        return count;
    }
}
public class GenericMethodRef {

    static <T> int myOp(MyFunc1<T> f, T[] vals, T v){
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 4, 5, 3, 4, 4, 5};
        String[] strs = {"one", "two", "three", "two"};
        int count1, count2;

        count1 = myOp(MyArrayOps::countMatching, vals, 4);
        count2 = myOp(MyArrayOps::countMatching, strs, "two");
        System.out.println(count1);
        System.out.println(count2);
    }
}
