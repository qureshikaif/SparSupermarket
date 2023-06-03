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
        try (Scanner input = new Scanner(System.in)) {
            while(true){
                System.out.println("\n------------------------------");
                System.out.println("Welcome to Spar Supermarket");
                System.out.println("------------------------------\n");
                System.out.println("1) Login as an admin\n2) Login as a customer\n3) Login as a Salesperson");
                int userChoice = input.nextInt();
                if(userChoice==1) {
                    System.out.println("Enter your login details:");
                    System.out.print("Username: ");
                    String username=input.next();
                    System.out.print("Password: ");
                    String password=input.next();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
                    if(username.equals("admin") && password.equals("admin123")){
                        System.out.println("Press 1 to show inventory\nPress 2 to increase quantity\nPress 3 to show number of Instore customers\nPress 4 to show number of Online customers\nPress 5 to show total sales in PKR");
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
                            System.out.println("Total Online customers today: " + onlineCustomer.getTotalOnlineCustomers());
                        }
                        else if(choice==5) {
                            System.out.println("Your total sales today: " + (onlineCustomer.getTotalBill()+salesPerson.getTotalBill()));
                        }
                        else {
                            System.out.println("Invalid Input");
                        }
                    }
                    else {
                        System.out.println("Invalid Login Credentials");
                    }
                }
                else if(userChoice==2) {
                    System.out.println("1) Online customer\n2) Instore customer");
                    int customerChoice = input.nextInt();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
                    if(customerChoice==1) {
                        System.out.println("Enter your name:");
                        input.nextLine(); // Consume the newline character
                        onlineCustomer.setName(input.nextLine());
                        System.out.println("Enter your contact number:");
                        onlineCustomer.setContact(input.nextLine());
                        System.out.println("Enter your address:");
                        onlineCustomer.setAddress(input.nextLine());
                        System.out.println("All items available:");
                        inventory.showItems();
                        System.out.println("Select an item to add to cart:");
                        int itemCart = input.nextInt();
                        input.nextLine(); // Consume the newline character
                        inventory.checkItemQuantity(inventory.items.get(itemCart-1));
                        System.out.println("Enter the quantity");
                        int itemQuantity = input.nextInt();
                        input.nextLine(); // Consume the newline character
                        System.out.println("Press Y to generate the bill\nPress N to go back to the Main Menu");
                        String generateBillChoice = input.next();
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
                        if(generateBillChoice.equalsIgnoreCase("Y")) {
                            onlineCustomer.generateBill(onlineCustomer.getName(),onlineCustomer.getContact(), onlineCustomer.getAddress(),inventory.items.get(itemCart-1).getItemName() ,itemQuantity,inventory.items.get(itemCart-1).getUnitPrice());
                            inventory.items.get(itemCart-1).setQuantity(inventory.items.get(itemCart-1).getQuantity()-itemQuantity);
                            onlineCustomer.increaseTotalCustomers();
                        }
                    }
                    else if(customerChoice==2) {
                        System.out.println("Enter your name");
                        input.nextLine(); // Consume the newline character
                        instoreCustomer.setName(input.nextLine());
                        System.out.println("Enter your CNIC number:");
                        instoreCustomer.setCnic(input.nextLine());
                        System.out.println("All items available:");
                        inventory.showItems();
                        System.out.println("Select an item to add to cart:");
                        int itemCart = input.nextInt();
                        input.nextLine(); // Consume the newline character
                        inventory.checkItemQuantity(inventory.items.get(itemCart-1));
                        System.out.println("Enter the quantity");
                        int itemQuantity = input.nextInt();
                        input.nextLine(); // Consume the newline character
                        instoreCustomer.rewardPoints(itemQuantity);
                        System.out.println("Press Y to generate the bill\nPress N to go back to the Main Menu");
                        String generateBillChoice = input.next();
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
                        if(generateBillChoice.equalsIgnoreCase("Y")) {
                            salesPerson.generateBill(instoreCustomer.getName(),instoreCustomer.getCnic(),inventory.items.get(itemCart-1).getItemName(),itemQuantity,inventory.items.get(itemCart-1).getUnitPrice());
                            inventory.items.get(itemCart-1).setQuantity(inventory.items.get(itemCart-1).getQuantity()-itemQuantity);
                            instoreCustomer.increaseTotalCustomers();
                        }
                        else {
                            System.out.println(" ");
                        }
                    }
                }
                else if(userChoice==3) {
                    System.out.println("Enter your login details:");
                    System.out.print("Salesperson ID: ");
                    String salesPersonId=input.next();
                    System.out.print("Password: ");
                    String salesPassword = input.next();
                    if(salesPersonId.equals("E5573-8561") && salesPassword.equals("sales123")){
                        System.out.println("Press 1 to show total customers\nPress 2 to show total bills collected");
                        int saleschoice = input.nextInt();
                        if(saleschoice == 1){
                            System.out.println("Total Instore customers today: " + salesPerson.getTotalInstoreCustomers());
                        }
                        else if(saleschoice == 2){
                            System.out.println("Total Instore Bill today: " + salesPerson.getTotalBill());
                        }
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
}
