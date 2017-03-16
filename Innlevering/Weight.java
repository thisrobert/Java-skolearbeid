
/**
 * Write a description of class Weight here.
 * 
 * @author (Robert) 
 * @version (a version number or a date)
 */
public class Weight extends Meter
{
    //Fields
    private double maxWeight;
    private double minWeight;
    
    //Konstruktører
    public Weight() {
        maxWeight = 1.0;
        minWeight = 0.1;
    }

    public Weight (String inPlacementNr, String inRegNr, String inStatus, double inMinWeight, double inMaxWeight) {
        super(inPlacementNr, inRegNr, inStatus);
        maxWeight = inMinWeight;
        minWeight = inMaxWeight;
    }

    //Setter og henter maksvekt til instrumentet
    //Metoder
    public void setMaxWeight(double inMaxWeight) {
        maxWeight = inMaxWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    //Setter og henter minstevekt til instrument
    public void setMinWeight(double inMinWeight) {
        minWeight = inMinWeight;
    }

    public double getMinWeight() {
        return minWeight;
    }
    
    //Returnerer maks og minstevekt til instrumentet
    public String toString() {
        return super.toString() + "\n" + "Lowest measurable weight: " + getMinWeight() + "g\n" + "Highest measurable weight: " + getMaxWeight() + "g\n";
    }

    public boolean equals(Object obj) 
    {
        if (!(obj instanceof Weight))
        {
            return false;
        }
        if (obj == this) 
        {
            return true;
        }
        Weight weight = (Weight) obj;
        return weight.minWeight == (minWeight) 
        && weight.maxWeight == (maxWeight);
    }

}
