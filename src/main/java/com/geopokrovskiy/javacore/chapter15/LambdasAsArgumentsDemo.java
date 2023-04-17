package com.geopokrovskiy.javacore.chapter15;

public class LambdasAsArgumentsDemo {
    // Первый параметр этого метода имеет тип функционального
    // интерфейса . Следовательно, ему можно передать ссылку на
    // любой экземпляр этого интерфейса , включая экземпляр ,
    // создаваемый в лямбда - выражении . А второй параметр
    // обозначает обрабатываемую символьную строку
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas increase efficiency of Java";
        String outStr;

        System.out.println("This is the initial string. " + inStr);

        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("This is the uppercase string. " + outStr);

        outStr = stringOp((str) -> {
            String result = "";
            int i;

            for(i = 0; i < str.length(); i++){
                if(str.charAt(i) != ' ') result += str.charAt(i);
            }
            return result;
        }, inStr);
        System.out.println("This is the string with removed spaces. " + outStr);

        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for(i = str.length() - 1; i >= 0; i--){
                result += str.charAt(i);
            }
            return result;
        };

        //We can declare an instance of the interface and pass it to the function as an argument.
        outStr = stringOp(reverse, inStr);
        System.out.println("This is the reversed string. " + outStr);
    }
}
