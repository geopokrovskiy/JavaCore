package com.geopokrovskiy.javacore.chapter15;

public class HighTemp {
    private int hTemp;

    HighTemp(int h) {
        hTemp = h;
    }

    boolean sameTemp(HighTemp h2) {
        return hTemp == h2.hTemp;
    }

    boolean lessThanTemp(HighTemp h3) {
        return hTemp < h3.hTemp;
    }
}

class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int count;
        HighTemp[] weekDayHighs = {new HighTemp(89), new HighTemp(82),
                new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91),
                new HighTemp(84), new HighTemp(83)};

        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Days with 89F maximal temperature: " + count);
        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println("Days with less than 89F maximal temperature: " + count);
    }
}
