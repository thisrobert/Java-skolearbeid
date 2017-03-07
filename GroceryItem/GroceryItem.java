
//GROCERYITEM
/**
 * Write a description of class GroceryItem here.
 * 
 * @Robert Johansson 
 * @version (a version number or a date)
 */

public class GroceryItem
{
    // instance variables - replace the example below with your own
    private String name;
    private double pricePerUnit;
    private int quantity;

    public GroceryItem()
    {
        name = "Ukjent";
        pricePerUnit = 0;
    }

    public GroceryItem(String ItemName, int quantity, double price)
    {
        name = ItemName;
        setQuantity(quantity);
        pricePerUnit = price;
    } 

    public void setName(String ItemName)
    {
        name = ItemName;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void setPricePerUnit(double price)
    {
        pricePerUnit = price;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getPricePerUnit()
    {
        return pricePerUnit;
    }

    public double getCost()
    {
        return getQuantity() * getPricePerUnit();
    }

    public String getData()
    {
        return getQuantity() + " " +
        getName() + " " +
        getPricePerUnit();
    }

}

