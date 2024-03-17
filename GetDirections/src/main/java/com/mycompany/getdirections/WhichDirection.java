package com.mycompany.getdirections;
import java.util.Scanner;
public class WhichDirection {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int x=input.nextInt();
while(x>=1&&x<=10e5)
{
 if(x%4==0)
 {
  System.out.println("North");
  break;  
  }
  if(x%4==1)
 {
  System.out.println("East");
  break;  
  }
  if(x%4==2)
 {
  System.out.println("South");
  break;  
  }
   if(x%4==3)
 {
  System.out.println("West");
  break;  
  }
 }
}
}
