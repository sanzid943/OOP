import LabWorks.DisplayInfo;
import LabWorks.Divisor;
import LabWorks.Mul_Table;
import LabWorks.Number;
import LabWorks.OddEven;
import LabWorks.Prime_Number;

 
public class App { 
    public static void main(String[] args)  { 
         
       System.out.println("printing name, age and department"); 
        DisplayInfo ob= new DisplayInfo(); 
        ob.info(); 
 
        System.out.println(); 
        Number ob1= new Number(); 
        ob1.printNum(); 

        Divisor ob2= new Divisor(); 
        ob2.divisor();

        System.out.println(); 
        Prime_Number ob3= new Prime_Number(); 
        ob3.primeNum(); 

        System.out.println(); 
        Mul_Table ob4= new Mul_Table(); 
        ob4.multiNum(); 
 
        System.out.println(); 
        System.out.println("determines an integer is odd or even"); 
        OddEven ob5= new OddEven(); 
        ob5.checkNum(); 
 
    } 
}

 
