
package com.mycompany.javaiterator;
import java.util.ArrayList;
import java.util.Iterator;
public class NewMain2 {

    public static void main(String[] args) {
        ArrayList<String> Students = new ArrayList<String>();
        Students.add("Jamila");
        Students.add("Huthifa");
        Students.add("Ahmad");
        Students.add("Abeer");
        Students.add("Khadeja");
        System.out.println("Before editing");
        System.out.println(Students);
        Iterator it = Students.iterator();
        while(it.hasNext())
    {
        
        String i =  (String) it.next();
        if("Ahmad".equals(i))
        {
           it.remove();
        }
    }
    System.out.println("After editing");
    System.out.println(Students);
    }
    
}
