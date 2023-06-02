public class OnlineCustomer extends Customer{
    private double totalBill;
    private int totalOnlineCustomers;
    public void onlineDiscount() {

    }
    public void generateBill(String onlineUname,String onlineContact,String onlineAddress,String itemName, int itemQuantity,double unitPrice) {
        totalBill = itemQuantity*unitPrice;
        System.out.println("Your bill receipt: ");
        System.out.println("Customer name: " + onlineUname);
        System.out.println("Customer contact: " + onlineContact);
        System.out.println("Customer address: " + onlineAddress);
        System.out.println("Item: " + itemName);
        System.out.println("Item Quantity: " + itemQuantity);
        System.out.println("Your total bill is " + totalBill*0.15 + " including GST");
        totalOnlineCustomers++;
        
    }
    public int getTotalOnlineCustomers () {
        return totalOnlineCustomers;
    }
}
