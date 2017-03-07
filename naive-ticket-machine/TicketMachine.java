/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost)
    {
        if(cost <= 0)
        {
            price = 50;
        }
        else    
        {    
            price = cost;
        }    
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public boolean insertMoney(int amount)
    {
        if (amount > 0) 
        {
            balance += amount;
            return true;
        }
        return false;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public String getTicket()
    {
        String retur;
        if (balance >= price)
        {
            // Simulate the printing of a ticket.
            retur = "##################\n" +
            "# The BlueJ Line\n" +
            "# Ticket\n" + 
            "# " + price + " kroner.\n" + 
            "##################";
            // Update the total collected with the balance.
            total = total + balance;
            // Clear the balance.
            balance -= price;
            if (balance > 0)
            {
                System.out.println("Du får" + getRefund() + "kroner tilbake");
                balance = 0;
            }
        }
        else
        {
            retur = ("Du må legge på mer");
        }
        return retur;
    }

    public void setPrice (int cost)
    {
        if (cost <= 0)

        {
            price = 50;
        }
        else
        {
            price = cost;
        }
    }

    public int getRefund()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
