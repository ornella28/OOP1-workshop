package se.lexicon;

public class OrderItem {

    private Product product;
    private int quantity;


    // Constructor
    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // Getters
    public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
    //method to get the price of the order item and the quantity
    public double getItemTotalPrice() {
        return product.getPrice() * quantity;
    }
    }

