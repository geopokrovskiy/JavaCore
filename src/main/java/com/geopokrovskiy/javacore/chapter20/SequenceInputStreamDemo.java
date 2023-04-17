package com.geopokrovskiy.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

class InputStreamEnumerator implements Enumeration<FileInputStream>{
    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try {
            return new FileInputStream((files.nextElement().toString()));
        } catch (IOException e){
            return null;
        }
    }

    private Enumeration<String> files;

    public InputStreamEnumerator(Vector<String> files){
        this.files = files.elements();
    }
}

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<String>();

        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("file3.txt");
        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        try(InputStream input = new SequenceInputStream(ise)){
            while((c = input.read()) != -1){
                System.out.println((char) c);
            }
        } catch (IOException e){
            System.out.println("I/O exception " + e);
        } catch (NullPointerException e){
            System.out.println("Exception of file opening");
        }
    }

}
