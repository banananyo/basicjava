package com.basic.annotation.deprecated;

public class MyNewComponent{
    public MyNewComponent(){
        System.out.println("new component");
        MyComponent m = new MyComponent();
    }

    public static void main(String args[]){
        MyNewComponent myNewComponent = new MyNewComponent();
    }
}
