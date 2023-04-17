package com.geopokrovskiy.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Xi");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();

        Spliterator<String> spliterator = myStream.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();

        if(spliterator1 != null){
            System.out.println("spliterator1 result: ");
            spliterator1.forEachRemaining( (n) -> System.out.println(n));
        }

        System.out.println("spliterator result: ");
        spliterator.forEachRemaining( (n) -> System.out.println(n));
    }
}
