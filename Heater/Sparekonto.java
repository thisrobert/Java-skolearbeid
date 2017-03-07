
/**
 * Write a description of class Sparekonto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sparekonto
{
    private int balance;
    private int account;

    public void setIn(int penger)
    {
        account = penger; 
    }

    public void withdraw(int withdrawal)
    {
        account -= withdrawal;
    }
    
    public int getBalance()
    {
        return account;
    }
    
    public void print()
    {
        System.out.println("Roberts bank");
        System.out.println("account: " + account + "kroner.");
    }
}
