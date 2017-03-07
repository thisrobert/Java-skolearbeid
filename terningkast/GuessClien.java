
import java.util.Scanner;
public class GuessClien {
    public void start(){
        Scanner input = new Scanner (System.in);
        SecretNumber secretNumber = new SecretNumber();

        System.out.println("Gjett det hemmelige tallet! ");
        System.out.println(" (1 - 100) ");

        boolean ferdig = false;
        while (!ferdig) {
            System.out.println("Hva gjetter du? ");
            int forslag = input.nextInt();

            if (secretNumber.rightGuess(forslag)) {
                ferdig = true;
            } 
            else {
                String retur = secretNumber.highOrLow(forslag);
                System.out.println(retur + " Prøv igjen");	
            }
        }
        System.out.println("Gratulerer!");
    }
}
