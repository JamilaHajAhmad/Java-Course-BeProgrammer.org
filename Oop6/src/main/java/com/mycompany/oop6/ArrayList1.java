
package com.mycompany.oop6;
import java.util.ArrayList;//1

public class ArrayList1 {
public static void main(String[] args) {
java.util.ArrayList<String> MyName = new java.util.ArrayList<String>(); // Create an ArrayList1 Object MyName
//2
//1 & 2 are 2 kinds of importation.
MyName.add("Jamila");
MyName.add("Saed");
MyName.add("Abbas");
MyName.add("Haj Ahmad");
System.out.println("The values before editing");
System.out.println(MyName);
System.out.println("The value of index 0 before editing");
System.out.println(MyName.get(0));
System.out.println("The value of index 0 after editing");
MyName.set(0, "Khadeja");
System.out.println(MyName.get(0));
MyName.remove(1);
System.out.println("The values after editing");
System.out.println(MyName);
MyName.clear();
System.out.println("The values after editing");
System.out.println(MyName);
    }   
}
