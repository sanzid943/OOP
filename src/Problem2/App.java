package Problem2;

public class App {
     public static void main(String[] args) throws Exception { 
    PartTimeEmployee ob = new PartTimeEmployee(); 
    ob.setHour(90); 
    ob.setRate(89); 
    ob.salary(); 
 
 
    FullTimeEmployee ob1 = new FullTimeEmployee(); 
    ob1.setBasic(25000); 
    ob1.setAllowance(22); 
    ob1.salary1(); 
 
  } 
}
