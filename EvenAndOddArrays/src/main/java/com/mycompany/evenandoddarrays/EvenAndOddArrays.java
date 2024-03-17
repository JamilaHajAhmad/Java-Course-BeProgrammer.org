package com.mycompany.evenandoddarrays;
import java.util.Scanner;
public class EvenAndOddArrays {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);//Declaration and initialization of scanner.
    System.out.println("Welcome dear user,My program will ask you to insert 20 numbers then categorizes them "
            + "into even and odd numbers,after that, store them in arrays ^^");
    int Evencount=0;//Declaration and initialization of variable Evencount of datatype int.
    int Oddcount=0;//Declaration and initialization of variable Oddcount of datatype int.
    int BigArray[]=new int[20];//Declaration of variable array of datatype int.
    for(int i=0;i<=19;i++)//Looping process.
    {
      if(i==0)//Conditional statement.
      {
      System.out.println("Please,enter the first value :)");//Printing the output.  
      }
      else if(i!=19)//Conditional statement.
      {
       System.out.println("Please,enter value number"+(i+1)+":)");//Printing the output.        
   
      }
      if(i==19)//Conditional statement.
      {
      System.out.println("Please,enter the last value :)"); //Printing the output.   
      }
      BigArray[i]=input.nextInt();// Iinitialization of variable array of datatype int.
      if(BigArray[i]%2==0)//Conditional statement.
      {
          Evencount++;
      }
      else//Conditional statement.
      {
        Oddcount++;
      }
    }
    int EvenArray[]=new int [Evencount];//Declaration of variable array of datatype int.
    int OddArray[]=new int [Oddcount];//Declaration of variable array of datatype int.
    int countEven=0;//Declaration and initialization of variable countEven of datatype int.
    int countOdd=0;//Declaration and initialization of variable countOdd of datatype int.
    for(int i=0;i<=19;i++)//Looping process.
    {
        if(BigArray[i]%2==0)
        {
         EvenArray[countEven]=BigArray[i];
         countEven++;
        }
        else
        {
          OddArray[countOdd]=BigArray[i];
         countOdd++;  
        }
    }
    System.out.println("Now,the program will print even and odd array and the big array :)");
    for(int i=0;i<=19;i++)//Looping process.
    {
        System.out.println("Elements of big array:");
        System.out.println(BigArray[i]+"\t");//Printing the output.
    }
    System.out.println("***************************");
    for(int i=0;i<countEven;i++)//Looping process.
    {
     System.out.println("Elements of even  array:");
        System.out.println(EvenArray[i]+"\t"); //Printing the output.  
    }
     System.out.println("***************************");
    for(int i=0;i<countOdd;i++)//Looping process.
    {
     System.out.println("Elements of odd  array:");
        System.out.println(OddArray[i]+"\t"); //Printing the output.  
    }
     System.out.println("***************************");
    }   
}
