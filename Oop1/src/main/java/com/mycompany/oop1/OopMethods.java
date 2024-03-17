
package com.mycompany.oop1;

public class OopMethods {
public static int sum(int num1,int num2)
{
    return num1+num2;
}
public static int sub(int num1,int num2)
{
    return num1-num2;
}
public static int mul(int num1,int num2)
{
    return num1*num2;
}
public static int div(int num1,int num2)
{
    return num1/num2;
}
    public static void main(String[] args) {
        OopMethods O1 = new OopMethods() ;
    System.out.print(O1.sum(1,1));
        System.out.print(O1.sub(4,4));
    System.out.print(O1.mul(3,0));
         System.out.print(O1.div(3,1)+"\t Programmer Jamila's birthday year ^^");    
    }
    
}
