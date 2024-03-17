//Write a program in Java to display the multiplication table of a given integer.  
package com.mycompany.multiplicationtable;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
    System.out.println("Please,enter the number that you want its multiplication table");
    Scanner input= new Scanner(System.in);
    int x=input.nextInt();
    for(int i=0;i<=10;i++)
    {
     System.out.println(i+"*"+x+"="+(i*x));
    }
    }
    
}
