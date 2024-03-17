
package com.mycompany.javapolymorphism1;

import java.util.Scanner;

public class ParentClass {
   static Scanner sc = new Scanner(System.in);
   static  int size;
   static int array[] = new int[size];
public  void myArray()
{
    
    System.out.println("now please input the elements");
    for(int i=0;i<size;i++)
    {
        array[i] = sc.nextInt();   
    }
    System.out.println("now, look at the values you entered");
    for(int i=0;i<size;i++)
    {
        System.out.println(array[i]);    
    }
    
}
    public static void main(String[] args) {
        System.out.println("Welcome dear user,please input the size that you want of your array");
         size =sc.nextInt();
        ParentClass o1 = new ParentClass();
        ChildClass1 o2 = new ChildClass1();
        ChildClass2 o3 = new ChildClass2();
       o1.myArray();
       o2.myArray(array);
       o3.myArray(array);
        
    }
    
}
