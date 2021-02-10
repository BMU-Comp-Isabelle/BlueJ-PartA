/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author Isabelle Thorpe
 * @version 06.02.2021
 * 
 */
public class TicketMachine
{
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    private int price;

    private static final Ticket AYLESBURY_TICKET = new Ticket("Aylesbury", 220);

    private static final Ticket AMERSHAM_TICKET = new Ticket("Amersham", 300);

    private static final Ticket HIGHWYCOMBE_TICKET  = new Ticket("High Wycombe", 330);

    private Ticket selectedTicket;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
        //this.price = cost;

    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Print the balance
     */
    public void printBalance()
    {   
        System.out.println("Your balance is now" + " " + balance);
    }

    /**
     * Display available destination for TicketMachine
     */
    public void displayDestinations()
    {
        System.out.println("Please choose from one of the following stations");
        System.out.println();
        AYLESBURY_TICKET.print();
        System.out.println();
        AMERSHAM_TICKET.print(); 
        System.out.println();
        HIGHWYCOMBE_TICKET.print();
    }

    /**
     * Select the Aylesbury Ticket
     */
    public void selectAylesburyTicket()
    {
        selectedTicket = AYLESBURY_TICKET;
        System.out.println("You have selected Aylesbury station");
    }

    /**
     * Select the Amersham Ticket
     */
    public void selectAmershamTicket()
    {
        selectedTicket = AMERSHAM_TICKET;
        System.out.println("You have selected Amersham station");
    }

    /**
     * Select the High Wycombe Ticket
     */
    public void selectHighWycombeTicket()
    {
        selectedTicket = HIGHWYCOMBE_TICKET;
        System.out.println("You have selected HighWycombe station");
    }

    /**
     * Insert ten pence coin
     */
    public void insertTenPence(Coin coin)
    {
        if(coin.getValue() == 10)
        {
            balance = balance + 10;
            System.out.println("You just entered ten pence");
            printBalance();
        }
        else
        {
            System.out.println("Please insert a ten pence coin");
        }
    }

    /**
     * Insert twenty pence coin
     */
    public void insertTwentyPence(Coin coin)
    {
        if(coin.getValue() == 20)
        {
            balance = balance + 20;
            System.out.println("You just entered twenty pence");
            printBalance();
        }
        else
        {
            System.out.println("Please insert a 20 pence coin");
        }
    }

    /**
     * Insert one pound coin
     */
    public void insertOnePound(Coin coin)
    {
        if(coin.getValue() == 100)
        {
            balance = balance + 100;
            System.out.println("You just entered one pound");
            printBalance();
        }
        else
        {
            System.out.println("Please insert a 1 pound coin");
        }
    }

    /**
     * Insert two pound coin
     */
    public void insertTwoPound(Coin coin)
    {
        if(coin.getValue() == 200)
        {
            balance = balance + 200;
            System.out.println("You just entered two pounds");
            printBalance();
        }
        else
        {
            System.out.println("Please insert a 2 pound coin");
        }
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {

        if(balance >= selectedTicket.getCost()) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            selectedTicket.print();
            //System.out.println("# Ticket");
            //System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // total = total + price
            total = total + selectedTicket.getCost();
            // balance = balance - price;
            balance = balance - selectedTicket.getCost();
            printBalance();

        }
        else 
        {
            System.out.println("You must insert at least: " +
                (price - balance) + " more cents.");

        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
