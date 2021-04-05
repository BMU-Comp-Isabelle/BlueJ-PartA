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

        demoUpdateProductByNameID();
        manager.printAllProducts();

        demoRemoveProduct();
        manager.printAllProducts();
        
        demoGetProductsLowStock();
    }
    /**
     * Demo of delivery of products.
     */
    private void demoDeliverProducts()
    {
        // Demo's the products delivery method
        System.out.println("Delivering products");
        manager.deliverProduct(101, 50);
        manager.deliverProduct(102, 50);
        manager.deliverProduct(103, 50);
        manager.deliverProduct(104, 50);
        manager.deliverProduct(105, 50);
        manager.deliverProduct(106, 50);
        manager.deliverProduct(107, 50);
        manager.deliverProduct(108, 50);
        manager.deliverProduct(109, 50);
        manager.deliverProduct(110, 50);
        manager.deliverProduct(111, 50);
        manager.deliverProduct(112, 50);
        manager.deliverProduct(113, 50);
    }

    /**
     * Demo of sale of products.
     */
    private void demoSellProducts()
    {
        // Demo's the products sale method
        manager.sellProduct(101, 10);
        manager.sellProduct(102, 7);
        manager.sellProduct(103, 29);
        manager.sellProduct(104, 35);
        manager.sellProduct(105, 5);
        manager.sellProduct(106, 18);
        manager.sellProduct(107, 11);
        manager.sellProduct(108, 42);
        manager.sellProduct(109, 21);
        manager.sellProduct(110, 49);
        manager.sellProduct(111, 3);
        manager.sellProduct(112, 15);
        manager.sellProduct(113, 34);
    }    

    public void demoUpdateProductNameById()
    {
        // Demo's updating product name by ID
        manager.updateProductNameById(101, "iPhone 11 S");
    }

    public void demoRemoveProduct()
    {
        // Demo's product removal by ID
        manager.removeProduct(113);
    }

    public void demoGetProductsByKeyword()
    {
        // Demo's printing a list of products given a keyword
        manager.getProductsByKeyword("iPhone");
    }

    private void demoUpdateProductByNameID()
    {
        // Demo's the products update product by ID method
        manager.updateProductNameById(103, "iphone SE");
    } 

    /**
     * Demo of printing the products low instock.
     */
    private void demoGetProductsLowStock()
    {
        // Demo's the products get low stock method
        manager.getProductsLowStock();
    }

}