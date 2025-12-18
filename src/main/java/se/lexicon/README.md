## Design improvement explanation

I extended the Order class by adding:
- A customer field: each order is associated with a specific customer.
- A quantity field: to specify the number of items ordered.

Why I added it:
- In real-world applications, orders are typically linked to customers, and knowing the quantity of items ordered is essential for processing and inventory management.

How it improves the system
- The system now better reflects a real order process:
    - One customer --> many orders relationship is established.
    - One order ---> many products with specified quantities.
    - This allows meaningful totals instead of assuming one item per product.
