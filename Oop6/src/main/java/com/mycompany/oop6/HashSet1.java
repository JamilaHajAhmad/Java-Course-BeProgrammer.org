
package com.mycompany.oop6;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
         HashSet<String> cars = new HashSet<String>();
cars.add("Toyota");
cars.add("BMW");
cars.add("Ford");
cars.add("Hyundai");
System.out.println(cars);
System.out.println("***************************");
System.out.println(cars.contains("Mazda"));
System.out.println("***************************");
System.out.println(cars.contains("BMW"));
System.out.println("***************************");
System.out.println("HashSet before editing");
System.out.println(cars);
System.out.println("***************************");
cars.remove("Ford");
System.out.println("HashSet after editing");
System.out.println(cars);
System.out.println("***************************");
cars.clear();
System.out.println(cars);
System.out.println("***************************");
    }   
}
