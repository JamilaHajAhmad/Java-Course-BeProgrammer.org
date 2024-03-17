
package com.mycompany.javaoptionpane;
import javax.swing.JOptionPane;
public class DialogMessageType {

    public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "You can't divide by zero :(", "Error message!!",JOptionPane.ERROR_MESSAGE);
    JOptionPane.showMessageDialog(null, "Water is very important for your health", "Information ^^",JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "This site isn't secure ", "Warning message!!",JOptionPane.WARNING_MESSAGE);
    JOptionPane.showMessageDialog(null, "Are you sure that you don't wanna save the changes?", "Confirm message!!",JOptionPane.QUESTION_MESSAGE);
    
    
    
    }
    
}
