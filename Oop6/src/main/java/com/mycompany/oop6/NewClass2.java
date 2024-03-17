
package com.mycompany.oop6;

public class NewClass2 {
    static void methodPublicClass()
{
    System.out.println("Method from public class!!!!!!!");
}
    public static void main(String[] args) {
        NewClass1 o1 = new NewClass1();
        methodPublicClass();
        o1.methodDefaultClass();
    }
}
