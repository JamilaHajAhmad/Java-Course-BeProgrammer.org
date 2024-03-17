
package com.mycompany.oop5;

public class Employee {
int empId;
String empName;
//parameterized constructor with two parameters
Employee(int id, String name){
this.empId = id;
this.empName = name;
}
void info(){
System.out.println("Id: "+empId+" Name: "+empName);
} 
}
