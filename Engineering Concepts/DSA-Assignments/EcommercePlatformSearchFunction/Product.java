package EcommercePlatformSearchFunction;

public class Product {
    private int productId;
    private String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Product Name: " + productName;
    }
}
