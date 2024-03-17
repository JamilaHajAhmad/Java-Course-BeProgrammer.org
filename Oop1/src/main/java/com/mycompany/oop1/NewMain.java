
package com.mycompany.oop1;

import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
      CheckUserName cun = new CheckUserName() ;
        String Username = null;
    cun.process1(Username);
    CheckPassWord cpw = new CheckPassWord();
        int Password = 0;
    cpw.process2(Password);   
    }
}
class CheckUserName
{ 

Scanner input = new Scanner(System.in) ;
String Username = input.nextLine();
public  void process1(String name)   
{
 if("Jamila".equals(Username))   
 {
  System.out.println("Correct username :), now please enter your password so you can access your account");  
 }
else
 {
   System.out.println("Access denied :(,try again!!");  
 }
}
}
class CheckPassWord
{
Scanner input = new Scanner(System.in) ;
int Password = input.nextInt();
public void process2(int password)
{
 if(Password==2003) 
 {
     System.out.println("Correct password ,Access granted :)");  
 }
 else
 {
     System.out.println("Access denied :(,try again!!");  
   
 }
}
}
   

