
import java.util.*;
public class SteinSaksPapir{
    //fields
    private String status;
    private String brukerGjett;
    private Random rnd;
    public SteinSaksPapir(String brukerGjett)
    {
        this.brukerGjett = brukerGjett;
        this.status = run();
    }

    public SteinSaksPapir()
    {
        this.status = run();
    }

    public void setBrukerGjett(String gjett)
    {
        brukerGjett = gjett;
    }

    public String getStatus()
    {
        return status;
    }

    public String getBrukerGjett()
    {
        return brukerGjett;
    }

    public String run()
    {
        String retur; //returverdi
        int tilfeldigTall;
        Random rnd = new Random();
        tilfeldigTall = rnd.nextInt(3);
        if(tilfeldigTall == 0)
        {
            retur = "Stein";
        }
        else if(tilfeldigTall == 1)
        {
            retur = "Saks";
        }
        else
        {
            retur = "Papir";
        }
        return retur; 
    }

    public String vinn()
    {
        String resultat = "ukjent";
        if(status.equals("Stein"))
        {
            if(brukerGjett.equals("Stein"))
            {
                resultat = "Uavgjort";
            }
            else if(brukerGjett.equals("Saks"))
            {
                resultat = "Tap";
            }
            else if(brukerGjett.equals("Papir"))
            {
                resultat = "Vinn";
            }
            if(status.equals("Saks")){   
                if(brukerGjett.equals("Stein"))
                {    
                    resultat = "Vinn";
                }
                else if(brukerGjett.equals("Saks"))
                {    
                    resultat = "Uavgjort";
                }
                else if(brukerGjett.equals("Papir"))
                {
                    resultat = "Tap";
                }
                if(status.equals("Papir")){
                    if(brukerGjett.equals("Stein"))
                    {
                        resultat = "Tap";
                    }
                    else if(brukerGjett.equals("Saks"))
                    {
                        resultat = "Vinn";
                    }
                    else if(brukerGjett.equals("Papir"))
                    {
                        resultat = "Uavgjort";
                    } 
                } 
            }    
        }
        return resultat;
    }
}