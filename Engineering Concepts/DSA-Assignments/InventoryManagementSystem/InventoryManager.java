package InventoryManagementSystem;

public class InventoryManager {
    private InventoryItem[] items;
    private int count;

    public InventoryManager(int capacity) {
        items = new InventoryItem[capacity];
        count = 0;
    }

    public boolean addItem(int itemId, String itemName, int quantity) {
        if (count == items.length) {
            return false;
        }

        items[count] = new InventoryItem(itemId, itemName, quantity);
        count++;
        return true;
    }

    public InventoryItem findItemById(int itemId) {
        for (int index = 0; index < count; index++) {
            if (items[index].getItemId() == itemId) {
                return items[index];
            }
        }
        return null;
    }

    public void displayInventory() {
        if (count == 0) {
            System.out.println("Inventory is empty");
            return;
        }

        for (int index = 0; index < count; index++) {
            System.out.println(items[index]);
        }
    }
}
