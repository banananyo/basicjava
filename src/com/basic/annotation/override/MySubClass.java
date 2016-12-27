package com.basic.annotation.override;

public class MySubClass extends MySuperClass{

    @Override
    public void doTheThing() {
        System.out.println("Do it differently");
    }

}