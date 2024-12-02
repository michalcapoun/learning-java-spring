package Orders;

public class Order {
    private int orderID;
    private int customerID;
    private double totalAmount;
    private String orderDate;
    private double discount;

    public Order(int orderID, int customerID, double totalAmount, String orderDate, double discount) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.discount = discount;
    }

        public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double calculateFinalAmount() {
        return totalAmount - (totalAmount * discount / 100);
    }

    @Override
    public String toString() {
        return "Order ID: " + orderID + ", Customer ID: " + customerID +
               ", Total Amount: " + totalAmount + ", Order Date: " + orderDate +
               ", Discount: " + discount + "%, Final Amount: " + calculateFinalAmount();
    }
}