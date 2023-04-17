package com.geopokrovskiy.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    // фойл -> канал -> запись в буфер -> вывод в системный поток вывода

    public static void main(String[] args) {
        int count;
        // получение канала к файлу test.txt
        // SeekableByteChannel инкапсулирует канал для файловых операций
        // по умолчанию для чтения
        try (SeekableByteChannel fChan = Files.newByteChannel(Paths.get("test.txt"))) {

            // выделение памяти под буфер
            ByteBuffer mBuf = ByteBuffer.allocate(128);

            do {
                // запись из канала в буфер
                count = fChan.read(mBuf);
                System.out.println(count);
                if (count != -1) {
                    // перемотка буфера на начало
                    mBuf.rewind();
                    for (int i = 0; i < count; i++) {
                        //получение символа из буфера и вывод на экран
                        System.out.print((char) mBuf.get());
                    }
                }
            } while (count != -1);
        } catch (InvalidPathException e) {
            System.out.println("Path exception " + e);
        } catch (IOException e) {
            System.out.println("IO exception " + e);
        }
    }
}
