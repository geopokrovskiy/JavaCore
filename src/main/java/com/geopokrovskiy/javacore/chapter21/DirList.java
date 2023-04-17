package com.geopokrovskiy.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {

    public static void main(String[] args) {
        String dirname = "C:\\Users\\georg\\IdeaProjects\\Eugeniy\\JavaCore\\JavaCore\\src\\main\\java\\com\\geopokrovskiy\\javacore\\chapter21";

        try (
                DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Paths.get(dirname))) {
            System.out.println("Directory " + dirname);

            for (Path entry : dirstrm) {
                BasicFileAttributes attributes =
                        Files.readAttributes(entry, BasicFileAttributes.class);

                if(attributes.isDirectory()){
                    System.out.print("<DIR> ");
                } else {
                    System.out.print("     ");
                }
                System.out.println(entry.getFileName());
            }
        } catch (
                InvalidPathException e1) {
            System.out.println("Path exception " + e1);
        } catch (
                NotDirectoryException e2) {
            System.out.println("Not a directory");
        } catch (
                IOException e3) {
            System.out.println("IO exception");
        }
    }

}
