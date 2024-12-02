package Orders;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

public void orderCreator(int orderID, int customerID, double totalAmount, String orderDate, double discount) {
    Order newOrder = new Order(orderID, customerID, totalAmount, orderDate, discount);
    orders.add(newOrder);
}

public void displayOrders() {
    for (Order order : orders) {
        System.out.println(order);
    }
}

public static void main(String[] args) {
    OrderManager manager = new OrderManager();

    manager.orderCreator(1, 101, 2500.0, "2020-01-01", 5);
    
    manager.displayOrders();
}
}