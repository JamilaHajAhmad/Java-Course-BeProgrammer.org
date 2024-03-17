
package com.mycompany.oop2;

public class Class102 {
    static void method_a(int x, int y)
{
    System.out.println("result from static method in class102="+(x+y));
     System.out.println(x+"\t"+y);
}
public void method_b(int x, int y)
{
    System.out.println("result from public method in class102="+(x-y));
     System.out.println(x+"\t"+y);
}
protected void method_c(int x, int y)
{
    System.out.println("result from protected method in class102="+(x*y));
     System.out.println(x+"\t"+y);
}
void method_d(int x, int y)
{
    System.out.println("result from private method in class102="+(x/y));
     System.out.println(x+"\t"+y);
} 
    
}
