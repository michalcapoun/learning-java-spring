public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class OrderProduct extends Product {
    private int quantity;

    public OrderProduct(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    public double totalPrice() {
        return getPrice() * quantity;
    }
}
