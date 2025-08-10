# 🏨 Hotel Management System (Java + Swing)

A **Java-based Hotel Management System** built with **Swing** for the user interface and **MySQL** (via JDBC) for database operations.  
This system allows hotels to manage rooms, customers, employees, and other operational activities through a desktop application.

---

## 📌 Key Features
✅ **User Authentication** – Secure login system for staff/admin  
✅ **Room Management** – Add, update, and search rooms  
✅ **Customer Management** – Check-in, check-out, and view customer details  
✅ **Employee & Driver Records** – Add employees and drivers to the system  
✅ **Reception Dashboard** – Central hub to access all features  
✅ **Pickup Service** – Manage and assign drivers for customer pickups  
✅ **Department Management** – Add and manage hotel departments  
✅ **Image Integration** – UI elements with image-based buttons and backgrounds  

---

## 🛠 Tech Stack
- **Language:** Java  
- **UI Framework:** Swing (AWT for basic components)  
- **Database:** MySQL (Connected via JDBC)  
- **Build Tool:** Maven (pom.xml)  
- **IDE Recommended:** IntelliJ IDEA / Eclipse / NetBeans  

---


---

## 🚀 How to Run

### 1️⃣ Prerequisites
- Java JDK 8+ installed
- MySQL Server installed and running
- Maven installed

### 2️⃣ Database Setup
1. Create a MySQL database (e.g., `hotelmanagement`).
2. Import the required SQL tables (not included here — ensure to create tables for rooms, customers, employees, drivers, departments).
3. Update `conn.java` with your MySQL credentials:
   ```java
   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagement", "username", "password");
