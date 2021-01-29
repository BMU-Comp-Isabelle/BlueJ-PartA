/**
 * Write a description of class Dealership here.
 *
 * @author Isabelle Thorpe
 * @version 27/01/2021
 */
public class Dealership
{
    // instance variables - replace the example below with your own
    private String location;

    /**
     * Constructor for objects of class Dealership
     */
    public Dealership(String l)

    {
       location = l;
    }
    
     /**
     * Return the cars location 
     */
    public String getLocation()
    {
         return this.location;
    }
}