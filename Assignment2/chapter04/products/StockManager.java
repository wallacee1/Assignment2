import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Eric Wallace 
 * @version 1.0
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        for(Product product : stock) {
            if(product.getID() == item.getID()) {
                System.out.println("Product with that ID already" + "exists");
                return;
            }
        }
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        Product product = findProduct(id);
        if(product != null) {
            product.increaseQuantity(amount);
        }
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock) {
            if(product.getName().equals(id)){
                return product;
            }
        }
        return null;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        Product myProduct = findProduct(id);
        if(myProduct == null) {
            System.out.println("Can't find a product with that ID.");
            return myProduct.getQuantity();
        }
        else {
            return 0;
        }
        
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails(int thresholdQuantity)
    {
        for(Product product : stock) {
            if(product.getQuantity() < thresholdQuantity)
                System.out.println(product.toString());
        }
    }
    
    /**
     * Print details for low stock products.
     */
    public void printLowStockProducts (int upperLimit)
    {
        for(Product product : stock) {
            if(product.getQuantity() < upperLimit) {
                System.out.println(product.toString());
            }
        }
    }   
}
