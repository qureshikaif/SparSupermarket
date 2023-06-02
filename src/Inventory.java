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
        int counter1 = 1;
        for (Items item : items) {
            System.out.println(counter1 + ". Item Name: " + item.getItemName() + ", Quantity: " + item.getQuantity() + ", Unit Price: " + item.getUnitPrice());
            counter1++;
        }
    }
    public void showItems() {
        int counter2 = 1;
        for (Items item : items) {
            System.out.println(counter2 + ". Item Name: " + item.getItemName() + ", Unit Price: " + item.getUnitPrice());
            counter2++;
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
