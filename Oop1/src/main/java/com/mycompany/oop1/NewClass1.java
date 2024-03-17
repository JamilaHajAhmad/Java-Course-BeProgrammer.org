
package com.mycompany.oop1;

public class NewClass1 {
int arr1[] = {1,2,3};
double arr2[] = {1.1,2.2,3.3};
final char arr3[] = {'a','b','c'};
    public static void main(String[] args) {
    NewClass1 O1 = new NewClass1();
for(int i=0;i<3;i++)    
{
    O1.arr1[1]=4;
    O1.arr2[0]=0.0;
    O1.arr3[2]='j';
}
for(int i=0;i<3;i++)
{
    System.out.print(O1.arr1[i]+"\t");
}
    System.out.println();
for(int j=0;j<3;j++)
{
    System.out.print(O1.arr2[j]+"\t");
}
    System.out.println();
for(int k=0;k<3;k++)
{
    System.out.print(O1.arr3[k]+"\t");
}
    System.out.println();

    }  
}
