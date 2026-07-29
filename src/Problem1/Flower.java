package Problem1;

public class Flower extends Plant { 
    private boolean hasSmell; 
    private boolean hasThorn; 
 
    public Flower(String name, String color, boolean hasSmell, boolean hasThorn) { 
        super(name, color); 
        this.hasSmell = hasSmell; 
        this.hasThorn = hasThorn; 
    } 
 
 
    @Override 
    public String toString() { 
        System.out.println(); 
return "Flower: Name= " + getName() + ", " + "Color= " + getColor() + ", " + "Has Smell= " + hasSmell + ", " + "Has Thorn=" + hasThorn; 
    } 
}