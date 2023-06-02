import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Inventory inventory = new Inventory();
        SalesPerson salesPerson = new SalesPerson();
        InStoreCustomer instoreCustomer = new InStoreCustomer();
        OnlineCustomer onlineCustomer = new OnlineCustomer();
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
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Welcome to Spar Supermarket");
            System.out.println("1) Login as an admin\n2) Login as a customer\n3) Login as a Salesperson");
            int userChoice = input.nextInt();
            if(userChoice==1) {
                System.out.println("Enter your login details:");
                System.out.println("Username");
                String username=input.next();
                System.out.println("Password");
                String password=input.next();
                if(username.equals("admin") && password.equals("admin123")){
                    System.out.println("Press 1 to show inventory\nPress 2 to add item\nPress 3 to show number of online customers\nPress 4 to show number of Instore customers");
                    int choice = input.nextInt();
                    if(choice==1) {
                        System.out.println("Showing Inventory");
                        inventory.showInventory();
                    }
                    else if(choice==2) {
                        System.out.println("Enter the name of the product");
                        String item_name = input.next();
                        inventory.upgradeQuantity(item_name);
                    }
                    else if(choice==3) {
                        System.out.println("Total Instore customers today: " + salesPerson.getTotalInstoreCustomers());
                    }
                    else if(choice==4) {

                    }
                    else {
                        System.out.println("Invalid Input");
                    }
                }
                else{
                    System.out.println("Invalid Login Credentials");
                }
            }
            else if(userChoice==2) {
                System.out.println("1) Online customer\n2) Instore customer");
                int customerChoice = input.nextInt();
                if(customerChoice==1) {
                    System.out.println("Enter your name:");
                    String onlineUname = input.next();
                    System.out.println("Enter your contact number:");
                    String onlineContact= input.next();
                    System.out.println("Enter your address:");
                    String onlineAddress = input.next();
                    System.out.println("All items available:");
                    inventory.showItems();
                    System.out.println("Select an item to add to cart:");
                    int itemCart = input.nextInt();
                    System.out.println("Enter the quantity");
                    int itemQuantity = input.nextInt();
                    System.out.println("Press Y to generate the bill");
                    String generateBillChoice = input.next();
                    if(generateBillChoice.equals("Y")) {
                        onlineCustomer.generateBill(onlineUname,onlineContact, onlineAddress,inventory.items.get(itemCart-1).getItemName() ,itemQuantity,inventory.items.get(itemCart-1).getUnitPrice());
                    }
                }
                else if(customerChoice==2) {
                    System.out.println("Enter your name");
                    String instoreUname = input.next();
                    System.out.println("Enter your CNIC number:");
                    String instoreCnic = input.next();
                    System.out.println("All items available:");
                    inventory.showItems();
                    System.out.println("Select an item to add to cart:");
                    int itemCart = input.nextInt();
                    System.out.println("Enter the quantity");
                    int itemQuantity = input.nextInt();
                    instoreCustomer.rewardPoints(itemQuantity);
                    System.out.println("Press Y to generate the bill");
                    String generateBillChoice = input.next();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
                    if(generateBillChoice.equals("Y")) {
                        salesPerson.generateBill(instoreUname,instoreCnic,inventory.items.get(itemCart-1).getItemName(),itemQuantity,inventory.items.get(itemCart-1).getUnitPrice());
                        inventory.items.get(itemCart-1).setQuantity(inventory.items.get(itemCart-1).getQuantity()-itemQuantity);
                    }
                    else {
                        System.out.println(" ");
                    }
                }
            }
            else if(userChoice==3) {
                System.out.println("Enter your login details:");
                System.out.println("Username");
                String salesPersonId=input.next();
                System.out.println("Password");
                String salesPassword = input.next();
                if(salesPersonId.equals("sales") && salesPassword.equals("sales123")){
                    System.out.println("Press 1 to show total customers\nPress 2 to show total bills collected");
                }
                else{
                    System.out.println("Invalid Login Credentials");
                }
            }
            else {
                System.out.println("Invalid option selected");
            }
        }
    }
}