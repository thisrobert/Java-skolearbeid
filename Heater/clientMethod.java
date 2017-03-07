
/**
 * Write a description of class clientMethod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clientMethod
{
    // instance variables - replace the example below with your own
    private GroceryItem vare1;
    private GroceryItem vare2;
    public clientMethod()
    {
        vare1 = new GroceryItem("Brunost", 15.9);
        vare2 = new GroceryItem("Lettmelk", 8.5);

    }
    
    public void print()
    {
        System.out.println("Varens navn: " + vare1.getName());
        System.out.println("Varens pris: " + vare1.getPricePerUnit());
        System.out.println("Varens navn: " + vare2.getName());
        System.out.println("Varens pris: " + vare2.getPricePerUnit());
        
        double sum = vare1.getPricePerUnit() + vare2.getPricePerUnit();
        System.out.println("Varene " + vare1.getName() + " og " + vare2.getName() + " kostet til sammen " +
        sum);
    }
}
