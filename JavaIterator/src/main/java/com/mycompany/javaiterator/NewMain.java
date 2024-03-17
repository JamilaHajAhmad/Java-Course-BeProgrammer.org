
package com.mycompany.javaiterator;
import java.util.*;
public class NewMain {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Seat Lion");
        
        Iterator <String> it = cars.iterator();
        System.out.println(it.next());
    }
    
}
