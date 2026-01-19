### Project build by using oops concepts ###
This project is a Food Delivery System that utilizes Object-Oriented Programming (OOP) concepts to manage food orders, deliveries, and customer interactions. The system is designed to handle various functionalities such as placing orders, tracking deliveries, and managing customer information.
#### Features:
- **Order Management**: Customers can place orders for food items from a menu. The system keeps track of order details, including item names, quantities, and prices.
- **Delivery Tracking**: The system allows customers to track the status of their food deliveries in real-time.
- **Customer Management**: The system maintains customer profiles, including contact information and order history.
#### Implementation:
- **Classes**:
    - `Customer`: Represents a customer with attributes like name, contact information, and order history.
    - `Order`: Represents a food order with attributes such as order ID, items, total price, and status.
    - `Menu`: Contains a list of available food items and their prices.
    - `Delivery`: Manages delivery details, including delivery person information and delivery status.
- **Methods**:
    - `placeOrder()`: Allows customers to place a new food order.
    - `trackDelivery()`: Enables customers to track the status of their delivery.
    - `updateOrderStatus()`: Updates the status of an order (e.g., preparing, out for delivery, delivered).
    - `addCustomer()`: Adds a new customer to the system.
    - `viewOrderHistory()`: Displays a customer's past orders.
#### Technologies Used:
- Programming Language: Python/Java/C++ (choose one based on your implementation)
- Data Storage: In-memory data structures or a simple database (e.g., SQLite)
- Object-Oriented Programming (OOP)
#### How to Run:
1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Run the main program class(Main.java)
#### Note
- This is a basic implementation of a food delivery system using OOP concepts. You can further enhance it by adding features like payment processing, user authentication, and integration with external APIs for real-time delivery tracking.
