class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Static method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        // Create instances of Product
        Product product1 = new Product("MacBook", 89999.00);
        Product product2 = new Product("iPhone", 79999.00);

        // Display details of each product
        product1.displayProductDetails();
        product2.displayProductDetails();

        // Display total number of products created
        Product.displayTotalProducts();
    }
}

//Sample Output
//Product Name: MacBook
//Price: 89999.0
//Product Name: iPhone
//Price: 79999.0
//Total Products: 2