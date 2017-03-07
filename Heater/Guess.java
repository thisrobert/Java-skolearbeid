import java.util.*;
/**
 * Write a description of class Guess here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guess
{
    private int computer;
    private int myguess;

    public Guess()
    {
    }

    public void Start()
    {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        
        int computer = rnd.nextInt(20);
        int myguess;
        
        System.out.println("Tipp riktig.");
        boolean win = false;
        while (win == false)
        {
            myguess = sc.nextInt();   
            if(myguess == computer)
            {

                System.out.println("Riktig gjettet.");
                win = true;
            } else if(myguess < computer) 
            {
                System.out.println("For lavt.");
            } else if(myguess > computer)
            {
                System.out.println("For høyt.");
            }
        }

    }
}
