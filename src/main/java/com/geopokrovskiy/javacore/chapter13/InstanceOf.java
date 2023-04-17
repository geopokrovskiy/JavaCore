package com.geopokrovskiy.javacore.chapter13;

class A{
    int i,j;
}

class B{
    int i, j;
}

class C extends A{
    int k;
}

class D extends A{
    int k;
}
public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A){
            System.out.println("a is an instance of A");
        }
        if( b instanceof B){
            System.out.println("b is an instance of B");
        }
        if( c instanceof C){
            System.out.println("c is an instance of C");
        }
        if(c instanceof A){
            System.out.println("c can be cast to type A");
        }

        System.out.println();

        A ob;
        ob = d;
        System.out.println("ob references d now");
        if(ob instanceof D){
            System.out.println("ob is instance of D");
        }

        System.out.println();

        ob = c;
        System.out.println("ob references d now");
        if(ob instanceof D){
            System.out.println("ob can be cast to D type");
        } else {
            System.out.println("ob cannot be cast to D type");
        }

        System.out.println();

        if(a instanceof Object){
            System.out.println("a can be cast to Object type");
        }
        if(b instanceof Object){
            System.out.println("b can be cast to Object type");
        }if(c instanceof Object){
            System.out.println("c can be cast to Object type");
        }if(d instanceof Object){
            System.out.println("d can be cast to Object type");
        }
    }



}
