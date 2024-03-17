
package com.mycompany.javaabstraction;
import java.util.Scanner;

public  class RegularClass extends AbstractClass {
Scanner sc = new Scanner(System.in);
String name;
int age;
String job;
int nofm;
@Override
    public void name() {
        System.out.println("What's your name?"); 
         name = sc.nextLine();
    }

@Override
    public void age() {
       System.out.println("How old are you?");
         age = sc.nextInt(); 
    }
    
    
@Override
    public void job() {
        System.out.println("What's your job?");
        job = sc.next();
    }
    
@Override
    public void numberOfFamilyMembers() {
        System.out.println("How many members in your family?");
         nofm = sc.nextInt();
    }
    
}
