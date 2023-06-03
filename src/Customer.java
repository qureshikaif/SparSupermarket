import java.util.*;
public class Customer {
    // Add an ArrayList to store the items in the customer's cart
    protected ArrayList<Items> cart = new ArrayList<>();

    public void addItemToCart(Items item) {
        cart.add(item);
    }

    public void removeItemFromCart(Items item) {
        cart.remove(item);
    }

    public void upgradeItemQuantity(Items item, int newQuantity) {
        item.setQuantity(newQuantity);
    }

    public ArrayList<Items> getCart() {
        return cart;
    }
}
