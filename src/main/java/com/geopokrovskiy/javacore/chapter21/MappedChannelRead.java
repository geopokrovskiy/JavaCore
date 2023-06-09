package com.geopokrovskiy.javacore.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class MappedChannelRead {
    public static void main(String[] args) {
        // получение канала доступа к файлу
        try(FileChannel fChan =
                    (FileChannel) Files.newByteChannel(Paths.get("test.txt"))){
            // получение размера файла
            long fSize = fChan.size();
            System.out.println(fSize);

            // сопоставление файла с буфером. Доступен только для чтения
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            for(int i = 0; i < fSize; i++){
                System.out.print((char) mBuf.get());
            }

            System.out.println();
        }
        catch(InvalidPathException e){
            System.out.println("Path exception " + e);
        } catch (IOException e){
            System.out.println("IO exception " + e);
        }
    }
}
