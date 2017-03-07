

/**
 * Model the operation of a heater, with a temperature.
 * 
 * Robert
 * V0.1
 */
public class Heater
{
    //The current temperature.
    private double temperature;
    /**
     * Create a Heater object, with initial temperature
     * of 15 degrees.
     */
    public Heater() 
    {   
        this.temperature = 15.0;
    }

    /**
     * Increase the temperature by 5 degrees.
     */
    public void warmer()
    {
        temperature += 5.0;
    }

    /**
     * Decrease the temperature by 5 degrees.
     */
    public void cooler()
    {
        temperature -= 5.0;
    }
    
}
