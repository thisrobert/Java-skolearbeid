
/**
 * Write a description of class Client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Client
{
    public void clientMethod ()
    {
        ClockDisplay clock = new ClockDisplay (23, 55);
        for (int i = 0; i < 10; i++){
            clock.timeTick();
            System.out.println(clock.getTime());
        }
    }
}

