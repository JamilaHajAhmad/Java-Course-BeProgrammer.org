
package com.mycompany.oop1;
public class NewMain1 {
    public static int methodNewMain(int x,int y)
    {
        return x+y;//method of type int return int value
    }
    private static int methodNewMain2(int x,int y)
    {
        methodNewMain2(5,6);
        return x-y;//method of type int return int value
    }

    public static void main(String[] args) {
        NewMain1  o1 = new NewMain1();//declaration and initialization of an object
        System.out.println(o1.methodNewMain(5,6));//printing the output
        System.out.println(o1.methodNewMain2(5,6));//printing the output
        
    }
    
}
class NewMain3
{
        public static void main(String[] args) {
        NewMain3 o2 = new NewMain3();//declaration and initialization of an object
      
     System.out.println(methodNewMain2(5,6));//printing the output
        System.out.println(o2.methodNewMain2_2(5,6));//printing the output
        }
    public  static int methodNewMain2(int x,int y)
    {
        return x*y;//method of type int return int value
    }
    private static int methodNewMain2_2(int x,int y)
    {
        return x/y;//method of type int return int value
    }  
}
