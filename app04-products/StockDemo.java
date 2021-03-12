/**
 * Demonstrate o2's StockManager and Product classes.
 * 
 * @author Isabelle Thorpe
 * @version 12/03/2021
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * StockManager with at least 10 sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        // Mobile product list with sequential ID numbers

        manager.addProduct(new Product(101, "Apple iPhone 12"));
        manager.addProduct(new Product(102, "Apple iPhone 11"));
        manager.addProduct(new Product(103, "Apple iPhone X"));
        manager.addProduct(new Product(104, "Apple iPhone "));
        manager.addProduct(new Product(105, "OnePlus 9 Pro"));
        manager.addProduct(new Product(106, "OnePlus 9"));
        manager.addProduct(new Product(107, "OnePlus 9 E"));
        manager.addProduct(new Product(108, "Samsung Galaxy S21"));
        manager.addProduct(new Product(109, "Samsung Galaxy A12"));
        manager.addProduct(new Product(110, "Samsung Galaxy A71"));
        manager.addProduct(new Product(111, "Google Pixel 5"));
        manager.addProduct(new Product(112, "Google Pixel 4A"));
        manager.addProduct(new Product(113, "Google Pixel 4"));
    }

    /**
     * Demonstration of how the StockManager meets all
     * the user requirements by making a delivery of each product 
     * re-stocking it by various amounts and then selling each
     * product by various amounts.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.

        manager.printAllProducts();

        demoDeliverProducts();
        manager.printAllProducts();        

        demoSellProducts();
        manager.printAllProducts();        
    }

    /**
     * Demo of delivery of products.
     */
    private void demoDeliverProducts()
    {
        // Demo's the products delivery method
        manager.deliverProduct(103, 20);
    }

    /**
     * Demo of sale of products.
     */
    private void demoSellProducts()
    {
        // Demo's the products sale method
        manager.sellProduct(103, 10 );
    }    
    
    /**
     * Demo of updating the products name using products ID.
     */
    private void demoUpdateProductByNameID()
    {
        // Demo's the products update product by ID method
        manager.updateProductNameById(103, "");
    } 

    /**
     * Demo of printing the products low instock.
     */
    private void getProductsLowStock()
    {
        // Demo's the products get low stock method
        manager.getProductsLowStock();
    }
}
