package com.mycompany.checkingusernameandpassword;
import java.util.Scanner;
public class CheckingUsernameAndPassword {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);//Declaration and initialization of scanner.
System.out.println("Please dear user, enter your username and password");
String usedusername = input.nextLine();//Declaration and initialization of variable usedusername of datatype string.
int usedpassword = input.nextInt();//Declaration and initialization of variable usedpassword of datatype int.
switch(usedusername)//Logical process.
{
  case "Jamila":
   if(usedpassword==123456)//Logical statement.
   {
   System.out.println("welcome Jamila ^^");//Printing the output.
   }
   else
   {
    System.out.println("Wrong password,Access denied :(");//Printing the output.      
   } 
   break;
   case "Ayat":
   if(usedpassword==78910)//Logical statement.
   {
   System.out.println("welcome Ayat ^^");//Printing the output.
   }
   else
   {
    System.out.println("Wrong password,Access denied :(");//Printing the output.      
   }       
   break;
   case "Lamees":
   if(usedpassword==1000)//Logical statement.
   {
   System.out.println("welcome Lamees ^^");//Printing the output.
   }
   else
   {
    System.out.println("Wrong password,Access denied :(");//Printing the output.      
   } 
   break;
   case "Rama":
   if(usedpassword==124578)//Logical statement.
   {
   System.out.println("welcome Rama ^^");//Printing the output.
   }
   else
   {
    System.out.println("Wrong password,Access denied :(");//Printing the output.      
   } 
   break;
   case "Abdullah":
   if(usedpassword==1998)//Logical statement.
   {
   System.out.println("welcome Abdullah ^^");//Printing the output.
   }
   else
   {
    System.out.println("Wrong password,Access denied :(");//Printing the output.      
   } 
   break;
   case "Khalil":
   if(usedpassword==2022)//Logical statement.
   {
   System.out.println("welcome Khalil ^^");//Printing the output.
   }
   else
   {
    System.out.println("Wrong password,Access denied :(");//Printing the output.      
   } 
   break;
   case "Shahd":
   if(usedpassword==1987)//Logical statement.
   {
   System.out.println("welcome Shahd ^^");//Printing the output.
   }
   else
   {
    System.out.println("Wrong password,Access denied :(");//Printing the output.      
   } 
   break;
  default:
   System.out.println("Wrong username :( , Access denied");//Printing the output.

}
}
}    

