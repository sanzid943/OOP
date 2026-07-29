 /*  Write a program that takes an integer and determines if it’s prime or not. A number is 
prime if it is divisible by 1 and itself only, i.e. 2, 3, 11, 37 etc. */

package LabWorks;

import java.util.Scanner;

public class Prime_Number {
     int num,count=0; 
 
    public void primeNum(){ 
 
        System.out.println();
        System.out.println("enter a number for checking prime number: "); 
        Scanner in= new Scanner(System.in); 
        num=in.nextInt(); 
 
        for(int i=1;i<=num;i++) 
        { 
           if(num%i==0) 
           count++; 
        } 
 
        if(count==2) 
        System.out.println(num+" is prime number"); 
        else 
        System.out.println(num+" is not prime number"); 
 
    }     
}
