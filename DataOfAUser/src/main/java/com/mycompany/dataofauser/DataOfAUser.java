package com.mycompany.dataofauser;
import java.util.Scanner;
public class DataOfAUser {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);//Declaration and initialization of scanner.
    System.out.println("Welcome dear user,to enter the system,please input correct data ^^");
    int password=input.nextInt();//Declaration and initialization of variable password of datatype int.
    while (password!=1234)//Loop process.
    {
        System.out.println("Please enter a correct one!!");//Printing the output.
        password = input.nextInt();
    }
    System.out.println("Correct password :)");//Printing the output.
    String username = input.next();//Declaration and initialization of variable username of datatype string.
   while(!"Jamila".equals(username))//Loop process.
   {
    System.out.println("Please enter a correct one!!");//Printing the output.
    username = input.next();
   }
   System.out.println("Correct username,Welcome Jamila :)");//Printing the output.
    }   
    }
    

