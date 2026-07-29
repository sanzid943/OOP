// Write a program that prints the multiplication table of an integer. 

package LabWorks;

import java.util.Scanner;

public class Mul_Table {
     int num; 
    public void multiNum(){ 
 
        System.out.println();
        System.out.println("enter a number for multiplication table: "); 
        Scanner in= new Scanner(System.in); 
        num=in.nextInt(); 
 
        System.out.println("multiplication table:"); 
        for(int i=1;i<=10;i++) 
        { 
            System.out.println(num+"x"+i+"="+num*i); 
        } 
} 
}
