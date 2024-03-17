// Write a java program that reads an integer, prints its reverse
package com.mycompany.reverse;
import java.util.Scanner;
public class NewClass {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
    int x = input.nextInt();
    int z=x;
    int y = 0;
    int sum=0;
    int counter=0;
    int p=1;
    while(x!=0)
    {
        y=x%10;
        x/=10;
        counter++;
    }
    for(int j=1;j<counter;j++)
    {
        p=p*10;
    }
    for(int i=1;i<=counter;i++)
    {
        int r=z%10;
        z/=10;
      int a=r*p;
      p/=10;
      sum+=a;
    }
    System.out.println("The reverse number of x = "+sum);
    }
    
}
