
/**
 * Write a description of class Clock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clock extends Meter
{   
    //Fields
    private double timeInterval;
    
    //Konstruktører
    public Clock() {
        timeInterval = 0.0;
    }

    public Clock (String inPlacementNr, String inRegNr, String inStatus, double inTimeInterval) {
        super(inPlacementNr, inRegNr, inStatus);
        timeInterval = inTimeInterval;
    }

    //Setter og henter tidsintervallen til klokken
    //Metoder
    public void setTimeInterval(double inTimeInterval) {
        timeInterval = inTimeInterval;
    }

    public double getTimeInterval() {
        return timeInterval;
    }
    //Returnerer tidsintervallet til instrumentet
    public String toString() {
        return super.toString() + "\n" + "Measurable time interval: " + getTimeInterval() + "s\n";
    }

    public boolean equals(Object obj) 
    {
        if (!(obj instanceof Clock))
        {
            return false;
        }
        if (obj == this) 
        {
            return true;
        }
        Clock clock = (Clock) obj;
        return clock.timeInterval == (timeInterval); 
    }
}
