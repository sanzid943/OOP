//  Print the pattern.

package LabWorks;

public class Pattern2 {
     public void pattern(){ 
         
        System.out.println(); 
        System.out.println("display pattern:"); 
 
        for(int i=5;i>=1;i--) 
        { 
           for(int j=1;j<=i;j++) 
           { 
            System.out.print(j); 
           } 
           System.out.println(); 
        } 
    }      
}
