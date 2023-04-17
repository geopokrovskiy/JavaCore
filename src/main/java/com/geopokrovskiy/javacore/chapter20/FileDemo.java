package com.geopokrovskiy.javacore.chapter20;

import java.io.File;

public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("java/COPYRIGHT.txt");
        p("filename: " + f1.getName());
        p("Absolute path: " + f1.getAbsolutePath());
        p("Path: " + f1.getPath());
        p("Parent directory: " + f1.getParent());
        p(f1.exists() ? "exists" : "doesn't exist");
        p(f1.canWrite() ? "can write" : "cannot write");
        p(f1.isDirectory() ? "is directory" : "isn't directory");
        p(f1.isFile() ? "is ordinary file" : "can be a channel");
        p(f1.isAbsolute() ? "is absolute" : "is not absolute");
        p(f1.lastModified() + " last modification");
        p("size of the file is: " + f1.length() + " bytes");
    }
}
