
package com.mycompany.javaregularexpressions;
import java.util.regex.*;
public class NewMain1 {

    public static void main(String[] args) {
    Pattern pattern1 = Pattern.compile("Jamila",Pattern.LITERAL);
    Matcher matcher1 = pattern1.matcher("Jamila Haj Ahmad");
    boolean matchFound1 = matcher1.find();
    if(matchFound1)
    {
        System.out.println("Match found");
        
    }
    else
    {
        System.out.println("Match not found");
  
    }
    Pattern pattern2 = Pattern.compile("Computer",Pattern.LITERAL);
    Matcher matcher2 = pattern2.matcher("Computer Engineering");
    boolean matchFound = matcher2.find();
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
