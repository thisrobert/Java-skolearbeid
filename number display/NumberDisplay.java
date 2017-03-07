
/**
 * Write a description of class NumberDisplay here.
 * 
 * @Robert Johansson
 * @1.0
 */
public class NumberDisplay
{
    private int limit;
    private int value;
    private boolean TwelveHourSystem;
    public NumberDisplay(int limit, boolean AMPM)
    {
        if(limit > 0) 
        {
            this.limit = limit;
        } 
        else
        {
            this.limit = 60;
        }
        value = 0;
        TwelveHourSystem = AMPM;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int replacementValue)
    {
        if((replacementValue >= 0) && (replacementValue < limit))
        {
            value = replacementValue;
        }
    }

    public void increment()
    {
        if (!TwelveHourSystem)
        {
            value = (value + 1) % limit;
        }
        else
        {
            if ( value > limit)
            {
                value = 1;
            }
            value++;
        }
    }

    public String getDisplayValue()
    {
        if (value < 10)
        {
            return "0" + value;
        }
        else
        {
            return "" + value;
        }

    }
}
