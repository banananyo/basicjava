package com.basic.wrapper;

public class BoxUnboxDemo {

    public static void main(String args[]) {
        Integer x = 5; // boxes int to an Integer object
        x =  x + 10;   // unboxes the Integer to a int
        System.out.println(x);
        System.out.println(x.toString() instanceof String);
    }
}