package com.geopokrovskiy.javacore.chapter21;

import java.io.File;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelWrite {
    public static void main(String[] args) {
        // получение канала к файлу
        try(FileChannel fChan = (FileChannel)
                Files.newByteChannel(Paths.get("test.txt"),
                        StandardOpenOption.WRITE,
                        StandardOpenOption.CREATE,
                        StandardOpenOption.READ)){
            // сопоставление файла с буфером
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            // запись заданного количества байтов в буфер
            for(int i = 0; i < 26; i++){
                mBuf.put((byte) ('A' + i));
            }
            fChan.write(mBuf);
        } catch (InvalidPathException e){
            System.out.println("Path exception " + e);
        } catch (IOException e){
            System.out.println("IOException " + e);
        }
    }
}
