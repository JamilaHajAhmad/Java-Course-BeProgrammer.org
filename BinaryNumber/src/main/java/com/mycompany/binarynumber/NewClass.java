
package com.mycompany.binarynumber;
import java.util.Scanner;
public class NewClass {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int N= input.nextInt();
while(N>=1&&N<=10e9)
{
    int r=N%10;
    N /=10;
    if(r==1 || r==0)
    {
        if(N==0)
        {
            System.out.println("Yes");
        }
        continue;
    }
    else
    {
        System.out.println("No");
        break;
    }
}
}
}

