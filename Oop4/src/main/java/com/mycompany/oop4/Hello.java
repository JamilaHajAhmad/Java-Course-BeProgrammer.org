
package com.mycompany.oop4;

public class Hello {
String name;
int ID;
double Salary;
char arr_of_name[]= {'J','a','m','i','l','a'};

    public Hello() {
        this.name="Jamila";
        this.ID=202110195;
        this.Salary=2500.0;
        
    }
    

    public static void main(String[] args) {
        Hello obj = new Hello();
        System.out.println(obj.name);
        System.out.println(obj.arr_of_name);
        System.out.println(obj.ID);
        System.out.println(obj.Salary);
    }
    
}
