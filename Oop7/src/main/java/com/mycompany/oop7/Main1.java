
package com.mycompany.oop7;
import java.util.Scanner;
public class Main1 {

    public static void main(String[] args) {
        System.out.println("Welcome dear user to the university portal ^^");
        System.out.println("Please,input what the system orders you to input ^^");
        Class1 Obj = new Class1();
        Scanner inputer = new Scanner(System.in);
        System.out.println("Please,input your name");
        String name = inputer.next();
        Obj.setMyName(name);
        System.out.println("Please,input your university");
        String university = inputer.next();
        Obj.setMyUniversity(university);
        System.out.println("Please,input your specialty");
        String specialty = inputer.next();
        Obj.setMySpecialty(specialty);
        System.out.println("Please,input your age");
        int age = inputer.nextInt();
        Obj.setMyAge(age);
        System.out.println("**********************************************");
        System.out.println("Now, let us show you your data :)");
        System.out.println(Obj.getMyName());
        System.out.println(Obj.getMyUniversity());
        System.out.println(Obj.getMySpecialty());
        System.out.println(Obj.getMyAge());
    }
    
}
