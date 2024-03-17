
package com.mycompany.javaframe;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class Frame5 implements ActionListener{
    
public static JTextField Username;
public static JPasswordField Password;


    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("Login the system");
    frame.setSize(350,200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    FlowLayout o1 = new FlowLayout();
    frame.setLayout(o1);
    JLabel label1 = new JLabel("Enter your username");
    Username = new JTextField(15);
    JLabel label2 = new JLabel("Enter your password");
    Password = new JPasswordField(15);
    JButton button = new JButton("Login");
    frame.add(label1);
    frame.add(Username);
    frame.add(label2);
    frame.add(Password);
    frame.add(button);
    frame.setVisible(true);
    button.addActionListener(new Frame5());
    }
    @Override
    public void actionPerformed(ActionEvent e)
{
if(Username.getText().equals("Jamila") && Password.getText().equals("1112003")) 
{
 JOptionPane.showMessageDialog(null, "welcome dear"+Username.getText()+"To your account", "Login accepted ^^", JOptionPane.PLAIN_MESSAGE);
}
else
{
 JOptionPane.showMessageDialog(null, "Oops!! the information you entered aren't correct, try again", "Login denied ^^", JOptionPane.PLAIN_MESSAGE);
    
}
}
}
