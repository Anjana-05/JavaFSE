package InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager(5);

        inventoryManager.addItem(101, "Laptop", 15);
        inventoryManager.addItem(102, "Mouse", 40);
        inventoryManager.addItem(103, "Keyboard", 25);

        System.out.println("Inventory Details:");
        inventoryManager.displayInventory();

        System.out.println();
        InventoryItem searchedItem = inventoryManager.findItemById(102);
        if (searchedItem != null) {
            System.out.println("Search Result: " + searchedItem);
        } else {
            System.out.println("Item not found");
        }
    }
}
