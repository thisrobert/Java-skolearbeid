import java.util.*;
/**
 * Write a description of class ballondor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ballondor
{
    public void Start(){
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int player;
        player = rnd.nextInt(6);

        
        {
            switch(player)
            {
                case 1: System.out.println("Ronaldo");
                break;
                case 2: System.out.println("Messi");
                break;
                case 3: System.out.println("Suarez");
                break;
                case 4: System.out.println("Griezmann");
                break;
                case 5: System.out.println("Martial");
                break;
                case 6: System.out.println("Ozil");
                break;
            }
        }
    }
}
