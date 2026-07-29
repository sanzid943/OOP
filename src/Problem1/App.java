package Problem1;

public class App { 
  public static void main(String[] args) throws Exception { 
    Plant[] plants = new Plant[5]; 
 
    add(plants, new Flower("Belly", "White", true, false)); 
    add(plants, new Herb("Sunflower", "Yellow", false, "Spring")); 
    display(plants); 
 
    Plant foundPlant = search(plants, "Belly"); 
    System.out.println("Found Plant: " + foundPlant); 
 
    remove(plants, "Belly"); 
    display(plants); 
  } 
 
  static void add(Plant[] plants, Plant p) { 
    for (int i = 0; i < plants.length; i++) { 
      if (plants[i] == null) { 
        plants[i] = p; 
        break; 
      } 
    } 
  } 
 
  static void remove(Plant[] plants, String n) { 
    for (int i = 0; i < plants.length; i++) { 
      if (plants[i] != null && plants[i].getName().equals(n)) { 
        plants[i] = null; 
        break; 
      } 
    } 
  } 
 
  static Plant search(Plant[] plants, String n) { 
    for (Plant plant : plants) { 
      if (plant != null && plant.getName().equals(n)) { 
        return plant; 
      } 
    } 
    return null; 
  } 
 
  static void display(Plant[] plants) { 
 
    for (Plant plant : plants) { 
      if (plant != null) { 
        System.out.println(plant); 
      } 
    } 
  } 
}