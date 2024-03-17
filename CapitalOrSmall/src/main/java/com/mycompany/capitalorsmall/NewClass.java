// Write a Java program that reads a letter from the alphabet. Check if it is capital or small then convert it to the other case.
package com.mycompany.capitalorsmall;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
          Scanner input= new Scanner(System.in);
    int x = (char)input.nextInt();
    if(x>=65&&x<97)
    {
    System.out.println("The letter is capital");
    x=x+32;
    System.out.println((char)x);
    }
    else
    {
    System.out.println("The letter is small");
    x=(char)x-32;
    System.out.println((char)x);
    }
    } 
}
