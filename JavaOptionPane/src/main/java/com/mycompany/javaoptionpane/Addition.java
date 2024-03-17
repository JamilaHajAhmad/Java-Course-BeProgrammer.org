
package com.mycompany.javaoptionpane;
import javax.swing.JOptionPane;
public class Addition {

    public static void main(String[] args) {
      String firstNumber = JOptionPane.showInputDialog("Enter first number");
      String secondNumber = JOptionPane.showInputDialog("Enter second number");
      int number1 = Integer.parseInt(firstNumber);
      int number2 = Integer.parseInt(secondNumber);
      int sum = number1 + number2;
      JOptionPane.showMessageDialog(null, "The sum of"+number1+ "and"+number2+"="+sum, "The result", JOptionPane.PLAIN_MESSAGE);
      
    }
    
}
