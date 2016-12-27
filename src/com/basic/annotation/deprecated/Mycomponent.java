package com.basic.annotation.deprecated;

@Deprecated
/**
 @deprecated Use MyNewComponent instead.
 */
class MyComponent {
    MyComponent(){
        System.out.println("my component");
    }
}