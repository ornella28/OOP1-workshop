package se.lexicon;

public class Product {

    //Encapsulation

    private int id;
    private String itemName;
    private double price;

    //Creating constructor to initialize fields
    public Product(int id, String itemName, double price) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
    }

    //Generating getters

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    //Override method toString()

    @Override
    public String toString() {
        return "Id: " + id +
                ", Item Name: '" + itemName + '\'' +
                ", Price: " + price;
    }
}
