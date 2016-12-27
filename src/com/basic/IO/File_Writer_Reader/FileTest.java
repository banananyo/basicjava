package com.basic.IO.File_Writer_Reader;

import java.io.*;
public class FileTest {
    public static void main(String args[]) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            String inputPath = "/home/baze/IdeaProjects/basic_java/src/com/basic/IO/File_Writer_Reader/input.txt";
            String outputPath = "/home/baze/IdeaProjects/basic_java/src/com/basic/IO/File_Writer_Reader/output.txt";
            File input_file = new File(inputPath);
            File output_file = new File(outputPath);
            in = new FileReader(input_file);
            out = new FileWriter(output_file);
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
