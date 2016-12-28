package com.basic.IO.CharacterStream;

import java.io.*;
public class CharacterStreamTest {

    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        int count=0;
        try {
            String path= "/home/baze/IdeaProjects/basic_java/src/com/basic/IO/CharacterStream/";
            in = new FileInputStream(path+"input.txt");
            out = new FileOutputStream(path+"output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
                System.out.println(c+":"+(char)c);
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