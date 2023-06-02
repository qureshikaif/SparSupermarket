public class OnlineCustomer extends Customer{
    private double totalBill;
    private double totalBillGst;
    private int totalOnlineCustomers;
    public void generateBill(String onlineUname,String onlineContact,String onlineAddress,String itemName, int itemQuantity,double unitPrice) {
        totalBill = itemQuantity*unitPrice;
        totalBillGst = totalBill*0.15;
        totalBill = totalBillGst + totalBill;
        System.out.println("Your bill receipt: ");
        System.out.println("Customer name: " + onlineUname);
        System.out.println("Customer contact: " + onlineContact);
        System.out.println("Customer address: " + onlineAddress);
        System.out.println("Item: " + itemName);
        System.out.println("Item Quantity: " + itemQuantity);
        System.out.println("Your are getting 5% discount because of online shopping. Thanks for being our valuable customer. ");
        System.out.println("Your total bill is " + totalBill + " including GST");
        totalOnlineCustomers++;

    }
    public int getTotalOnlineCustomers () {
        return totalOnlineCustomers;
    }
}
