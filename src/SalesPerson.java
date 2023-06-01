public class SalesPerson {
    private String salesPersonId="121212";
    public void generateBill(String instoreUname,String instoreCnic,String itemCart,int itemQauntity) {
        System.out.println("Sales Person ID:" + salesPersonId);
        System.out.println("Customer name:" + instoreUname);
        System.out.println("Customer Cnic: " + instoreCnic);
        System.out.println("Customer cart: " + itemCart);
        System.out.println("Item Qauntity: " + itemQauntity);
        System.out.println("Your total bill is ");
    }
    
}
