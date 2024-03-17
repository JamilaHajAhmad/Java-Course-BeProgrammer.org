
package com.mycompany.javapanels;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Arrays;

public class NewMain3 extends JFrame implements ActionListener{
String number1="";
String number2="";
String text=" ";
double result  = 0.0;

public static JTextField showResult;
JButton button[]=new JButton[16];
JPanel panel=new JPanel(new GridLayout(4,4));


  NewMain3(){


setLayout(new BorderLayout(1,1));

 setTitle("Calculator");
 setSize(300,300);
 setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);

   showResult=new JTextField(20);
   showResult.setText(text);
   showResult.setFont(new Font("Arial", Font.PLAIN, 15));
   add(showResult,BorderLayout.NORTH);
   Color color3= new Color(255,255,255);
   showResult.setBackground(color3);

 String names[]={"1","2","3","-","4","5","6","+","7","8","9","*","c","0","=","/"};
  for(int i=0;i<16;i++){

	button[i]=new JButton(names[i]);
	panel.add(button[i]);
	button[i].addActionListener(this);
	button[i].setFont(new Font("Arial", Font.BOLD, 18));
	}
	add(panel,BorderLayout.CENTER);

Color color1= new Color(255,100,77);
button[12].setBackground(color1);

Color color2= new Color(77,100, 255);
button[14].setBackground(color2);

      setVisible(true);

	}



	public  void actionPerformed(ActionEvent event){

if(event.getSource() == button[0]){
	text=text+"1";
	  showResult.setText(text);

	}else if(event.getSource() == button[1]){
		text=text+"2";
	  showResult.setText(text);

	 }else if(event.getSource() == button[2]){
	  	text=text+"3";
	  	  showResult.setText(text);

	  	}else if(event.getSource() == button[3]){
	  		text=text+" - ";
	  showResult.setText(text);

	 }else if(event.getSource() == button[4]){
	text=text+"4";
	  showResult.setText(text);

	}else if(event.getSource() == button[5]){
		text=text+"5";
	  showResult.setText(text);

	 }else if(event.getSource() == button[6]){
	text=text+"6";
	  showResult.setText(text);

	}else if(event.getSource() == button[7]){
		text=text+" + ";
	  showResult.setText(text);

	  }else if(event.getSource() == button[8]){
	text=text+"7";
	  showResult.setText(text);

	}else if(event.getSource() == button[9]){
		text=text+"8";
	  showResult.setText(text);

	  }else if(event.getSource() == button[10]){
	text=text+"9";
	  showResult.setText(text);

	}else if(event.getSource() == button[11]){
		text=text+" * ";
	  showResult.setText(text);

	 }else if(event.getSource() == button[12]){
	text=" ";
	  showResult.setText(text);

	}else if(event.getSource() == button[13]){
		text=text+"0";
	  showResult.setText(text);

	  }else if(event.getSource() == button[15]){
		text=text+" / ";
	  showResult.setText(text);


      //if the operation Equal
	  }else if(event.getSource() == button[14]){
		  String word[] = text.split(" ");

          System.out.println(Arrays.toString(word));






if(word[2].equals("-")){

     number1=word[1];
     number2=word[3];

  int num1=Integer.parseInt(number1);
   int num2=Integer.parseInt(number2);

    result=num1-num2;

       } else if(word[2].equals("+")){
          number1=word[1];
		       number2=word[3];

		    int num1=Integer.parseInt(number1);
   int num2=Integer.parseInt(number2);

             result=num1+num2;

       }else if(word[2].equals("*")){
          number1=word[1];
		       number2=word[3];

		    int num1=Integer.parseInt(number1);
   int num2=Integer.parseInt(number2);
            result=num1*num2;

       }else if(word[2].equals("/")){
          number1=word[1];
		       number2=word[3];

		    int num1=Integer.parseInt(number1);
   int num2=Integer.parseInt(number2);
             result=num1/num2;
       }
    text=text+" = ";
    text=text+result;

	  showResult.setText(text);


	}

		}

public static void main(String args[]) {


new NewMain3();



}

}
    

