
/**
 * Write a description of class Equipment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Equipment extends Item
{
    private Rarity rarity;
    private int minimumLevel;
    public Equipment() {
        
    }
    
    public Equipment(Rarity rarity, int minimumLevel, String name, int cost) {
        super(name, cost);
        setRarity(rarity);
        setMinimumLevel(minimumLevel);
    }
    
    public enum Rarity {
        Common,
        Uncommon,
        Rare,
        Epic
    }
    
    public Rarity getRarity() {
        return rarity;
    }
    
    public void setRarity(Rarity rarity){
        this.rarity = rarity;
    } 
    
    public int getMinimumLevel() {
        return minimumLevel;
    }
    
    public void setMinimumLevel(int minimumLevel) {
        this.minimumLevel = minimumLevel;
    }

    
}
