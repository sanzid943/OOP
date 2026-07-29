//  Print the pattern.

package LabWorks;

public class Pattern1 {
   public void patternProb(){ 
 
        System.out.println("display pattern:"); 
        System.out.println(); 
 
        for(int i=1;i<=5;i++) 
        { 
            for(int j=1;j<=2*i-1;j++) 
            { 
                if(i%2==0) 
                System.out.print("+"+" "); 
                else 
                System.out.print("*"+" "); 
            } 
            System.out.println(); 
            if(i%2!=0) 
            System.out.println(); 
 
        } 
} 
}
