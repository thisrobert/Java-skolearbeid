
//GROCERYITEM
public class GroceryItem{
    // instance variables - replace the example below with your own
    private String name;
    private double pricePerUnit;

    public GroceryItem()
    {
        name = "Ukjent";
        pricePerUnit = 0;
    }

    public GroceryItem(String ItemName, double price)
    {
        name = ItemName;
        pricePerUnit = price;
    }

    public void setName(String ItemName)
    {
        name = ItemName;
    }

    public void setPricePerUnit(double price)
    {
        pricePerUnit = price;
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
