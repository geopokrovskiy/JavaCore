package com.geopokrovskiy.javacore.chapter15;

import java.util.ArrayList;
import java.util.Collections;

public class MyClass {
    private int val;
    MyClass(int val){
        this.val = val;
    }

    int getVal() {return val;}
}

class UseMethodRef{
    static int compareMC(MyClass a, MyClass b){
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> al = new ArrayList<>();

        al.add(new MyClass(1));
        al.add(new MyClass(2));
        al.add(new MyClass(4));
        al.add(new MyClass(9));
        al.add(new MyClass(8));
        al.add(new MyClass(7));
        al.add(new MyClass(0));

        MyClass myClassMaxObj = Collections.max(al, UseMethodRef::compareMC);
        System.out.println(myClassMaxObj.getVal());
    }
}
