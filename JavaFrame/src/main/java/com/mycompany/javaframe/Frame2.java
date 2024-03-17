
package com.mycompany.javaframe;
import javax.swing.*;
public class Frame2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
         frame.setTitle("Frame2");
         frame.setSize(1000, 1000);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JLabel label = new JLabel();
         frame.add(label);
         label.setHorizontalAlignment(JLabel.CENTER);
         label.setVerticalAlignment(JLabel.CENTER);
         label.setText("BeProgrammer.org ^^");
         ImageIcon image = new ImageIcon("1.JPG");//الامتداد سواء كان بحروف صغيرة أو كبيرة لن يؤثر
         label.setIcon(image);
         label.setHorizontalTextPosition(JLabel.CENTER);
         label.setVerticalTextPosition(JLabel.BOTTOM);
         
         
    }
    
}
