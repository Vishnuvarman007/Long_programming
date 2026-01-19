# 🍽️ Food Delivery Management System (OOP-Based)

## 📌 Overview  
This project is a **Food Delivery System** built using **Object-Oriented Programming (OOP) principles**. It simulates a real-world food delivery application by managing customers, orders, menu items, and delivery tracking in an organized and structured manner.

The system focuses on demonstrating core OOP concepts such as **encapsulation, abstraction, inheritance, and polymorphism** while providing practical functionalities like order placement and delivery tracking.

---

## 🚀 Features  

### ✅ Order Management  
Customers can:
- Browse food items from the menu  
- Place orders with multiple items  
- View order details including item names, quantities, and total price  

### ✅ Delivery Tracking  
- Real-time status updates for orders  
- Track whether the order is:  
  - *Preparing*  
  - *Out for Delivery*  
  - *Delivered*  

### ✅ Customer Management  
- Store customer details such as name and contact information  
- Maintain order history for each customer  

---

## 🏗️ System Design (OOP Implementation)

### 🔹 Classes Used  

- **Customer**  
  - Attributes: `name`, `phoneNumber`, `orderHistory`  
  - Represents a registered customer in the system  

- **Order**  
  - Attributes: `orderID`, `items`, `totalPrice`, `status`  
  - Manages individual food orders  

- **Menu**  
  - Contains available food items and their prices  

- **Delivery**  
  - Attributes: `deliveryPerson`, `deliveryStatus`  
  - Handles delivery-related operations  

---

### 🔹 Key Methods Implemented  

- `placeOrder()` → Place a new food order  
- `trackDelivery()` → Track current delivery status  
- `updateOrderStatus()` → Update order state (Preparing → Out for Delivery → Delivered)  
- `addCustomer()` → Register a new customer  
- `viewOrderHistory()` → Display past orders of a customer  

---

## 💻 Technologies Used  

- **Programming Language**: Java (Main.java)  
- **Data Storage**: In-memory data structures / SQLite (optional)  
- **Paradigm**: Object-Oriented Programming (OOP)  

---

## ▶️ How to Run the Project  

1. Clone the repository:
   ```bash
   git clone <your-repository-link>
