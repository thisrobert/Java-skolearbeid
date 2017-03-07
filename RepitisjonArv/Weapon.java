
/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapon extends Equipment
{
    private double damage;
    private double dps;
    private double attackSpeed;
    
    public Weapon(double damage, double dps, double attackSpeed){
        this (0, 0, 0);
    }
    
    public Weapon(){
        
    }
}
