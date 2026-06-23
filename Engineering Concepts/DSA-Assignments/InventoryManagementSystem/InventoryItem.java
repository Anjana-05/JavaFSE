package InventoryManagementSystem;

public class InventoryItem {
    private int itemId;
    private String itemName;
    private int quantity;

    public InventoryItem(int itemId, String itemName, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item ID: " + itemId + ", Item Name: " + itemName + ", Quantity: " + quantity;
    }
}
