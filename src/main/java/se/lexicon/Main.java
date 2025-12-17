package se.lexicon;


public class Main {


     public static void main(String[] args) {

         // calling the customer class constructor
         Customer customer = new Customer(1, "Jane Smith", "janesmith@gmail.com", java.time.LocalDate.of(1985, 5, 15));
         System.out.println(customer);

            // calling the product class constructor
            Product product = new Product(101, "Laptop", 999.99);
            System.out.println(product);






    }
}
