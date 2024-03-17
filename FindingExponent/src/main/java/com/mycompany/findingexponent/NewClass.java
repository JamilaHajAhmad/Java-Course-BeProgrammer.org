//  Write a java program to read two numbers x,y from user then calculate x^y.
package com.mycompany.findingexponent;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int x = input.nextInt();
    int y = input.nextInt();
    int p = 1;
    for(int i=1;i<=y;i++)
    {
        p=p*x;
    }
    System.out.println("x^y="+p);
    }
}
