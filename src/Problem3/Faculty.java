package Problem3;

public class Faculty extends Employee{ 
    private String initial,rank; 
 
    public void setInitial(String i){ 
        initial=i; 
   } 
   public String getInitial(){ 
        return initial; 
   } 
 
   void display(){ 
    System.out.println("name: "+getName()); 
    System.out.println("age: "+getAge()); 
    System.out.println("salary: "+getSalary()); 
    System.out.println("initial: "+getInitial()); 
   } 
} 
