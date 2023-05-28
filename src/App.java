import java.util.*;

class Customer {
    private String name;
    private String contact;
    private String cart;

    public void addItems() {

    }

    public void removeItems() {

    }

    public void updateQuantity() {

    }

    public void generateBill() {

    }
}

class OnlineCustomer extends Customer {
    private String address;

    public void onlineDiscount() {

    }
}

class InStoreCustomer extends Customer {
    private String rewardPoints;
}

class Items {
    private String itemName;
    private int quantity;
    private double unitPrice;

    public Items(String itemName, int quantity, double unitPrice) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    @Override
    public String toString() {
        return "Item Name: " + itemName + ", Quantity: " + quantity + ", Price: " + unitPrice;
    }
}

class SalesPerson {
    private String salesPersonId;

    public void caclulateBill() {

    }
}

class Inventory {
    private List<Items> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void showItem(){
        for (Items item : items) {
            System.out.println(item);
        }
    }

    public void addItem(Items item) {
        items.add(item);
    }
    
}

public class App {
    public static void main(String[] args) throws Exception {
        Inventory inventory = new Inventory();
        Items rice = new Items("Rice", 100, 400);
        Items flour = new Items("Flour", 100, 150);
        Items egg = new Items("Egg", 100, 25);
        Items meat = new Items("Meat", 100, 650);
        Items bread = new Items("Bread", 100, 80);
        inventory.addItem(rice);
        inventory.addItem(flour);
        inventory.addItem(egg);
        inventory.addItem(meat);
        inventory.addItem(bread);
        
        inventory.showItem();
    }
}
