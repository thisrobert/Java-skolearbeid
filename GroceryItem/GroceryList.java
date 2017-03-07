
/**
 * Write a description of class GroceryList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class GroceryList
{
    // instance variables - replace the example below with your own
    private ArrayList<GroceryItem> groceryList;

    /**
     * Constructor for objects of class GroceryList
     */
    public GroceryList()
    {
        groceryList = new ArrayList<GroceryItem>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public GroceryItem getItem(int index)
    {
        if (index >= 0 && index < groceryList.size()) {
            return groceryList.get (index);
        }
        return null;
    }
}
