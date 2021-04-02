import java.util.ArrayList;

/**
 * Manage o2's stock.
 * The stock is described by zero or more Products.
 * 
 * @author Isabelle Thorpe 
 * @version 12/03/2021
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;
    private Product product; 

    /**
     * Initialising the stock manager.
     */
    public StockManager()
    {
        // Starts ArrayList containing products
        stock = new ArrayList<>();
    }

    /**
     * Adding a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        // Adds a product to the list as item
        stock.add(item);
    }

    /**
     * Receive a delivery of a particular product if the prouct exists.
     * Increase the quantity of the product between 1-100.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void deliverProduct(int id, int amount)
    {
        Product product = findProduct(id);
        // Will only be able to increase quantity/delivery product
        // if the product can be found 
        if(product != null)
        {
            if (amount >= 1 && amount <= 100)
            {
                product.increaseQuantity(amount);
                System.out.println(amount + " units have been delivered for "
                    + product.getName() + "\n" + product.toString());
            }
            else
            {
                System.out.println("Please enter a value between 1-100.");
            }
        }
        else 
        {
            System.out.println("Product does not exist");
        }
    }

    /**
     * Finding a product by ID. If cannot find product nothing will be returned.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(id == product.getID())
            {
                return product;
            }
        }
        // Nothing will be returned if the product cannot be found by ID
        return null;
    }

    /**
     * Updating product name by ID.
     */
    public void updateProductNameById(int id, String newName)
    {
        for(Product product : stock)

        {
            if(id == product.getID())
            {
                // Allows us to give product a new name.
                System.out.println("Updating product name " + product.getName() 
                    + " from the stock list to");
                product.renameProduct(newName);
                System.out.println(newName);
            }
        }
    }

    /**
     * Removes a product by ID.
     */
    public void removeProduct(int id)
    {
        Product product = findProduct(id);
        System.out.println(product.getName() + "has been removed"); 
        if(product != null)
        {
            stock.remove(product);
        }
    }

    /**
     * Identies a product through use of keyword (Query).
     */
    public void getProductsByKeyword(String keyword)
    {
        for(Product product : stock)
        {
            if(product.getName().contains(keyword))
            {
                // Prints out products found using the keyword
                System.out.println(product.toString());
            }
            else
            {
                System.out.println("Please enter a product that exists"); 
            }
        }
    }

    /**
     * Prints out product low on stock, in this case more than 1 unit & less than 5 units.
     */
    public void getProductsLowStock()
    {
        System.out.println("Products with low stock:");
        for(Product product : stock)
        {   // Only gets product is less than 5 units.
            if(product.getQuantity() >= 1 && product.getQuantity() <= 5)
            {
                System.out.println(product.toString());
            }
        }
    }

    /**
     * Restocks products low on stock, adding 5 units.
     */
    public void restockProduct(int amount)
    {
        for(Product product : stock)
        {   // Only gets product is less than 5 units.
            if(product.getQuantity() >= 1 && product.getQuantity() <= 5)
            {
                if(amount >= 1 && amount <=10)
                {
                    product.increaseQuantity(amount);
                    System.out.println(product.getName() + " has been restocked with " + amount + " units "
                        + "\n" + product.toString());
                }
                else 
                {
                    System.out.println("Please enter a number between 1-10 ");
                }
            }
        }
    }

    /**
     * Finds product by ID to ensure it exists before sale.
     * Prints "not enough stock" if there is not enough stock for the sale.
     * Sells between 1-100 of the given item.
     * Shows the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id, int amount)
    {
        Product product = findProduct(id);

        if(product != null) 
        { // If product exists 
            if (amount <= product.getQuantity()) 
            { 
                if (product.getQuantity() >= 1 && product.getQuantity() <= 100)
                {
                    // There is enough stock
                    System.out.println(amount + " units sold " + product.getName());
                    product.sellQuantity(amount);
                    System.out.println("Stock update: " + 
                        product.toString());
                }
                else
                {
                    System.out.println("Please enter a value between 1-100.");
                }
            }
            else
            { 
                // There isn't enough stock
                System.out.println("Product " + product.getName() + " does not have enough stock.");
            }
        }
        else
        { 
            // If this product does not exist then
            System.out.println("Product " + product.getName() + " does not exist.");
        }
    }

    /**
     * Locates a product with the given ID, and returns how
     * many of this item are in stock. If the ID does not
     * match any product, returns zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        //Returns 0 if there there are no product "matches"
        return 0;
    }

    /**
     * Prints details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int id)
    {
        Product product = findProduct(id);

        if(product != null) 
        {
            // Prints an individual product and it's stock level.
            System.out.println(product.toString());
        }
    }

    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void printAllProducts()
    {
        printHeading();

        for(Product product : stock)
        {
            // Allows us to print out all products in the stock.
            System.out.println(product.toString());
        }

        System.out.println();
    }

    /**
     * Prints out the heading
     */
    public void printHeading()
    {
        // Prints out the heading
        System.out.println();
        System.out.println("o2's Stock List");
        System.out.println("====================");
        System.out.println();
    }
}
