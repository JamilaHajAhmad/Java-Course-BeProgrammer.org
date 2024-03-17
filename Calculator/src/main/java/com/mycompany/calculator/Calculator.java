// Write a java program that operates like a calculator.
package com.mycompany.calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
    System.out.println("Welcome to my calculator");
    Scanner input = new Scanner(System.in);
    System.out.println("Please,enter the first number");
    double num1 = input.nextDouble();//Declaration and initialization of variable num1 of datatype double.
    System.out.println("Please,enter the second number");
    double num2 = input.nextDouble();//Declaration and initialization of variable num2 of datatype double.
    double result1 = num1 + num2;//Declaration and initialization of variable result1 of datatype double which is done by the process +.
    System.out.println("The result of addition="+result1);//Printing the output.
    double result2 = num1 - num2;//Declaration and initialization of variable result2 of datatype double which is done by the process -.
    System.out.println("The result of subtraction="+result2);//Printing the output.
    double result3 = num1 * num2;//Declaration and initialization of variable result3 of datatype double which is done by the process *.
    System.out.println("The result of multiplication="+result3);//Printing the output.
    double result4 = num1 / num2;//Declaration and initialization of variable result4 of datatype double which is done by the process /.
    System.out.println("The result of division="+result4);//Printing the output.
    double result5 = num1 * num1;//Declaration and initialization of variable result5 of datatype double which is done by the process ^2.
    System.out.println("The result of squaring num1="+result5);//Printing the output.
    double result6 = num2 * num2;//Declaration and initialization of variable result6 of datatype double which is done by the process ^2.
    System.out.println("The result of squaring num2="+result6);//Printing the output.
    double result7 = num1 % num2;//Declaration and initialization of variable result7 of datatype double which is done by the process %.
    System.out.println("The result of remainder of the division="+result7);//Printing the output.
    System.out.println("Thank you dear user for using my calculator,Best regards,Programmer Jamila");
    }  
}
