
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Isabelle Thorpe
 * @version 31/03/21
 */
public class StockApp
{
    private InputReader reader;
    private StockManager manager;
    private Product product;

    // constants
    private final String ADD = "ADD";
    private final String PRINT = "PRINT";
    private final String PRINTPRODUCT = "PRINT PRODUCT";
    private final String REMOVE = "REMOVE";
    private final String QUIT = "QUIT";
    private final String DELIVER = "DELIVER";
    private final String SELL = "SELL";
    private final String SEARCH = "SEARCH";
    private final String LOWSTOCK = "LOW STOCK";
    private final String RESTOCK = "RESTOCK";
    private final String RENAME = "RENAME";

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        manager = new StockManager();
        reader = new InputReader();
    }

    /**
     *  Display a list of menu choices and get the user's
     *  choice.
     */
    public void run()
    {
        boolean finished = false;
        while(!finished)
        {
            // User automatically see's this on application run and can select choice from menu
            printHeading();
            printMenuChoices();
            String choice = reader.getString("Please enter your choice > ");
            choice = choice.toUpperCase();
            executeMenuChoice(choice);

            if (choice.equals(QUIT))
            {
                // Quit closes application by becoming "true"
                finished = true;
                System.out.println("Thank you for running the application");    
            }
        }
    }

    /**
     *  Resond to the user's choice
     */
    private void executeMenuChoice(String choice)
    {
        if(choice.equals(ADD))
        {   
            // User input to add product, entering product name and ID
            String name = reader.getString("Please enter the product name you wish to add > ");
            int id = reader.getInt("Please enter the product ID you wish to add > ");
            Product product = new Product(id, name);
            manager.addProduct(product);
        }
        if(choice.equals(PRINT))
        {   
            // User input to print all products
            manager.printAllProducts();
        }
        if(choice.equals(PRINTPRODUCT))
        {
            // User input to print single product
            int id = reader.getInt("Please enter the product ID you wish to print > ");
            manager.printProduct(id);
        }
        if(choice.equals(REMOVE))
        {   
            // User input to remove a product
            int id = reader.getInt("Please enter the product ID you wish to remove > ");
            manager.findProduct(id);
            manager.removeProduct(id);
        }
        if(choice.equals(DELIVER))
        {
            // User input to deliver a quantity of product
            int id = reader.getInt("Please enter the product ID for delivery > ");
            int amount = reader.getInt("Please enter the number of units for delivery > ");
            manager.deliverProduct(id, amount);
        }
        if(choice.equals(SELL))
        {
            // User input to sell a quantity of product
            int id = reader.getInt("Please enter the product ID for sale > ");
            int amount = reader.getInt("Please enter the number of units for sale > ");
            manager.sellProduct(id, amount);
        }
        if(choice.equals(LOWSTOCK))
        {
            // User input to check low stock products
            manager.getProductsLowStock();
        }
        if(choice.equals(SEARCH))
        {
            // User input to search for a product
            String keyword = reader.getString("Please enter the product name you wish to search for > ");
            manager.getProductsByKeyword(keyword);
        }
        if(choice.equals(RESTOCK))
        {
            // User input to restock low stock products by 5 units
            manager.restockProduct(5);
        }
        if(choice.equals(RENAME))
        {   
            int id = reader.getInt("Please enter the product ID to rename > ");
            String name = reader.getString("Please enter the product replacement name > ");
            manager.updateProductNameById(id, name);
        }
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:         Add a new product");
        System.out.println("    Remove:      Remove an old product");
        System.out.println("    Deliver:     Deliver a product");
        System.out.println("    Sell:        Sell a product");
        System.out.println("    Print Single:Print one product");
        System.out.println("    Print:       Print all products");
        System.out.println("    Low Stock:   Print products with low stock");
        System.out.println("    Restock:     Restock products");
        System.out.println("    Rename:      Rename a product");
        System.out.println("    Search:      Search for a product");
        System.out.println("    Quit:        Quit the program");
        System.out.println();        
    }

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: Isabelle Thorpe");
        System.out.println("******************************");
    }
}