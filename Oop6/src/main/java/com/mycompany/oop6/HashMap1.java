
package com.mycompany.oop6;

import java.util.HashMap;

public class HashMap1 {
        public static void main(String[] args) {
        HashMap<String, String> Name = new HashMap<String, String>();
        Name.put("Jamila", "Saed");
        System.out.println(Name);
        HashMap<String, String> ID = new HashMap<String, String>();
        ID.put("1234", "56");
        System.out.println(ID);
        HashMap<String, String> Email = new HashMap<String, String>();
        Email.put("jamila@hotmail.com", "");
        System.out.println(Email);
        HashMap<String, String> Address = new HashMap<String, String>();
        Address.put("Amman", "56");
        System.out.println(Address);
        HashMap<String, String> Salary = new HashMap<String, String>();
        Salary.put("2500$", "");
        System.out.println(Salary);
        HashMap<String, String> Nationallity = new HashMap<String, String>();
        Nationallity.put("Jordanian", "");
        System.out.println(Nationallity);
    }
    
}
