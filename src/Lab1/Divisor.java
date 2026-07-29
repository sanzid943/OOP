/* Write a program that takes an integer and prints its divisors, i.e. divisors of 12 are 1, 2, 3, 4, 
6 */

package Lab1;

import java.util.Scanner;

public class Divisor {
     int num; 
    public void divisor(){ 
 
        System.out.println();       
        System.out.println("enter a number for finding divisor: "); 
        Scanner in= new Scanner(System.in); 
        num=in.nextInt(); 
 
        System.out.println("divisors are:"); 
        for(int i=1;i<num;i++) 
        { 
            if(num%i==0) 
            System.out.print(i+" "); 
        }
}
}
