package com.geopokrovskiy.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attributes)
            throws IOException {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

public class DirTreeList {
    public static void main(String[] args) {
        String dirname = "C:\\Users\\georg\\IdeaProjects\\Eugeniy\\JavaCore\\JavaCore\\src\\main\\java\\com\\geopokrovskiy\\javacore";

        System.out.println("Directory tree starting from " + dirname + ":\n");

        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException exception) {
            System.out.println("IO exception");
        }
    }
}
