
/**
 * The Car represents all the cars at any dealership
 *
 * @author Isabelle
 * @version 22/01/21
 */
public class Car
{
    // Attributes, Fields, Variables
    
    private String make;
    
    private String color;
    // We do not take cars with more than 100000
    private int mileage;
    
    private int year;
    /**
     * Constructor for objects of class Car
     */
    public Car(String carBrand, int carYear) 
              
    {
        make = carBrand;
        color = "";
        year = carYear;
        mileage = 0;
    }
    /**
     * Add a dealership to a car
     */
    public void addDealership(Dealership dealership)
    {
       
    }
    /**
     * Add the cars mileage
     */
    public void addMileage(int carMileage)
    {
         mileage = carMileage;
    }
    /**
     * Add the cars color
     */
    public void addColor(String carColor)
    {
        color = carColor;
    }
    /**
     * Return the car color of this car
     */
    public String getCarColor()
    {
        return color;
    }
    /**
     * Print the cars make and year to the output model
     */
    public void print()
    {
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
   
    }
}