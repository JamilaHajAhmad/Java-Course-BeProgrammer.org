
package com.mycompany.javaregularexpressions;
import java.util.regex.*;

public class NewMain {

    public static void main(String[] args) {
    Pattern pattern = Pattern.compile("Beprogrammer",Pattern.LITERAL);
    Matcher matcher = pattern.matcher("Visit Beprogrammer!");
    boolean matchFound = matcher.find();
    if(matchFound)
    {
        System.out.println("Match found");
        
    }
    else
    {
        System.out.println("Match not found");
  
    }
    }
    
}
