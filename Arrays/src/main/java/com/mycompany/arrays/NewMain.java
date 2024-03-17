package com.mycompany.arrays;
import java.util.Scanner;
public class NewMain {
public static    Scanner input = new Scanner(System.in);

public static void defineArray() 
{
System.out.println("Enter size of arrays");
 int s=input.nextInt();
 
     int arr[]= new int[s];
 ElementsOfArrays(arr);
    
}
public static void ElementsOfArrays(int a[])
{
 System.out.println("Enter elements of arrays");
 for(int i=0;i<a.length;i++)
 {
     a[i]=input.nextInt();
 }
 print(a);

}
public static void print(int array[])
{
        System.out.println("The elements are:");
        for(int i=0;i<array.length;i++)
        {
        System.out.print( array[i] +" " ); 
        }
        System.out.println();

}
public static void numberOfArrays()
{
    System.out.println("Enter number of arrays");
        int n=input.nextInt();
    for(int i=0;i<n;i++)
    {
       defineArray() ;
    }
}
    public static void main(String[] args) {
        numberOfArrays();
    }
    
}
