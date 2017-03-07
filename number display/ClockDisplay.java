
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    //fields
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;
    //konstruktør(er)
    public ClockDisplay()
    {
        initiate();
        updateDisplay();
    }

    public ClockDisplay(int hour, int minute)
    {
        initiate();
        setTime(hour, minute);
    }

    //metoder
    private void initiate()
    {
        hours = new NumberDisplay(12, true);
        minutes = new NumberDisplay(60, false);
    }

    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" + 
        minutes.getDisplayValue();
    }

    public void  setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    public String getTime()
    {
        return displayString;
    }

    public void timeTick()
    {
        minutes.increment();
        if (minutes.getValue() == 0)
        {
            hours.increment();
        }
        updateDisplay();
    }
}
