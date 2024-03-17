
package com.mycompany.javapanels;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.BorderLayout;

public class NewMain2 {

    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("My Frame");
    frame.setSize(400,400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    String array[] = {"Jamila","is","a","great","programmer","^^"};
    JComboBox comboBox = new JComboBox(array);
    JCheckBox Bold = new JCheckBox("Bold");
    JCheckBox Italic = new JCheckBox("Italic");
    JPanel panel1 = new JPanel (new FlowLayout());
    panel1.add(Bold);
    panel1.add(Italic);
    JButton Ok = new JButton("OK");
    Ok.setBackground(Color.green);
    JButton Cancel = new JButton("CANCEL");
    Cancel.setBackground(Color.red);
    JPanel panel2 = new JPanel (new FlowLayout());
    panel2.add(Ok);
    panel2.add(Cancel);
    frame.add(comboBox,BorderLayout.NORTH);
    frame.add(panel1,BorderLayout.CENTER);
    frame.add(panel2,BorderLayout.SOUTH);
    frame.setVisible(true);
    }
    
}
