
package com.mycompany.javainterface;
import java.util.Scanner;
public class Class implements Interface {
    Scanner sc = new Scanner(System.in);
double salary;
double eleBill;
double watBill;
double intBill;
double teleBill;
double totalExpense;
double financialDeficitOrSurplus;


    @Override
    public void salary() {
        System.out.println("Welcome dear user,please input your monthly salary");
        salary = sc.nextDouble();
    }

    @Override
    public void monthlyExpenses() {
     System.out.println("Now,input the value of electricity bill");  
     eleBill = sc.nextDouble();
     System.out.println("Now,input the value of water bill");
     watBill = sc.nextDouble();
     System.out.println("Now,input the value of internet bill");
     intBill = sc.nextDouble();
     System.out.println("Now,input the value of telephone bill");
     teleBill = sc.nextDouble();
    }
    

    @Override
    public void financialDeficitOrSurplus() {
    totalExpense = eleBill+watBill+intBill+teleBill;
    financialDeficitOrSurplus = salary - totalExpense;
    if(financialDeficitOrSurplus>0)
    {
    System.out.println("The value of your financial surplus = "+financialDeficitOrSurplus);    
    }
    else if(financialDeficitOrSurplus<0)
    {
    System.out.println("The value of your financial deficit = "+financialDeficitOrSurplus);    
    }
    else
    {
    System.out.println("Your financial situation is neither deficit nor surplus");    
    }
    }
@Override
public void advice()
{
 if(financialDeficitOrSurplus>0)
    {
    System.out.println("Your financial situation is good , keep it like this" );    
    }
    else if(financialDeficitOrSurplus<0)
    {
    System.out.println("Your financial situation is bad, you have to save your expenses");    
    }
    else
    {
    System.out.println("Your financial situation is neither bad nor good, you can keep money by reducing using of your house devices");    
    }   
}
    
    
}
