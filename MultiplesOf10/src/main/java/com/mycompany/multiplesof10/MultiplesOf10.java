package com.mycompany.multiplesof10;
import java.util.Scanner;
public class MultiplesOf10 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);//Declaration and initialization of scanner.
    System.out.println("Welcome to Jamila's project,the program will ask you to insert 10 numbers that are multiple of 10"
            + "then print their sum after storing them in an array");
    int Multi10[]= new int[10];//Declaration and initialization of variable array of datatype int.
    int count=0;//Declaration and initialization of variable count of datatype int.
    int num=0;//Declaration and initialization of variable num of datatype int.
    int sum=0;//Declaration and initialization of variable count of datatype int.
    for(int i=0;i<Multi10.length;i++)//Looping process.
    {
        num=input.nextInt();
        if(num%10==0)//Looping process.
        {
         Multi10[count]=num;
         sum+=Multi10[count];
         count++;
        }
        else
        {
          System.out.println("Please,enter a number which is a multiple of 10 :(");
         num=input.nextInt();
        }
    }
    System.out.println("The sum="+sum);//Printing the output.
    }
    
}
