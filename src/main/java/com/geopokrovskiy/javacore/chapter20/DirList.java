package com.geopokrovskiy.javacore.chapter20;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirname = "C:\\Users\\georg\\IdeaProjects\\Eugeniy\\JavaCore\\JavaCore\\src\\main\\java";
        File f1 = new File(dirname);
        if(f1.isDirectory()){
            System.out.println("Directory " + dirname);
            String[] s = f1.list();

            for(int i = 0; i < s.length; i++){
                File f = new File(dirname + "/" + s[i]);
                if(f.isDirectory()) {
                    System.out.println(s[i] + " is a directory");
                } else{
                    System.out.println(s[i] + " is a file");
                }
            }
        }
        else {
            System.out.println(dirname + " is a not a directory");
        }
    }
}
