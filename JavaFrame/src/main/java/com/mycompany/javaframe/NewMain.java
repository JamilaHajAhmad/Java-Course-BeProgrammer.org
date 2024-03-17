
package com.mycompany.javaframe;
import javax.swing.JFrame;
public class NewMain {

    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("First Frame");
    frame.setSize(500, 500);
    frame.setVisible(true);
   // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   // frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    
}
