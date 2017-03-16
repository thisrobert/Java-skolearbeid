
/**
 * Write a description of class Meter here.
 
 * @author (Robert) 
 
 */
public class Meter
{
    //Fields
    private String placementNr;
    private String regNr;
    private String status;
    
    
    //Konstruktører
    public Meter() {
        placementNr = "R1S1";
        regNr = "SC:1";
        status = "OK";
    }
    
    public Meter(String inPlacementNr, String inRegNr, String inStatus) {
        placementNr = inPlacementNr;
        regNr = inRegNr;
        status = inStatus;
    }
    
    //Plasseringsnummer
    //Setter og henter plasseringsnummer
    //Metoder
    public void setPlacementNr(String inPlacementNr) {
        placementNr = inPlacementNr;
    }
    
    public String getPlacementNr() {
        return placementNr;
    }
    
    //Registreringsnummer
    //Setter og henter registreringsnummer
    public void setRegNr(String inRegNr) {
        regNr = inRegNr;
    }
    
    public String getRegNr() {
        return regNr;
    }
    
    //Status på instrumenter
    //Setter og henter status på instrument
    public void setStatus(String inStatus) {
        status = inStatus;
    }
    
    public String getStatus() {
        return status;
    }
    
    public String toString() {
        return "Serial code: " + getRegNr() + "\n" + "Row and shelf: " + getPlacementNr() + "\n" + "Status of the instrument: " + getStatus();
    }
}
