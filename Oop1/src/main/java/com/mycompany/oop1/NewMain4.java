
package com.mycompany.oop1;

public class NewMain4 {
    public static int methodOfAdd(int x,int y)
    {
        return x+y;//method of type int return int value (+)
    }
    public static int methodOfSub(int x,int y)
    {
        return x-y;//method of type int return int value (-)
    }
    
    public static int methodOfMul(int x,int y)
    {
        return x*y;//method of type int return int value (*)
    }
    public static double methodOfDiv(double x,double y)
    {
        return x/y;//method of type int return double value (/)
    }
    public static void main(String[] args) {
               NewMain4 O1 = new NewMain4();//declaration and initialization of an object
        System.out.println(O1.methodOfAdd(1,2));//printing the output
        System.out.println(Math.abs(O1.methodOfSub(3,4)));//printing the output (absolute value)
        System.out.println(O1.methodOfMul(5,6));//printing the output
        System.out.println(O1.methodOfDiv(8.0,7.0));//printing the output
    }
    
}
