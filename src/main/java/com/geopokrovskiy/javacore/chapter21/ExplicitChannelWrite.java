package com.geopokrovskiy.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    // НЕ СТЁР ИСХОДНЫЙ ФАЙЛ, А ПЕРЕЗАПИСАЛ В НЕГО НЕОБХОДИМОЕ КОЛИЧЕСТВО БАЙТОВ
    public static void main(String[] args) {
        // получение канала к файлу
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE)){
            // создание буфера
            ByteBuffer mBuff = ByteBuffer.allocate(26);

            // запись байтов в буфер
            for(int i = 0; i < 26; i++){
                mBuff.put((byte) ('A' + i));
            }

            // подготовка буфера к записи данных
            mBuff.rewind();

            // запись данных из буфера в выходной файл
            fChan.write(mBuff);
        } catch (InvalidPathException e){
            System.out.println("Path exception " + e);
        } catch (IOException e){
            System.out.println("IO exception " + e);
            System.exit(1);
        }
    }
}
