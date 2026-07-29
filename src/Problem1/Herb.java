package Problem1;

public class Herb extends Plant { 
    private boolean isMedicinal; 
    private String season; 
 
    public Herb(String name, String color, boolean isMedicinal, String season) { 
        super(name, color); 
        this.isMedicinal = isMedicinal; 
        this.season = season; 
    } 
 
    @Override 
    public String toString() { 
        System.out.println(); 
return "Herb: Name= " + getName() + ", " + "Color= " + getColor() + ", " + "Is Medicinal= " + isMedicinal + ", " 
                + "Season= " + season; 
    } 
} 