import java.util.Scanner;
public class SalesPerson {
    Scanner input = new Scanner(System.in);
    private String salesPersonId="E5573-8561";
    private double totalBill;
    private double totalBillGst;
    private double totalInstoreBill = 0;
    private double totalInstoreBillGst = 0;
    private int totalInstoreCustomers;
    InStoreCustomer instoreCustomer = new InStoreCustomer();
    public void generateBill(String instoreUname,String instoreCnic,String itemCart,int itemQuantity, double unitPrice) {
        instoreCustomer.rewardPoints(itemQuantity);
        totalBill = itemQuantity*unitPrice;
        totalBillGst = totalBill*0.15;
        totalBill = totalBillGst + totalBill;
        totalInstoreBill = totalInstoreBill + totalBill;
        totalInstoreBillGst = totalInstoreBillGst + totalInstoreBillGst;
        System.out.println("--------------------------------");
        System.out.println("Your bill receipt: ");
        System.out.println("Salesperson ID: " + salesPersonId);
        System.out.println("Customer name: " + instoreUname);
        System.out.println("Customer CNIC: " + instoreCnic);
        System.out.println("Item: " + itemCart);
        System.out.println("Item Quantity: " + itemQuantity);
        System.out.println("You have " + instoreCustomer.getRewardPoints() + " reward points. Do you want to avail them now?\nPress Y to avail the discount\nPress N to cancel");
        String userChoice = input.next();
        if(userChoice.equals("Y") || userChoice.equals("y")) {
            System.out.println("Reward points availed. Your final bill after applying discount is " + (totalBill + instoreCustomer.rewardPointsToDiscount(totalBill)));
            System.out.println("--------------------------------");
        }
        else {
            System.out.println("No discount availed.");
            System.out.println("Your total bill is " + totalBill + " including GST");
            System.out.println("--------------------------------");
        }
        totalInstoreCustomers++;
    }
    public int getTotalInstoreCustomers () {
        return totalInstoreCustomers;
    }

    public double getTotalBillCollected(){
        return totalInstoreBill;
    }
    
    public double getTotalBillGSTCollected(){
        return totalInstoreBillGst;
    }

}