import java.util.*;
/**
 * Write a description of class MeterArchive here.
 * 
 * @author (Robert) 
 * @version (a version number or a date)
 */
public class MeterArchive
{
    ArrayList<Meter> MeterList = new ArrayList<Meter>();

    //Metoder
    public boolean addMeter(Meter instrument) 
    {
        for (Meter meter : MeterList)
        {
            if (instrument.getRegNr() == meter.getRegNr())
            {
                System.out.println("Serial code is already in use.\n");
                return false;
            }
        }
        MeterList.add(instrument);
        System.out.println("Serial code is successfully registered.\n");
        return true;
    }

    //Sjekker om instrumentet er slettet
    public Boolean deleteMeter(String inRegNr)
    {
        for (int i = 0; i < MeterList.size(); i++)
        {
            if (inRegNr == MeterList.get(i).getRegNr())
            {
                MeterList.remove(i);
                System.out.println("Meter with this registered serial code: " + inRegNr + " has been deleted. \n");
                return true;
            }
        }
        return null;
    }

    //Sjekker om plassering til instrumentet er ok
    public boolean changeMeterPlacement(String inRegNr, String inPlacementNr)
    {
        for (int i = 0; i < MeterList.size(); i++)
        {
            if (inRegNr == MeterList.get(i).getRegNr())
            {
                MeterList.get(i).setPlacementNr(inPlacementNr);
                return true;
            }
        }
        return false;
    }

    //Sjekker om instrumentets status er ødelsgt
    public boolean changeMeterStatus(String inRegNr)
    {
        for (int i = 0; i < MeterList.size(); i++)
        {
            if (inRegNr == MeterList.get(i).getRegNr())
            {
                MeterList.get(i).setStatus("Malfunctioned");
                return true;
            }
        }
        return false;
    }

    //Overskrift til printouten
    public void getAllMeters()
    {
        System.out.println("All meters in cabinet:\n\n ");

        for (Meter m : MeterList)
        {
            System.out.println(m.getClass().getName() + "\n" + m.toString() + "\n");
        }
    }

}

