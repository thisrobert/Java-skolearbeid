import java.util.Random;	
public class SecretNumber{
    private int number;
    private Random random;

    public SecretNumber() {
        random = new Random();
        newStart();
    }

    public void newStart() {
        number = random.nextInt(100) + 1;
    }

    public boolean rightGuess(int number) {
        if (this.number == number){
            return true;
        }
        return false;	
    }

    public String highOrLow(int number) {
        if (number > this.number) {
            return " For høyt ";
        }
        return "For lavt ";
    }
}
