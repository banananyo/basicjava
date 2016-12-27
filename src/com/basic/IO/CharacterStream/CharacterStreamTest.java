package com.basic.IO.CharacterStream;

import java.io.*;
public class CharacterStreamTest {

    public static void main(String args[]) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        //int count=0;
        try {
            in = new FileReader("/home/baze/IdeaProjects/basic_java/src/com/basic/IO/CharacterStream/input.txt");
            out = new FileWriter("/home/baze/IdeaProjects/basic_java/src/com/basic/IO/CharacterStream/output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
                //System.out.println(c);
                //count++;
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
            //System.out.println(count);
        }
    }
}