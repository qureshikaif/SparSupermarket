public class SalesPerson {
    private String salesPersonId="E5573-8561";
    private double totalBill;
    private int totalInstoreCustomers;
    public void generateBill(String instoreUname,String instoreCnic,String itemCart,int itemQuantity, double unitPrice) {
        totalBill = itemQuantity*unitPrice;
        System.out.println("Your bill receipt: ");
        System.out.println("Salesperson ID: " + salesPersonId);
        System.out.println("Customer name: " + instoreUname);
        System.out.println("Customer CNIC: " + instoreCnic);
        System.out.println("Item: " + itemCart);
        System.out.println("Item Quantity: " + itemQuantity);
        System.out.println("Your total bill is " + totalBill*0.15 + " including GST");
        totalInstoreCustomers++;
    }
    public int getTotalInstoreCustomers () {
        return totalInstoreCustomers;
    }
    
}
