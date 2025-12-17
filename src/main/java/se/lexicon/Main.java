package se.lexicon;


public class Main {


     public static void main(String[] args) {

         // calling the customer class constructor
         Customer customer = new Customer(1, "Jane Smith", "janesmith@gmail.com", java.time.LocalDate.of(1985, 5, 15));
         System.out.println(customer);

            // calling the product class constructor
            Product product = new Product(101, "Laptop", 999.99);
            System.out.println(product);

            // create products
            Product phone = new Product(1, "Phone", 699.99);
            Product tablet = new Product(2, "Tablet", 399.99);

            // create order and add products
            Order order = new Order(1001, 0.0, new java.util.ArrayList<>(), java.time.LocalDate.now());
            order.addProduct(phone);

            // print order details including the customer who placed the order, the products in the order, and the total price
         System.out.println("================= Order Details ================");
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Order Date: " + order.getOrderDate());
         System.out.println("Customer: " + customer.getName() + ", Email: " + customer.getEmail());
            System.out.println("Products in Order:");
            for (Product p : order.getProducts()) {
                System.out.println("- " + p.getItemName() + ": KR" + p.getTotalPrice());
            }
            System.out.println("Total Price: " + order.getTotalPrice());








    }
}
