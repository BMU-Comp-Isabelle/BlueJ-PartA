import java.util.Date;
/**
 *This class represents the tickets that can be bought from the ticket machine
 *It stores the cost, destination and Date values
 * 
 * @author Isabelle Thorpe
 * @version 06.02.2021
 */
public class Ticket
{
    private String destination;
    private int cost;
    //private String date;
    private Date date;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int cost)
    {
        this.destination = destination;  
        this.cost = cost;
        //this.date = date;
        this.date = new Date();
    }

    /**
     * This method prints out the ticket details
     */
    public void print()
    {
        System.out.println("Destination: " + destination
            + ", Cost: " + cost + ", Date: " + date);

    }

    /**
     * This method returns the cost of a ticket
     * @return cost
     */
    public int getCost()
    {
        return cost; 
    }

    /**
     * This method returns the destination of a ticket
     * @return cost
     */
    public String getDestination()
    {
        return destination; 
    }

    /**
     * This method returns the date of a ticket
     * @return cost
     */
    public Date getDate()
    {
        return date; 
    }
}
