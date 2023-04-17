package com.geopokrovskiy.javacore.chapter15;

public class MyStringOps {
    static String strReverse (String str){
        String result = "";
        int i;

        for(i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    };

    String deleteSpaces (String str){
        String result = "";
        int i;

        for(i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ') result += str.charAt(i);
        }
        return result;
    }
}

class MethodRefDemo{
    static String stringOp(StringFunc sf, String str){
        return sf.func(str);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas increase efficiency of Java";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println(outStr);

        MyStringOps myStringOps = new MyStringOps();
        outStr = stringOp(myStringOps::deleteSpaces, inStr);
        System.out.println(outStr);
    }
}
