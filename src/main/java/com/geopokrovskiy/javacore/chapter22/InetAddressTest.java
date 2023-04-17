package com.geopokrovskiy.javacore.chapter22;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        try {
            address = InetAddress.getByName("www.HerbShildt.com");
        }
        catch (UnknownHostException e){
            System.out.println("Unknown exception");
        }
        System.out.println(address);

        InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
        for(int i = 0; i < SW.length; i++){
            System.out.println(SW[i]);
        }
    }
}
