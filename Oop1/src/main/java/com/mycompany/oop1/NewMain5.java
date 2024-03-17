
package com.mycompany.oop1;

public class NewMain5 {
static void method_a(int x, int y)
{
    System.out.println("result from static method in class2="+(x+y));
     System.out.println(x+"\t"+y);
}
public void method_b(int x, int y)
{
    System.out.println("result from public method in class2="+(x-y));
     System.out.println(x+"\t"+y);
}
protected void method_c(int x, int y)
{
    System.out.println("result from protected method in class2="+(x*y));
     System.out.println(x+"\t"+y);
}
void method_d(int x, int y)
{
    System.out.println("result from private method in class2="+(x/y));
     System.out.println(x+"\t"+y);
} 
static void method1(int x, int y)
{
    System.out.println("result from static method in class1="+(x+y));
     System.out.println(x+"\t"+y);
}
public void method2(int x, int y)
{
    System.out.println("result from public method in class1="+(x-y));
     System.out.println(x+"\t"+y);
}
protected void method3(int x, int y)
{
    System.out.println("result from protected method in class1="+(x*y));
     System.out.println(x+"\t"+y);
}
private void method4(int x, int y)
{
    System.out.println("result from private method in class1="+(x/y));
     System.out.println(x+"\t"+y);
}
    public static void main(String[] args) {
   NewMain5 O1 = new NewMain5();
   NewMain5 O2 = new NewMain5();
   O1.method1(1,2);
   O1.method2(1,2);
   O1.method3(1,2);
   O1.method4(1,2);
   O2.method_a(1,2);
   O2.method_b(1,2);
   O2.method_c(1,2);
   O2.method_d(1,2);
    }
    
}
