package se.lexicon;

public class Product {

    //Encapsulation

    private int id;
    private String itemName;
    private double totalPrice;

    //Creating constructor to initialize fields
    public Product(int id, String itemName, double totalPrice) {
        this.id = id;
        this.itemName = itemName;
        this.totalPrice = totalPrice;
    }

    //Generating getters

    public String getItemName() {
        return itemName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    //Override method toString()

    @Override
    public String toString() {
        return "Id: " + id +
                ", Item Name: '" + itemName + '\'' +
                ", Total Price: " + totalPrice;
    }
}
