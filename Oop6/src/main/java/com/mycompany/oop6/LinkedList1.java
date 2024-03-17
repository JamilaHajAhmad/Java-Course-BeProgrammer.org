
package com.mycompany.oop6;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
 LinkedList<String> cars = new LinkedList<String>();
cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
cars.add("Mazda");
System.out.println(cars);
System.out.println("*************************");
cars.addFirst("Hyundai");
System.out.println(cars);
System.out.println("*************************");
cars.addLast("Hunda");
System.out.println(cars);
System.out.println("*************************");
cars.removeFirst();
System.out.println(cars);
System.out.println("*************************");
cars.removeLast();
System.out.println(cars);
System.out.println("*************************");
cars.getFirst();
System.out.println(cars);
System.out.println("*************************");
cars.getLast();
System.out.println(cars);
System.out.println("*************************");
    }    
}
