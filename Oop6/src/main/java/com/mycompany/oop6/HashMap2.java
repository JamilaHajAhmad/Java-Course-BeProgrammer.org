
package com.mycompany.oop6;

import java.util.HashMap;

public class HashMap2 {

    public static void main(String[] args) {
  HashMap<String, String> capitalCities = new HashMap<String, String>();
capitalCities.put("Jordan", "Amman");
capitalCities.put("Qatar", "Doha");
capitalCities.put("Lebanon", "Beruit");
capitalCities.put("Oman", "Masqat");
System.out.println(capitalCities);
System.out.println(capitalCities.get("Jordan"));
System.out.println("Before editing");
System.out.println("*****************************");
System.out.println(capitalCities);
capitalCities.remove("Qatar");
System.out.println("After editing");
System.out.println("*****************************");
System.out.println(capitalCities);
capitalCities.clear();
System.out.println("After editing");
System.out.println("*****************************");
System.out.println(capitalCities);
    }    
}
