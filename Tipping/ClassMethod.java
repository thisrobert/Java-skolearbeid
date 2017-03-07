/**
 * Write a description of class Client here.
 * 
 * @Robert
 * @version (a version number or a date)
 */
public class Client
{
    private GroceryItem vare1;
    private GroceryItem vare2;
    private double PriceTotal;

    public Client()
    {
        clientMethod();

    }

    public void clientMethod()
    {
        vare1 = new GroceryItem("Brunost", 15.9);
        vare2 = new GroceryItem("Lettmelk", 8.5);
        PriceTotal = vare1.getPricePerUnit() + vare2.getPricePerUnit();

        System.out.println("Varens navn: " + vare1.getName() + "\n" + 
            "Varens pris: " + vare1.getPricePerUnit() + "\n" + 
            "Varens navn: " + vare2.getName() + "\n" + 
            "Varens pris: " + vare2.getPricePerUnit() + "\n" + 
            "Varene " + vare1.getName() + " og " + vare2.getName() + " kostet til sammen " + PriceTotal);
    }

}
