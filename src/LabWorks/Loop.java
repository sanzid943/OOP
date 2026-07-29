/* Write a program which will use while loop to print all the integers between 100 and 150 
which are divisible by 8 in descending order. */

package LabWorks;

public class Loop {
     int num=150; 
    public void divisor(){ 
 
        System.out.println();
        System.out.println("numbers are: "); 
        while(num>=100) 
        { 
            if(num%8==0) 
            System.out.print(num+" "); 
            num--; 
        } 
         
    } 
}
