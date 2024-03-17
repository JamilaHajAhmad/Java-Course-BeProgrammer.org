
package com.mycompany.javaframe;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
public class Frame4 {

    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("My Frame");
    frame.setSize(1000, 1000);
    FlowLayout o1 = new FlowLayout();
    frame.setLayout(o1);//استطعنا هنا أن نفصل الزر عن النافدة أي فصلنا صورة الزر عن النافدة
    JButton button = new JButton();
    frame.add(button);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    button.setText("Settings");
    button.setForeground(Color.RED);
    button.setBackground(Color.WHITE);
    ImageIcon image = new ImageIcon("1.png");
    button.setIcon(image);
    frame.setVisible(true);
     
    }
    
}
