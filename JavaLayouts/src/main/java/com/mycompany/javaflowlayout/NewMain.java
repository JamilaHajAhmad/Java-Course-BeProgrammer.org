
package com.mycompany.javaflowlayout;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.*;

public class NewMain extends JFrame implements ActionListener {
    
static FlowLayout obj;
static JButton Left,Center,Right;
static JFrame frame;
    public static void main(String[] args) {
     frame = new JFrame();
    frame.setTitle("My Frame");
    frame.setSize(800, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    obj = new FlowLayout();
    frame.setLayout(obj);
    Left = new JButton("Left");
    Center = new JButton("Center");
    Right = new JButton("Right");
    Left.addActionListener(new NewMain());
    Center.addActionListener(new NewMain());
    Right.addActionListener(new NewMain());
    frame.add(Left);
    frame.add(Center);
    frame.add(Right);
    frame.setVisible(true);
    
    }
@Override
    public void actionPerformed(ActionEvent event)
    {
     if(event.getSource() == Left)  
     {
         obj.setAlignment(FlowLayout.LEFT);
     }
     else if(event.getSource() == Center)
     {
      obj.setAlignment(FlowLayout.CENTER);   
     }
     else if(event.getSource() == Right)
     {
      obj.setAlignment(FlowLayout.RIGHT);   
   
     }
     obj.layoutContainer(frame.getContentPane());
    }
    
}
