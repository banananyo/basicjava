package com.basic.IO.DataStream;

import java.io.*;
public class DataStreamTest {
    public static void main(String args[])throws IOException {
        String path = "/home/baze/IdeaProjects/basic_java/src/com/basic/IO/DataStream/file.txt";
        FileOutputStream inStream = new FileOutputStream(path);
        FileInputStream outStream = new FileInputStream(path);
        // writing string to a file encoded as modified UTF-8
        DataOutputStream dataOut = new DataOutputStream(inStream);
        dataOut.writeUTF("hello");
        dataOut.close();
        inStream.close();
        // Reading data from the same file
        DataInputStream dataIn = new DataInputStream(outStream);

        while(dataIn.available()>0) {
            String k = dataIn.readUTF();
            System.out.print(k+" ");
        }
        dataIn.close();
        outStream.close();
    }
}
