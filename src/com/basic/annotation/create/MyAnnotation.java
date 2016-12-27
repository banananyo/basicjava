package com.basic.annotation.create;

@interface MyAnnotation {

    String   value() default "";

    String   name();
    int      age();
    String[] newNames();

}