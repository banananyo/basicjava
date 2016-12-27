package com.basic.IO.mkDir;

import java.io.File;
public class CreateDir {

    public static void main(String args[]) {
        String dirname = "/home/baze/IdeaProjects/basic_java/src/com/basic/IO/mkDir/newDir"; //from this path
        File d = new File(dirname);

        // Create directory now.
        d.mkdirs();
    }
}