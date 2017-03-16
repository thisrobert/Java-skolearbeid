
/**
 * Write a description of class Thermometer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Thermometer extends Meter
{
    //Fields
    private double maxTemperature;
    private double minTemperature;
    
    //Gir en standardverdi til thermometer til det blir endret ved en senere anledning
    //Konstruktører
    public Thermometer() {
        maxTemperature = 100;
        minTemperature = -100;
    }

    public Thermometer (String inPlacementNr, String inRegNr, String inStatus, double inMinTemperature, double inMaxTemperature) {
        super(inPlacementNr, inRegNr, inStatus);
        maxTemperature = inMinTemperature;
        minTemperature = inMaxTemperature;
    }

    //Setter og henter makstemperatur til instrumentet
    //Metoder
    public void setMaxWeight(double inMaxTemperature) {
        maxTemperature = inMaxTemperature;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    //Setter og henter minstetemperatur til instrument
    public void setMinWeight(double inMinTemperature) {
        minTemperature = inMinTemperature;
    }

    public double getMinTemperature() {
        return minTemperature;
    }
    
    //Returnerer høyeste og laveste temp til instrumentet i form av String
    public String toString() {
        return super.toString() + "\n" + "Lowest measurable temperature: " + getMinTemperature() + "°C,\n" + "Highest measurable temperature: " + getMaxTemperature() + "°C\n";
    }
    
    //
    public boolean equals(Object obj) 
    {
        if (!(obj instanceof Thermometer))
        {
            return false;
        }
        if (obj == this) 
        {
            return true;
        }
        Thermometer thermometer = (Thermometer) obj;
        return thermometer.minTemperature == (minTemperature) 
        && thermometer.maxTemperature == (maxTemperature);
    }
}
