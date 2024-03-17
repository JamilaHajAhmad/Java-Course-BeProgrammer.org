
package com.mycompany.javaflowlayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class NewMain1 {

    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("My Frame");
    frame.setSize(400, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout(5,5));
    JButton north = new JButton("North");
    JButton south = new JButton("South");
    JButton east = new JButton("East");
    JButton west = new JButton("West");
    JButton center = new JButton("Center");
    frame.add(north,BorderLayout.NORTH);
    frame.add(south,BorderLayout.SOUTH);
    frame.add(east,BorderLayout.EAST);
    frame.add(west,BorderLayout.WEST);
    frame.add(center,BorderLayout.CENTER);
    frame.setVisible(true);

    }
    
}
