
package com.mycompany.oop2;

import com.mycompany.oop2$.Class103;

public class Class101 {
static int method101(int x, int y)
{
    int z=x+y;
    System.out.println(x+"\t"+y);
    return z;
}
public int method102(int x, int y)
{
    int z=x-y;
     System.out.println(x+"\t"+y);
     return z;
}
protected int method103(int x, int y)
{
    int z=x*y;
    System.out.println(x+"\t"+y);
    return z;
}
private double method104(double x, double y)
{
     double z=x/y; 
     System.out.println(x+"\t"+y);
     return z;
}

    public static void main(String[] args) {
   Class101 O1 = new Class101();
   Class102 O2 = new Class102();
   Class103 O3 = new Class103();
    System.out.println("Result from method101 of class101="+method101(5,6));
    System.out.println("Result from method102 of class101="+O1.method102(5,6));
    System.out.println("Result from method103 of class101="+O1.method103(5,6));
    System.out.println("Result from method104 of class101="+O1.method104(5.0,6.0));
    System.out.println("***************************");
    O2.method_a(3,4);
    O2.method_b(3,4);
    O2.method_c(3,4);
    O2.method_d(3,4);
    System.out.println("***************************");
    System.out.println("Result from method102 (public) of class103="+O3.method102(10,5));    
    
    
        
    }
    
}
