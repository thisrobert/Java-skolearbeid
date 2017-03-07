import java.util.Random;
public class Die {	
    private int value;
    private Random random;

    public Die() {
        value = 0;
        random = new Random();
    }

    public int getValue(){
        return value;
    }

    public void roll(){
        value = random.nextInt(6) + 1;
    }
}
