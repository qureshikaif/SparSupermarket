import java.util.*;
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
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Spar Supermarket");
        System.out.println("1) Login as an admin\n2) Login as a customer\n3) Login as a Salesperson");
        int userChoice = input.nextInt();
        if(userChoice==1) {
            System.out.println("Press 1 to show inventory\nPress 2 to add item\nPress 3 to show number of online customers\nPress 4 to show number of Instore customers");
            inventory.showItems();

        }
        else if(userChoice==2) {
            System.out.println("1) Online customer\n2) Instore customer");
            int customerChoice = input.nextInt();
            if(customerChoice==1) {
                System.out.println("1) Show all items available");

            }
            else if(customerChoice==2) {
                System.out.println("1) Show all items available");
            }
        }
        else if(userChoice==3) {
            System.out.println("Press 1 to show total customers\nPress 2 to show total bills collected");
        }
        else {
            System.out.println("Invalid option selected");
        }
    }
}