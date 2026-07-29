package Problem1;

public class Plant { 
      private String name; 
      private String color; 
       
      public Plant(String name, String color) { 
          this.name = name; 
          this.color = color; 
      } 
      public void setName(String name) { 
        this.name = name; 
    } 
      public String getName() { 
          return name; 
      } 
      public void setColor(String color) { 
        this.color = color; 
    } 
      public String getColor() { 
          return color; 
      } 
   
      @Override 
      public String toString() { 
          System.out.println(); 
          return "Plant: Name= " + name + ", "+"Color= " + color; 
      } 
}   