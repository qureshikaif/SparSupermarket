public class InStoreCustomer extends Customer {
    private String cnic;
    private int rewardPoints;

    public String getCnic() {
        return cnic;
    }
    public void setCnic(String cnic) {
        this.cnic = cnic;
    }
    public void rewardPoints (int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
    public int getRewardPoints () {
        return rewardPoints;
    }
    public double rewardPointsToDiscount (double totalBill) {
        if(this.rewardPoints == 10) {
            return totalBill * 0.02;
        }
        else if(this.rewardPoints > 10 || this.rewardPoints <=30) {
            return totalBill * 0.06;
        }
        else if(this.rewardPoints > 30) {
            return totalBill * 0.08;
        }
        return 0.0;
    }
}
