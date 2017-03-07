

/**
 * Jakob Høegh Krohn
 * Innlevering 2, PGR100
 * 11. November 2016
**/

import java.util.*;
public class Tipping
{
    char[] ukensRekke;
    char[] brukerRekke;
    //Oppretter klassens array med plass til 12 tegn. 
    public Tipping()
    {
        ukensRekke = new char[12];
    }
    //Fyller ukens rekke med 12 tilfeldige tippetegn (H, U eller 😎. 
    public  void weekResult()
    {
        Random P = new Random();
        for (int i = 0; i < 12; i++)
        {
            int tall = P.nextInt(3) + 1;
            if(tall == 1)
            {
                ukensRekke[i] = 'H';
            }
            else if (tall == 2)
            {
                ukensRekke[i] = 'U';
            }
            else
            {
                ukensRekke[i] = 'B';
            }
        }
    }
    //Returnerer ukens rekke. 
    public char[] getWeekResult()
    {
        return ukensRekke;
    }
    //Skriver ut ukens rekke. 
    public void print()
    {
        System.out.println("Ukens rekke:");
        for (int i = 0; i < 12; i++)
        {
            System.out.print(ukensRekke[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Brukers rekke:");
        for (int i = 0; i < 12; i++)
        {
            System.out.print(brukerRekke[i] + " ");
        }
    }
    //Lar bruker registrere 12 tippetegn. 
    public void Register()
    {
        brukerRekke = new char[12];
        char C;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 12; i++)
        {
            System.out.print("Skriv inn tippetegn " + (i + 1) + " (H, U, 😎 : ");
            C = s.next().charAt(0);
            brukerRekke[i] = C;
        }
    }
    //Sjekker hvor mange tegn som er sammenfallende. 
    public void check()
    {
        int antallRette = 0;
        for ( int i = 0; i < 12; i++)
        {
            if (ukensRekke[i] == brukerRekke[i])
            {
                antallRette++;
            }
        }
        System.out.println(" ");
        System.out.println("Bruker hadde " + antallRette + " riktige tippetegn!");
    }
}