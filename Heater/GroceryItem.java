
/**
 * Write a description of class GroceryItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroceryItem
{
    private String name;
    private double pricePerUnit;

    public GroceryItem()
    {
        name = "Ukjent";
        pricePerUnit = 0;
    }

    public GroceryItem(String navn, double pris)
    {
        pricePerUnit = pris;
        name = navn;
    }

    public void setName(String navn)
    {
        name = navn;
    }

    public void setPricePerUnit(double pris)
    {
        pricePerUnit = pris;
    }

    public String getName()
    {
        return name;
    }

    public double getPricePerUnit()
    {
        return pricePerUnit;
    }
}
