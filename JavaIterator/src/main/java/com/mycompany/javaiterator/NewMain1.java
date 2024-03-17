
package com.mycompany.javaiterator;
import java.util.ArrayList;
import java.util.Iterator;

public class NewMain1 {

    public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(12);
    myNumbers.add(8);
    myNumbers.add(2);
    myNumbers.add(23);
    System.out.println("Before editing");
    System.out.println(myNumbers);
    Iterator it = myNumbers.iterator();
    while(it.hasNext())
    {
        Integer i =   (Integer) it.next();
        if(i<10)
        {
           it.remove();
        }
    }
    System.out.println("After editing");
    System.out.println(myNumbers);
    }
    
}
