package EcommercePlatformSearchFunction;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Phone"),
            new Product(102, "Laptop"),
            new Product(103, "Headphones"),
            new Product(104, "Smartwatch")
        };

        ProductSearch productSearch = new ProductSearch();
        int searchId = 103;
        int foundIndex = productSearch.binarySearchById(products, searchId);

        if (foundIndex != -1) {
            System.out.println("Product found: " + products[foundIndex]);
        } else {
            System.out.println("Product not found");
        }

        int missingId = 110;
        int missingIndex = productSearch.binarySearchById(products, missingId);

        if (missingIndex != -1) {
            System.out.println("Product found: " + products[missingIndex]);
        } else {
            System.out.println("Product not found for ID " + missingId);
        }
    }
}
