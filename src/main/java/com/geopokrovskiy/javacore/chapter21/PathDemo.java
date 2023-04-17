package com.geopokrovskiy.javacore.chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Paths.get("C:\\Users\\georg\\IdeaProjects\\Eugeniy\\JavaCore\\JavaCore\\src\\main\\java\\com\\geopokrovskiy\\javacore\\chapter21\\examples\\test.txt");

        System.out.println("Filename: " + filepath.getName(1));
        System.out.println("Path to the file: " + filepath);
        System.out.println("Absolute path: " + filepath.toAbsolutePath());

        System.out.println("Parent directory: " + filepath.getParent());
        if(Files.exists(filepath)){
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }

        try {
            if(Files.isHidden(filepath)){
                System.out.println("File is hidden");
            } else{
                System.out.println("File is not hidden");
            }
        } catch (IOException e){
            System.out.println("IO exception");
        }

        Files.isWritable(filepath);
        System.out.println("File is available for writing");

        Files.isReadable(filepath);
        System.out.println("File is available for reading");

        try {
            BasicFileAttributes attribs =
                    Files.readAttributes(filepath, BasicFileAttributes.class);

            if(attribs.isDirectory()){
                System.out.println("This is a directory");
            } else {
                System.out.println("This is not a directory");
            }

            if(attribs.isRegularFile()){
                System.out.println("This is a regular file");
            } else {
                System.out.println("This is not a regular file");
            }

            if(attribs.isSymbolicLink()){
                System.out.println("This is a symbolic link");
            } else{
                System.out.println("This is not a symbolik link");
            }

            System.out.println("Last modification time: " +
                    attribs.lastModifiedTime());
            System.out.println("File size: " + attribs.size() + " bytes");
        } catch (IOException e){
            System.out.println("Attribute reading error " + e);
        }

    }
}
