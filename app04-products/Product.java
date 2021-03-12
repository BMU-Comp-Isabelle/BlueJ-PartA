/**
 * o2's Products
 * 
 * @author Isabelle Thorpe
 * @version 12/03/2021
 */
public class Product
{
    // An identifying number for this product.
    private int id;
    // The name of this product.
    private String name;
    // The quantity of this product in stock.
    private int quantity;

    /**
     * Constructor for objects of class Product.
     * The initial stock quantity is zero.
     * @param id The product's identifying number.
     * @param name The product's name.
     */
    public Product(int id, String name)
    {
        // Constructor for id, name, and quantity
        this.id = id;
        this.name = name;
        quantity = 0;
    }

    /**
     * Returns The product's id.
     */
    public int getID()
    {
        // Returns product id
        return id;
    }

    /**
     * Returns The product's name.
     */
    public String getName()
    {
        // Returns products name through getter method
        return name;
    }

    /**
     * Update the product's name.
     */
    public void renameProduct(String newName)
    {
        // Applys new name to overwrite name given through the constructor
        this.name = newName;
    }

    /**
     * Returns the quantity in stock.
     */
    public int getQuantity()
    {
        // Getter returns quantity of stock
        return quantity;
    }

    /**
     * Returns The id, name and quantity in stock.
     */
    public String toString()
    {
        // Returns id, name and stock levels (quantity)
        return id + ": " +  name + " stock level: " + quantity;
    }

    /**
     * Restock with the given amount of this product.
     * The current quantity is incremented by the given amount.
     * @param amount The number of new items added to the stock.
     * This must be greater than zero.
     */
    public void increaseQuantity(int amount)
    {
        if(amount > 0) 
        {
            // Increments the value of amount and applies to quantity
            quantity += amount;
        }
        else 
        {

            System.out.println("Attempt to restock " + name +
            " with a non-positive amount: " + amount);
        }
    }

    /**
     * Sells one of these products.
     * An error is reported if there appears to be no stock.
     */
    public void sellQuantity(int amount)
    {
        if(quantity > 0) 
        {
            // Subtracting the value of amount and assigning to quantity
            quantity -= amount;
        }
        else 
        {
            // Warning messsage, unable to sell an out of stock item
            System.out.println(
                "Attempt to sell an out of stock item: " + name);
        }
    }
}
