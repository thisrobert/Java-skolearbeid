
/**
 * Write a description of class Client here.
 * 
 * @author (Robert) 
 * @version (a version number or a date)
 */
public class Client
{
    public void mainMethod() 
    {
        //Henter alle metoder fra MeterArchive og kjører de herifra
        MeterArchive Archive = new MeterArchive();
        
        Archive.addMeter(new Clock("R1S1", "SC:001", "Working", 1));
        Archive.addMeter(new Thermometer("R2S1", "SC:002", "Working", 10, 50));
        Archive.addMeter(new Weight("R2S2", "SC:004", "Working", 100, 1000));
        Archive.addMeter(new Clock("R3S1", "SC:004", "Working", 10));
        Archive.addMeter(new Thermometer("R3S2", "SC:005", "Working", 0.1, 100));
        
        
        Archive.getAllMeters();
        Archive.deleteMeter("SC:001");
    }
}

