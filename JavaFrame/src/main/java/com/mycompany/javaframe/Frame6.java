
package com.mycompany.javaframe;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.event.*;
public class Frame6 implements ItemListener{
public static JComboBox combobox;
public static JFrame frame;
    public static void main(String[] args) {
    frame = new JFrame();
    frame.setTitle("My Frame");
    frame.setSize(300,250);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());
    String array[] = {"Red","Yellow","Orange","Green"};
    combobox = new JComboBox(array);
    frame.add(combobox);
    frame.setVisible(true);
    combobox.addItemListener(new Frame6());
    
    
    }
    @Override
    public void itemStateChanged(ItemEvent event)
    {
     String selectedItem = combobox.getSelectedItem().toString();//or: event.getItem()
     switch(selectedItem)
     {
         case "Red": frame.getContentPane().setBackground(Color.RED);
         break;
         case "Yellow": frame.getContentPane().setBackground(Color.YELLOW);
         break;
         case "Orange": frame.getContentPane().setBackground(Color.ORANGE);
         break;
         case "Green": frame.getContentPane().setBackground(Color.green);
         break;

     }
    }
}
