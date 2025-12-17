package se.lexicon;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {

    //Encapsulation
    private int orderId;
    private double totalPrice;
    private ArrayList<Product>products;
    private LocalDate orderDate;


    //Creating constructor to initialize fields

    public Order(int orderId, double totalPrice, ArrayList<Product> products, LocalDate orderDate) {
        this.orderId = orderId;
        this.totalPrice = totalPrice;
        this.products = new ArrayList<>();
        this.orderDate = orderDate;
    }
// method to calculate total price
    public double calculateTotalPrice(){
        double total=0;
        for(int i=0; i< products.size(); i++){
            total += products.get(i).getPrice();
        }
        return total;
    }

    //Generating getters

    public int getOrderId() {
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getTotalPrice() {
        return calculateTotalPrice();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    //method to add a product to the order
    public double addProduct(Product product) {
        products.add(product);
        return calculateTotalPrice();


    }
}
