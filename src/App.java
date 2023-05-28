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

    public void addItem(Items item) {
        items.add(item);
    }

    public void removeItem(Items item) {
        items.remove(item);
    }

    public void checkItemQuantity(Items item) {
        int quantity = item.getQuantity();
        if (quantity < 50) {
            System.out.println("Item " + item.getItemName() + " is running low. Quantity: " + quantity);
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Spar Supermarket");
        System.out.println("1) Login as an admin\n2) Login as a customer\n3) Login as a Salesperson");
        int userChoice = input.nextInt();
        if(userChoice==1) {

        }
        else if(userChoice==2) {
            System.out.println("1) Online customer\n2) Instore customer");
            int customerChoice = input.nextInt();
            if(customerChoice==1) {

            }
            else if(customerChoice==2) {
                
            }
        }
        else if(userChoice==3) {

        }
        else {
            System.out.println("Invalid option selected");
        }
    }
}