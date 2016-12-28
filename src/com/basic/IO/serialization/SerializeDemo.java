package com.basic.IO.serialization;

import java.io.*;
public class SerializeDemo {

    public static void main(String [] args) {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;

        try {
            String path="/home/baze/IdeaProjects/basic_java/src/com/basic/IO/serialization/employee.ser";
            FileOutputStream fileOut =
                    new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /employee.ser");
        }catch(IOException i) {
            i.printStackTrace();
        }
    }
}