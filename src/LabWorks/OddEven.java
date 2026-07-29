/* Write a program that takes an integer and determines if it’s odd or even. Use switch cases 
to produce result. */

package LabWorks;

import java.util.Scanner;

public class OddEven {
      int num; 
    public void checkNum(){ 
 
        System.out.println();
        System.out.println("enter a number for checking odd or even: "); 
        Scanner in= new Scanner(System.in); 
        num=in.nextInt(); 
 
        switch(num%2) 
        { 
            case 0: 
            System.out.println(num+" is even"); 
            break; 
            case 1: 
            System.out.println(num+" is odd"); 
            break; 
            default: 
            System.out.println("wrong input"); 
 
        } 
    } 
}
