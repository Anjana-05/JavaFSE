package SortingCustomerOrders;

public class Main {
    public static void main(String[] args) {
        CustomerOrder[] orders = {
            new CustomerOrder(201, "Amit", 4500.50),
            new CustomerOrder(202, "Neha", 9200.00),
            new CustomerOrder(203, "Rahul", 3100.75),
            new CustomerOrder(204, "Sara", 7800.25)
        };

        OrderSorter orderSorter = new OrderSorter();

        System.out.println("Orders Before Sorting:");
        orderSorter.displayOrders(orders);

        orderSorter.sortByTotalPriceDescending(orders);

        System.out.println();
        System.out.println("Orders After Sorting by Total Price (Descending):");
        orderSorter.displayOrders(orders);
    }
}
