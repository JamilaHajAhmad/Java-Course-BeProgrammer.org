
package com.mycompany.javaenum;

public class MainClass {
    
public enum DaysOfWeek {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
    public static void main(String[] args) {
        
        for(DaysOfWeek d : DaysOfWeek.values())
        {
            System.out.println(d);
        }
        System.out.println("**********************************");
        System.out.println(DaysOfWeek.valueOf("SUNDAY").ordinal());  
        System.out.println(DaysOfWeek.valueOf("MONDAY").ordinal()); 
        System.out.println(DaysOfWeek.valueOf("TUESDAY").ordinal()); 
        System.out.println(DaysOfWeek.valueOf("WEDNESDAY").ordinal()); 
        System.out.println(DaysOfWeek.valueOf("THURSDAY").ordinal()); 
        System.out.println(DaysOfWeek.valueOf("FRIDAY").ordinal()); 
        System.out.println(DaysOfWeek.valueOf("SATURDAY").ordinal()); 
        
    }
    
}
