// Write a java program to calculate the factorial of a given number.
package com.mycompany.factorial;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int x = input.nextInt();
    int Factorial=1;
    if(x==0||x==1)
    {
        System.out.println("Factorial=1");
    }
    while(x!=0&&x!=1)
    {
        Factorial=Factorial*x;
        x--;
    }
            System.out.println("Factorial="+Factorial);

    } 
}
