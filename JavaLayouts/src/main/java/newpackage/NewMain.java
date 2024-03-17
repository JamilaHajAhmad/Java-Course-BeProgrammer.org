
package newpackage;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.*;

public class NewMain implements ActionListener  {
    
static  JButton button[] = new JButton[8];
static JFrame frame;

    public static void main(String[] args) {
    frame = new JFrame();
    frame.setTitle("My Frame");
    frame.setSize(300, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new GridLayout(2,4));
    String names [] = {"One","Two","Three","Four","Five","Six","Seven","Eight"};
    for(int i=0;i<8;i++)
    {
        button[i] = new JButton(names[i]);
        frame.add(button[i]);
        button[i].addActionListener(new NewMain());
        
    }
    
    frame.setVisible(true); 
    
    }
  boolean flag = true;

  @Override
    public void actionPerformed(ActionEvent event)
    {
      if(flag)
      {
          frame.setLayout(new GridLayout(4,2));
          frame.setSize(400, 300);
      }
      else
      {
          
      frame.setLayout(new GridLayout(2,4));
      frame.setSize(300, 400);
      }
      flag = false;
      frame.getContentPane().validate();
      
    }
    
    
}
