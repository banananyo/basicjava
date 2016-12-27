package com.basic.staticKeyword;

//Program of changing the common property of all objects(static field).

public class Person{
    int rollno;
    String name;
    static String college = "ITS";

    static void change(){
        college = "BBDIT";
    }

    Person(int r, String n){
        rollno = r;
        name = n;
    }

    void display (){System.out.println(rollno+" "+name+" "+college);}

    public static void main(String args[]){
        Person.change();

        Person s1 = new Person (111,"Karan");
        Person s2 = new Person (222,"Aryan");
        Person s3 = new Person (333,"Sonoo");

        s1.display();
        s2.display();
        s3.display();
    }
}