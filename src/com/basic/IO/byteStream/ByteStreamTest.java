package com.basic.IO.byteStream;

import java.io.*;
public class ByteStreamTest {

    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        int count=0;
        try {
            String path="/home/baze/IdeaProjects/basic_java/src/com/basic/IO/byteStream/";
            in = new FileInputStream(path+"input.txt");
            out = new FileOutputStream(path+"output.txt");
            int c;
            byte[] b = new byte[2]; // 2 byte per round
            while ((c = in.read(b)) != -1) {
                out.write(c);
                System.out.println(c);
                count++;
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
            System.out.println(count);
        }
    }
}