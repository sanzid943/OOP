package Pattern;

public class p11 {
     public static void main(String[] args) { 
        int r=5,n=1; 
        for(int i=0;i<r;i++) 
        { 
            for(int j=0;j<2*(r-i)-1;j++) 
            { 
                System.out.print(" "); 
            } 
            for(int k=0;k<2*i+1;k++) 
                { 
                    System.out.print(n+" "); 
                } 
                n++; 
           System.out.println();     
       } 
    }     
}
