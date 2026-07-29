/*  Generate a random integer n between 5 and 20 (inclusive). Use for loop to print all integers 
from 0 to n separated by a space. */

package LabWorks;

public class RandomNumber {
     int n,max=20,min=5; 
    public void checkNum(){ 
 
        int n = (int)(min+Math.random()*(max-min+1)); 
        System.out.println("random number is: "+n); 
 
        for(int i=0;i<=n;i++) 
        { 
            System.out.print("numbers are: "+ i +" "); 
        } 
    }
}
