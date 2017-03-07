
/**
 * Write a description of class CDButikk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CDButikk
{
    // instance variables - replace the example below with your own
    private double CdPris;
    private String CdNavn;

    /**
     * Constructor for objects of class CDButikk
     */
    public CDButikk()
    {
        // initialise instance variables
        CdPris = 0;
        CdNavn = "Ukjent";
    }

    public CDButikk(String navn, double pris)
    {
        CdNavn = navn;
        CdPris = pris;
    }

    public void setPriceCd(double pris)
    {
        pris = CdPris;
    }

    public void setNameCd(String navn)
    {
        navn = CdNavn;
    }

    public double getCdPris()
    {
        return CdPris;
    }

    public String getCdNavn()
    {
        return CdNavn;
    }
}

