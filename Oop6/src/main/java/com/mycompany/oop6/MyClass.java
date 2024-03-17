
package com.mycompany.oop6;

public class MyClass {
    String name;
    int age;

    public MyClass(String s, int age) {
        this.name = s;
        this.age = age;
    }

    public MyClass(String s) {
        this(s,6);
    }

    public MyClass() {
        this("Beprogrammer.org");
        System.out.println("I hope that it is done as you want ^^");
    }
    
    

    
    
    
}
