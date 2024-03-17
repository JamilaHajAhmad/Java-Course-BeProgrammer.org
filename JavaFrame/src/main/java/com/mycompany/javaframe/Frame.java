
package com.mycompany.javaframe;
import javax.swing.JFrame;
import java.util.Scanner;
public class Frame extends JFrame {

    public Frame(int width, int height, String title, boolean visible)  {
        setTitle(title);
        setSize(width,height);
        setVisible(visible);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in) ;
    String title = sc.nextLine();
    int width = sc.nextInt();
    int height = sc.nextInt();
    boolean visible = sc.nextBoolean();
    Frame frame = new Frame(width,height,title,visible);

    }
    
}
