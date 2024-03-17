
package com.mycompany.javapanels;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
public class NewMain {

    public static void main(String[] args) {
    JFrame frame = new JFrame();// في هدا البرنامج قمنا بعمل غريد لاي اوت واضفنا عليها الازار واضفناها الى البانيل ثم اضفنا البانيل الى الفريم
    JButton buttons[] = new JButton[5];
    JPanel panel = new JPanel(new GridLayout (1,5));
    frame.setTitle("My Frame");
    frame.setSize(450, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    for(int i=0;i<5;i++)
    {
        buttons[i] = new JButton("Button"+(i+1));
        panel.add(buttons[i]);
    }
    frame.add(panel,BorderLayout.SOUTH);
    frame.setVisible(true);

    }
    
}
