package com.basic.IO.ReadDir;

import java.io.File;
public class ReadDir {

    public static void main(String[] args) {
        File file = null;
        String[] paths;

        try {
            // create new file object
            file = new File("/home/baze/IdeaProjects/basic_java/src/com/basic");

            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for(String path:paths) {
                // prints filename and directory name
                System.out.println(path);
            }
        }catch(Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }
}