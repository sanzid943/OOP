package Problem2;

public class FullTimeEmployee extends PartTimeEmployee { 
    private double basic, allowance; 
public void setBasic(double b) { 
 
        basic = b; 
    } 
 
    public double getBasic() { 
        return basic; 
    } 
 
    public void setAllowance(double a) { 
        allowance = a; 
    } 
 
    public double getAllowance() { 
        return basic * (allowance / 100); 
    } 
 
    void salary1() { 
        double t = getBasic() + getAllowance(); 
        System.out.println("Full time employee salary: " + t); 
        System.out.println(); 
    } 
} 
