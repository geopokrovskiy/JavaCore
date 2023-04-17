package com.geopokrovskiy.javacore.chapter20;

import java.io.*;

class MyClass implements Serializable {
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "s=" + s + "; i=" + i + ";d  =" + d;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        //serialization (object to byte stream)
        try (ObjectOutputStream objOStrm = new ObjectOutputStream(
                new FileOutputStream("serial.txt"))) {
            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);

            objOStrm.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Serialization exception " + e);
        }

        //deserialization (byte stream to object)
        try (ObjectInputStream objIStrm = new ObjectInputStream(
                new FileInputStream("serial.txt")
        )){
            MyClass object2 = (MyClass) objIStrm.readObject();
            System.out.println("object2: " + object2);
        } catch(Exception e){
            System.out.println("deserialization exception");
        }

    }
}
