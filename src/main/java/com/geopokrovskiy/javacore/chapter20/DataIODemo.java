package com.geopokrovskiy.javacore.chapter20;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {
        // output of data to the file
        try( DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))){
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        }
        catch (FileNotFoundException e){
            System.out.println("Cannot open the output file");
        } catch (IOException e){
            System.out.println("IO exception");
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("Test.dat"))){
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();
            System.out.println("Given values: " + d + " " + i + " " + b);
        } catch(FileNotFoundException e){
            System.out.println("Cannot open the input file");
        }
        catch (IOException e){
            System.out.println("IO exception");
        }
    }
}
