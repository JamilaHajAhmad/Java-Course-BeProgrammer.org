
package com.mycompany.oop5;

public class MainClass {

    public static void main(String[] args) {
        Class1 O1 = new Class1(5,6);
        Class2 O2 = new Class2();
        Demo O3 = new Demo();
        Employee obj1 = new Employee(10245,"Chaitanya");
        Employee obj2 = new Employee(92232,"Negan");
        obj1.info();
        obj2.info();
        Example2 obj = new Example2();
        Example2 obj3 = new Example2(100);
        System.out.println("var is: "+obj.getValue());
        System.out.println("var is: "+obj3.getValue());
        Example3 myobj = new Example3(100);
        System.out.println("value of var is: "+myobj.getValue());
    }
    
}
