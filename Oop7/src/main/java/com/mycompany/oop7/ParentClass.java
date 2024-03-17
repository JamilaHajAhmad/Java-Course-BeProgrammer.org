
package com.mycompany.oop7;

import java.util.Scanner;

public class ParentClass {
    Scanner inputer = new Scanner(System.in); 
    String name;
    String university;
    String specialty;
    int age;
public void welcome()  
{
    System.out.println("Welcome dear user to the university portal ^^");
    System.out.println("Please,input what the system orders you to input ^^");
}
public void name()
{
    System.out.println("Please,input your name");
         name = inputer.nextLine();
}
public void university()
{
    System.out.println("Please,input your university");
         university = inputer.nextLine();
}
public void specialty()
{
    System.out.println("Please,input your specialty");
         specialty = inputer.nextLine();
}
public void age()
{
    System.out.println("Please,input your age");
         age = inputer.nextInt();
}
}
