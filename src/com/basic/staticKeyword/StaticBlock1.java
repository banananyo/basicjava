package com.basic.staticKeyword;

public class StaticBlock1{
    //Is used to initialize the static data member.
    //It is executed before main method at the time of classloading.
    static{
        System.out.println("static block is invoked");
        //System.exit(0);
    }
    public static void main(String args[]){
        System.out.println("Hello main");
    }
}