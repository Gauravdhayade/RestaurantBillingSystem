# 🍽️ Restaurant Billing System (Java Console Project)

## 🔹 Overview
The **Restaurant Billing System** is a console-based Java application built to simplify billing and order management for small restaurants.  
It allows users to **add/remove menu items dynamically**, take **customer orders**, and generate a **detailed bill with GST, service charge, and discounts**.  
The project demonstrates **Core Java (OOP, Collections, Exception Handling)** and **modular design** using multiple packages.

---

## ⚙️ Features

✅ **Dynamic Menu Management** — Add or remove food items any time  
✅ **Customer Ordering** — Select multiple items with quantity  
✅ **Bill Generation** — Calculates total, GST (5%), service charge (2%), and discount (10% for > ₹500)  
✅ **Itemized Receipt** — Displays each item with price, quantity & total  
✅ **Modular Design** — Clean structure with `model`, `service`, `util`, and `main` packages  
✅ **Console-based Interface** — Runs directly in terminal, no GUI or DB required  

---

## 🧠 Technologies Used
- ☕ **Core Java (OOPs, Collections, Exception Handling)**
- 📦 **Package-based architecture**
- 🧾 **Console I/O using Scanner**
- 💻 **Windows / Linux terminal compatible**

---

## 🗂️ Folder Structure

RestaurantBillingSystem/
│
├── src/
│ └── com/restaurant/
│ ├── model/
│ │ ├── FoodItem.java
│ │ ├── Order.java
│ │ └── OrderItem.java
│ ├── service/
│ │ ├── MenuManager.java
│ │ └── BillingManager.java
│ ├── util/
│ │ └── InputHelper.java
│ └── main/
│ └── RestaurantApp.java
│
└── README.md

yaml
Copy code

---

## 💵 Sample Output

========= WELCOME TO THE JAVA BITE =========
1️⃣ Show Menu
2️⃣ Add Menu Item
3️⃣ Remove Menu Item
4️⃣ Take Customer Order
5️⃣ Print Bill
0️⃣ Exit
Enter your choice: 4
Enter item ID to order: 1
Enter quantity: 2
🛒 Item added to order!

Enter your choice: 5

=========================================
THE JAVA BITE RESTAURANT
Item Qty Amount
Margherita Pizza 2 ₹598.00
Subtotal: ₹598.00
GST (5%): ₹29.90
Service Charge (2%): ₹11.96
Discount (10%): -₹59.80
Grand Total: ₹580.06
markdown
Copy code
    Thank You! Visit Again 🍽️
yaml
Copy code
