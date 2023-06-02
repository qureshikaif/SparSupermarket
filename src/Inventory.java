import java.util.*;
public class Inventory {
    ArrayList<Items> items = new ArrayList<>();
    public void addItem(Items item) {
        items.add(item);
    }

    public void removeItem(Items item) {
        items.remove(item);
    }
    public void showInventory() {
        for (Items item : items) {
            System.out.println("Item Name: " + item.getItemName() + ", Quantity: " + item.getQuantity() + ", Unit Price: " + item.getUnitPrice());
        }
    }
    public void showItems() {
        for (Items item : items) {
            System.out.println("Item Name: " + item.getItemName() + ", Unit Price: " + item.getUnitPrice());
        }
    }
    public void upgradeQuantity(String Name){
        for (Items item : items) {
            if (item.getItemName().equals(Name)) {
                item.setQuantity(item.getQuantity() + 100);
                break;
            }
        }
    }

    public void checkItemQuantity(Items item) {
        int quantity = item.getQuantity();
        if (quantity < 50) {
            System.out.println("Item " + item.getItemName() + " is running low. Quantity: " + quantity);
        }
    }
}
