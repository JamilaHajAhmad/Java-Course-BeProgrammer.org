
package com.mycompany.oop1;

public class NewClass2 {
    public int method1(int a,int b,int c)
{
    return (b*b)-(4*a*c);
}

    public static void main(String[] args) {
    NewClass2 O1 = new NewClass2();
    NewMain2 O2 = new NewMain2() ; 
    System.out.println(O1.method1(3,4,5));
    System.out.println(O2.method2(3,4,5,6));
    }
}   

class NewMain2
{
  public int method2(int x1,int x2, int y1, int y2)
{
    return (y2-y1)/(x2-x1);
}  

        
    }

