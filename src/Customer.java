import java.util.List;

public class Customer {
    private String name;
    private String contact;
    private String cart;

    private List<Items> items;

    public void addItems() {

    }

    public void removeItems() {

    }

    public void updateQuantity() {

    }
    public void showItems () {
        for (Items item : items) {
            System.out.println("Item Name: " + item.getItemName() + "\nUnit Price: " + item.getUnitPrice());
        }
    }

    public void generateBill() {

    }
}