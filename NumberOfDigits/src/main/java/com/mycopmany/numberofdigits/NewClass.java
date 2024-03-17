// Write a Java program that reads a positive integer and count the number of digits the number has 
package com.mycopmany.numberofdigits;
import java.util.Scanner;
public class NewClass {

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int x = input.nextInt();
    int y = 0;
    int counter=0;
    while(x!=0)
    {
        y=x%10;
        x/=10;
        counter++;
    }
        System.out.println("Number of digits of x="+counter);

    
}
}
