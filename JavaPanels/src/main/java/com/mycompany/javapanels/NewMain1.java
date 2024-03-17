
package com.mycompany.javapanels;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;

public class NewMain1 {

    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("My Frame");
    frame.setSize(400, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton button1 = new JButton("#1");
    JButton button2 = new JButton("#2");
    JButton button3 = new JButton("b1");
    JButton button4 = new JButton("b2");
    JLabel label = new JLabel ("Welcome to Java",JLabel.CENTER);
    JPanel panel1 = new JPanel(new GridLayout(1,2));
    JPanel panel2 = new JPanel(new GridLayout(2,1));
    panel1.add(button1);
    panel1.add(button2);
    panel2.add(button3);
    panel2.add(button4);
    frame.add(panel1,BorderLayout.NORTH);
    frame.add(panel2,BorderLayout.WEST);
    frame.add(label,BorderLayout.SOUTH);
    label.setOpaque(true);
    label.setBackground(Color.white);
    frame.setVisible(true);

    
    }
    
}
