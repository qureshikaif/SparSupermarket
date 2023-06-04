import java.util.*;
public class Inventory {
    ArrayList<Items> items = new ArrayList<>();
    public void addItem(Items item) {
        items.add(item);
    }
    public void showItems(boolean includeQuantity) {
        int counter = 1;
        for (Items item : items) {
            System.out.print(counter + ". Item Name: " + item.getItemName());
            if (includeQuantity) {
                System.out.print(", Quantity: " + item.getQuantity());
            }
            System.out.println(", Unit Price: " + item.getUnitPrice());
            counter++;
        }
    }
    public void upgradeQuantity(String Name){
        boolean found = false;
        for (Items item : items) {
            if (item.getItemName().equalsIgnoreCase(Name)) {
                item.setQuantity(item.getQuantity() + 100);
                System.out.println("100 quantity added.");
                found=true;
                break;
            }  
        }
        if (!found) {
            System.out.println("Item '" + Name + "' not found in the inventory.");
        } 
    }

    public void checkItemQuantity(Items item) {
        int quantity = item.getQuantity();
        if (quantity < 50) {
            System.out.println("Item " + item.getItemName() + " is running low. Quantity: " + quantity);
            System.out.println("Exiting Program......");
            System.exit(0);
        }
    }
}
