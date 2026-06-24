package SortingCustomerOrders;

public class OrderSorter {
    public void sortByTotalPriceDescending(CustomerOrder[] orders) {
        for (int i = 0; i < orders.length - 1; i++) {
            for (int j = 0; j < orders.length - 1 - i; j++) {
                if (orders[j].getTotalPrice() < orders[j + 1].getTotalPrice()) {
                    CustomerOrder temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public void displayOrders(CustomerOrder[] orders) {
        for (CustomerOrder order : orders) {
            System.out.println(order);
        }
    }
}
