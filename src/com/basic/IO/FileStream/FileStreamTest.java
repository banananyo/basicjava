package com.basic.IO.FileStream;

import java.io.*;
public class FileStreamTest {

    public static void main(String args[]) {

        try {
            String path = "/home/baze/IdeaProjects/basic_java/src/com/basic/IO/FileStream/test.txt";
            //byte bWrite [] = {11,21,3,40,5};
            byte bWrite [] = {65,66,67,68}; // A B C D
            OutputStream os = new FileOutputStream(path);
            for(int x = 0; x < bWrite.length ; x++) {
                os.write( bWrite[x] );   // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream(path);
            int size = is.available();

            for(int i = 0; i < size; i++) {
                System.out.print((char)is.read() + "  ");
            }
            is.close();
        }catch(IOException e) {
            System.out.print("Exception");
        }
    }
}