package Pattern;

public class p10 {
     public static void main(String[] args) { 
        int r=5; 
        for(int i=0;i<r;i++) 
        { 
            for(int j=0;j<2*(r-i)-1;j++) 
            { 
                System.out.print(" "); 
            } 
            for(int k=0;k<r;k++) 
                { 
                    System.out.print("*"); 
                } 
           System.out.println();     
       } 
    }     
}
