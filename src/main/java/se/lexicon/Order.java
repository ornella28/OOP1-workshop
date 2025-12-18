package se.lexicon;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {

    //Encapsulation
    private int orderId;
    private double totalPrice;
    private ArrayList<Product>products;
    private LocalDate orderDate;
    private Customer customer;
    private ArrayList<Integer> quantities;

    //Creating constructor to initialize fields

    public Order(int orderId, double totalPrice, ArrayList<Product> products, LocalDate orderDate, Customer customer, ArrayList<Integer> quantities) {
        this.orderId = orderId;
        this.totalPrice = totalPrice;
        this.products = products;
        this.orderDate = orderDate;
        this.customer = customer;
        this.quantities = quantities;
    }
// method to calculate total price
    public double calculateTotalPrice(){
        double total=0;
        for(int i=0; i< products.size(); i++){
            total += products.get(i).getPrice()* quantities.get(i);
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
    public ArrayList<Integer> getQuantities() {
        return quantities;
    }

    //method to add a product to the order
    public double addProduct(Product product, int quantity) {
        products.add(product);
        quantities.add(quantity);
        return calculateTotalPrice();


    }



}
