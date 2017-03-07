import java.util.Scanner;
public class DieClient {
    public void start(){
        Die terning = new Die();
        Scanner input = new Scanner(System.in);

        System.out.print("Hvor mange ganger skal terningen kastes? ");
        int antall = input.nextInt();

        System.out.println("Skal nå kaste " + antall + " ganger:");
        for (int i = 0; i < antall; i++){
            System.out.print("Kast " + (i + 1) + ": ");
            terning.roll();
            System.out.println(terning.getValue());
        }

    }
}
