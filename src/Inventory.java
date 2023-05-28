import java.util.*;
public class Inventory {
    private List<Items> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Items item) {
        items.add(item);
    }

    public void removeItem(Items item) {
        items.remove(item);
    }
    public void showItems() {
        for (Items item : items) {
            System.out.println("Item Name: " + item.getItemName() +
                    ", Quantity: " + item.getQuantity() +
                    ", Unit Price: " + item.getUnitPrice());
        }
    }

    public void checkItemQuantity(Items item) {
        int quantity = item.getQuantity();
        if (quantity < 50) {
            System.out.println("Item " + item.getItemName() + " is running low. Quantity: " + quantity);
        }
    }
}
