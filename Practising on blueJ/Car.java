
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

    private Dealership dealership;
    /**
     * Constructor for objects of class Car
     */
    public Car(String carBrand, String carColor,
    int carYear, int carMileage) 

    {
        make = carBrand;
        color = carColor;
        year = carYear;
        mileage = carMileage;
    
    }

    /**
     * Add a dealership to the car
     */
    public void addDealership(Dealership dealership)
    {
        this.dealership = dealership;
    }
    
    /**
     * Change the cars make
     */
    public void changecarBrand(String carBrand)
    {
        make = carBrand;
    }

    /**
     * Change the cars color
     */
    public void changeColor(String carColor)
    {
        color = carColor;
    }

    /**
     * Change the cars mileage
     */
    public void changeMileage(int carMileage)
    {
        mileage = carMileage;
    }

    /**
     * Change the cars year
     */
    public void changecarYear(int carYear)
    {
        year = carYear;
    }

    /**
     * Print the cars make and year to the output model
     */
    public void print()
    {
        System.out.println("");
        System.out.println("###############");
        System.out.println("");
        System.out.println("This following vehicle is");
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
        System.out.println("Color: " + color);
        System.out.println("Dealership: " + dealership.getLocation());        System.out.println("");
        System.out.println("###############");
        System.out.println("");

    }
}