public class OnlineCustomer extends Customer{
    private String address;
    private String contact;
    private double totalBill;
    private double totalBillGst;
    private int totalOnlineCustomers;
    private double totalDiscount;
    private double totalBillCollected = 0;
    public void generateBill(String onlineUname,String onlineContact,String onlineAddress,String itemName, int itemQuantity,double unitPrice) {
        totalBill = itemQuantity*unitPrice;
        totalBillGst = totalBill*0.15;
        totalDiscount = totalBill*0.05;
        totalBill = totalBillGst + totalBill;
        totalBill = totalBill-totalDiscount;
        totalBillCollected = totalBillCollected + totalBill;
        System.out.println("--------------------------------");
        System.out.println("Your bill receipt: ");
        System.out.println("Customer name: " + onlineUname);
        System.out.println("Customer contact: " + onlineContact);
        System.out.println("Customer address: " + onlineAddress);
        System.out.println("Item: " + itemName);
        System.out.println("Item Quantity: " + itemQuantity);
        System.out.println("Your are getting 5% discount because of online shopping. Thanks for being our valuable customer. ");
        System.out.println("Your total bill is " + totalBill + " including GST");
        System.out.println("--------------------------------");
        totalOnlineCustomers++;
        increaseTotalCustomers();
    }
    public String getAddress () {
        return address;
    }
    public void setAddress (String address) {
        this.address = address;
    }
    public String getContact () {
        return contact;
    } 
    public void setContact (String contact) {
        this.contact = contact;
    }
    public int getTotalOnlineCustomers () {
        return totalOnlineCustomers;
    }
    public double gettotalBillCollected() {
        return totalBillCollected;
        
    }
}