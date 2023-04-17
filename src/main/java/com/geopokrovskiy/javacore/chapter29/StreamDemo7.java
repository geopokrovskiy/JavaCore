package com.geopokrovskiy.javacore.chapter29;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "555-4444", "Larry@herb.com"));
        myList.add(new NamePhoneEmail("James", "555-4443", "jim@herb.com"));
        myList.add(new NamePhoneEmail("Mary", "555-4442", "mary@herb.com"));

        Stream<NamePhone> namePhone = myList.stream().map(
                (a) -> new NamePhone(a.name, a.phonenum)
        );

        List<NamePhone> npList = namePhone.collect(Collectors.toList());

        System.out.println("Names and phone numbers in List : ");
        for(NamePhone e : npList){
            System.out.println(e.name + ": " + e.phonenum);
        }

        namePhone = myList.stream().map( (a) -> new NamePhone(a.name, a.phonenum)
        );

        Set<NamePhone> npSet = namePhone.collect(Collectors.toSet());
        System.out.println("Names and phone numbers in Set : ");
        for(NamePhone e : npSet){
            System.out.println(e.name + ": " + e.phonenum);
        }
    }
}
