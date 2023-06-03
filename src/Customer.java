
public abstract class Customer {
    private String name;
    private int totalCustomers=0;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTotalCustomers () {
        return totalCustomers;
    }
    public void increaseTotalCustomers() {
        this.totalCustomers++;
    }
}

