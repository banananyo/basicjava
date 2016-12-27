package com.basic.operator.Miscellaneous.Instanceof;

public class InstanceOfTest {

    public static void main(String args[]) {

        String name = "James";

        // following will return true since name is type of String
        boolean result = name instanceof String;
        System.out.println( result );

        Car c = new Car();
        result = c instanceof Car;
        System.out.println(result);
    }
}