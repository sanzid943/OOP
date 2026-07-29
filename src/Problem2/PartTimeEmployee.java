package Problem2;

public class PartTimeEmployee extends Employee { 
     private double hours, rate; 
 
     public void setHour(double h) { 
          hours = h; 
     } 
 
     public double getHour() { 
          return hours; 
     } 
 
     public void setRate(double r) { 
          rate = r; 
     } 
 
     public double getRate() { 
          return rate; 
     } 
 
     void salary() { 
          double t = getHour() * getRate(); 
          System.out.println("\nPart time emoployee salary: " + t); 
     } 
} 
