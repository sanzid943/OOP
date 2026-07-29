package LabWorks;

public class LeapYear {
    int year,max=2020,min=1990; 
    public void checkYear(){ 
 
        int year = (int)(min+Math.random()*(max-min+1)); 
        System.out.println("random year: "+year); 
 
        if(year%400==0) 
        System.out.println(year+": is leap year"); 
        else if(year%4==0 && year%100!=0) 
        System.out.println(year+" is leap year"); 
        else 
        System.out.println(year+" is not leap year"); 
 
    }
}
