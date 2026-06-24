package EcommercePlatformSearchFunction;

public class ProductSearch {
    public int binarySearchById(Product[] products, int targetProductId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (products[middle].getProductId() == targetProductId) {
                return middle;
            }

            if (products[middle].getProductId() < targetProductId) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}
