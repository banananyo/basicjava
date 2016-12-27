package com.basic.wrapper;

public class Wrapper_Example{

    public static void main(String args[]){
        Integer intObject = new Integer (34);

        //	Integer intObject = new Integer ( "34");
        //	int x = intObject.intValue();

        //	Integer intObject = 34;
        //	int x = intObject;
        //	int x = intObject + 7;

        // The above statements are equivalent to the following set of statements

        // Integer intObject = new Integer (34);
        // int x = intObject.intValue();
        // int x = intObject .intValue()+ 7;

        //	System.out.println(x);

        //int x = Integer.parseInt("34"); // x=34
        //double y = Double.parseDouble("34.7"); // y =34.7
        //String s1= String.valueOf('a'); // s1="a"
        //String s2= String.valueOf(true); // s2="true"

        Integer z = 10;
        System.out.println(z instanceof Object);
    }
}