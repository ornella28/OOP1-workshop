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
            Product notebook = new Product(3, "Notebook", 1299.99);
            Product headphones = new Product(4, "Headphones", 199.99);
            Product backpack = new Product(5, "Backpack", 89.99);
            Product charger = new Product(6, "Charger", 49.99);
            Product pen = new Product(7, "Pen", 2.99);
            Product waterBottle = new Product(8, "Water Bottle", 14.99);
            Product calculator = new Product(9, "Calculator", 29.99);
            Product USBDrive = new Product(10, "USB Drive", 19.99);

            // create order and add products
            Order order = new Order(1001, 0.0, new java.util.ArrayList<>(), java.time.LocalDate.now());
            order.addProduct(phone);
            order.addProduct(tablet);
            order.addProduct(notebook);
            order.addProduct(headphones);
            order.addProduct(backpack);
            order.addProduct(charger);



            // print order details including the customer who placed the order, the products in the order, and the total price
         System.out.println("================= Order Details 1================");
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Order Date: " + order.getOrderDate());
         System.out.println("Customer: " + customer.getName() + ", Email: " + customer.getEmail() + ", Birth Date: " + customer.getBirthDate());
            System.out.println("Products in Order:");
            for (Product p : order.getProducts()) {
                System.out.println("- " + p.getItemName() + ": KR" + p.getPrice());
            }
            System.out.println("Total Price: " + order.getTotalPrice());


         //Creating a new order from another customer

         Customer customer2 = new Customer(2, "John Doe", "johndoe@gmail.com", java.time.LocalDate.of(1990, 1, 1));

         Order order2 = new Order(1002, 0.0, new java.util.ArrayList<>(), java.time.LocalDate.now());
         order2.addProduct(phone);
         order2.addProduct(charger);
         order2.addProduct(pen);
         order2.addProduct(waterBottle);

         // print order details including the customer who placed the order, the products in the order, and the total price
         System.out.println("================= Order Details 2================");
         System.out.println("Order ID: " + order2.getOrderId());
         System.out.println("Order Date: " + order2.getOrderDate());
         System.out.println("Customer: " + customer.getName() + ", Email: " + customer.getEmail() + ", Birth Date: " + customer.getBirthDate());
         System.out.println("Products in Order:");
         for (Product p : order2.getProducts()) {
             System.out.println("- " + p.getItemName() + ": KR" + p.getPrice() + "KR");
         }
         System.out.println("Total Price: " + order2.getTotalPrice() + "KR");








    }
}
