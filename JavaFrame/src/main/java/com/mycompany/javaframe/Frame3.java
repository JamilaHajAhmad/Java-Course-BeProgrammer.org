
package com.mycompany.javaframe;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
public class Frame3 {

    public static void main(String[] args) {
    JFrame frame = new JFrame();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    frame.setTitle("My Frame");
    frame.setSize(1000,1000);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());
    frame.add(label1);
    frame.add(label2);
    frame.add(label3);
    label1.setText("If your eyes are closed it's hard to see");
    Color color1 = new Color(255,200,0);
    Font font1 = new Font("Arial",Font.PLAIN,30);
    label1.setForeground(color1);
    label1.setFont(font1);
    label2.setText("Your dreams are waiting for you, make them true");
    Color color2 = new Color(255,175,175);
    Font font2 = new Font("Times New Roman",Font.ITALIC,40);
    label2.setForeground(color2);
    label2.setFont(font2);
    label3.setText("Show them that you can be whatever you want");
    Color color3 = new Color(0,255,255);
    Font font3 = new Font("Courier",Font.ITALIC,30);
    label3.setForeground(color3);
    label3.setFont(font3);
 
    
    }
    
}
