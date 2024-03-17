
package com.mycompany.oop6;
import java.util.ArrayList;
import java.util.Collections;
public class NewClass {
  public static void main(String[] args) {
ArrayList<Integer> myNumbers = new ArrayList<Integer>();
myNumbers.add(10);
myNumbers.add(15);
myNumbers.add(20);
myNumbers.add(25);
for (int i : myNumbers) {
System.out.println(i);
}
System.out.println("*****************************");
ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
cars.add("Mazda");
Collections.sort(cars); // Sort cars
for (String j : cars) {
System.out.println(j);
}
System.out.println("*****************************");
ArrayList<Integer> myNumbers2 = new ArrayList<Integer>();
myNumbers2.add(33);
myNumbers2.add(15);
myNumbers2.add(20);
myNumbers2.add(34);
myNumbers2.add(8);
myNumbers2.add(12);

Collections.sort(myNumbers2); // Sort myNumbers

for (int i : myNumbers2) {
System.out.println(i);
}
    
    }     
}
