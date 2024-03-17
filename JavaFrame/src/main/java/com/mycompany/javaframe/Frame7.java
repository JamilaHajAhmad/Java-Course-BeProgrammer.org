
package com.mycompany.javaframe;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.*;
public class Frame7 implements ItemListener {
public static JCheckBox checkbox1;
public static JCheckBox checkbox2;
public static JCheckBox checkbox3;
public static JCheckBox checkbox4;
public static JLabel label;
    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("My Frame");
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    checkbox1 = new JCheckBox("Arial");
    checkbox2 = new JCheckBox("Serif");
    checkbox3 = new JCheckBox("Calibri");
    checkbox4 = new JCheckBox("Impact");
     label = new JLabel();
    label.setText("Show them that you can do whatever you want");
    frame.add(label);
    frame.setLayout(new FlowLayout());
    frame.add(checkbox1);
    frame.add(checkbox2);
    frame.add(checkbox3);
    frame.add(checkbox4);
    frame.setVisible(true);
    checkbox1.addItemListener(new Frame7());
    checkbox2.addItemListener(new Frame7());
    checkbox3.addItemListener(new Frame7());
    checkbox4.addItemListener(new Frame7());
    
    }
    @Override
    public void itemStateChanged(ItemEvent event)
    {
       if(checkbox1.isSelected()) 
       {
           label.setFont(new Font("Arial",Font.PLAIN,18));
       }
       else if(checkbox2.isSelected())
       {
       label.setFont(new Font("Serif",Font.PLAIN,18));
       }
       else if(checkbox3.isSelected())
       {
       label.setFont(new Font("Calibri",Font.PLAIN,18));
       }
       else if(checkbox4.isSelected())
       {
        label.setFont(new Font("Impact",Font.PLAIN,18));
       }
       else
       {
        label.setFont(new Font("Calibri",Font.PLAIN,18));
       }
    }
}
