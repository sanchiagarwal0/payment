# 💳 Payment Gateway System

A **Java console-based Payment Gateway System** developed to demonstrate the practical implementation of core **Object-Oriented Programming (OOP)** concepts.

The application simulates a simple payment processing workflow where users can select a payment method, enter a payment amount, process the transaction, and receive a formatted payment receipt containing transaction details and the current date and time.

---

## 📌 Project Description

The **Payment Gateway System** is a simple Java-based console application created to demonstrate how Object-Oriented Programming concepts can be applied to a real-world scenario.

The system allows users to:

* Select a payment method
* Enter the payment amount
* Process the payment
* Generate a formatted payment receipt
* View the transaction date and time

The project currently supports **UPI** and **Credit Card** payments and is designed in a way that makes it easy to add new payment methods in the future.

> ⚠️ **Note:** This is an educational simulation and does not process real financial transactions.

---

## 🚀 Features

* 💰 Accepts payment amount from the user
* 💳 Supports multiple payment methods

  * UPI Payment
  * Credit Card Payment
* ⚙️ Processes the selected payment method
* 🧾 Automatically generates a formatted payment receipt
* 📅 Displays the current date and time
* 🔄 Easy to extend with additional payment methods
* 🖥️ Simple console-based user interface
* 🧩 Demonstrates real-world usage of Java OOP concepts

---

## 🧠 OOP Concepts Used

This project demonstrates several important **Object-Oriented Programming concepts**.

### 1. Interface

A `Payment` interface defines a common structure for all payment methods.

```java
interface Payment {
    void processPayment(double amount);
}
```

Different payment classes implement this interface according to their requirements.

---

### 2. Abstraction

The payment-processing functionality is abstracted through the `Payment` interface.

The user does not need to know the internal implementation of each payment method. They simply select a payment method and provide the amount.

---

### 3. Polymorphism

Polymorphism allows different payment implementations to be handled using the same interface reference.

```java
Payment payment;

payment = new UPI();
payment.processPayment(amount);

payment = new CreditCard();
payment.processPayment(amount);
```

The same `Payment` reference can represent different payment implementations.

---

### 4. Method Overriding

Each payment class provides its own implementation of the `processPayment()` method.

```java
class UPI implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment...");
    }
}
```

The `CreditCard` class can similarly override the method to provide its own implementation.

---

## 🛠️ Technologies Used

| Technology                     | Purpose                   |
| ------------------------------ | ------------------------- |
| ☕ Java                         | Main programming language |
| 🧩 Object-Oriented Programming | Application design        |
| 📦 `java.util`                 | Utility classes           |
| ⌨️ `Scanner`                   | User input                |
| 📅 `Date`                      | Current date and time     |

---

## 📂 Project Structure

```text
Payment-Gateway-System/
│
├── src/
│   ├── Payment.java
│   ├── UPI.java
│   ├── CreditCard.java
│   └── Main.java
│
├── README.md
└── .gitignore
```

### File Description

| File              | Description                                  |
| ----------------- | -------------------------------------------- |
| `Payment.java`    | Defines the common payment interface         |
| `UPI.java`        | Implements UPI payment functionality         |
| `CreditCard.java` | Implements Credit Card payment functionality |
| `Main.java`       | Handles user input and program execution     |
| `README.md`       | Project documentation                        |

---

## 🔄 Application Workflow

```text
                    ┌─────────────────┐
                    │      START      │
                    └────────┬────────┘
                             │
                             ▼
                  ┌─────────────────────┐
                  │ Select Payment      │
                  │ Method              │
                  └──────────┬──────────┘
                             │
                    ┌────────┴────────┐
                    │                 │
                    ▼                 ▼
              ┌───────────┐    ┌──────────────┐
              │    UPI    │    │ Credit Card  │
              └─────┬─────┘    └──────┬───────┘
                    │                 │
                    └────────┬────────┘
                             │
                             ▼
                  ┌─────────────────────┐
                  │ Enter Payment       │
                  │ Amount              │
                  └──────────┬──────────┘
                             │
                             ▼
                  ┌─────────────────────┐
                  │ Process Payment     │
                  └──────────┬──────────┘
                             │
                             ▼
                  ┌─────────────────────┐
                  │ Generate Receipt    │
                  └──────────┬──────────┘
                             │
                             ▼
                    ┌─────────────────┐
                    │       END       │
                    └─────────────────┘
```

---

## ▶️ How to Run

### Prerequisites

Make sure **Java JDK** is installed on your computer.

Check your Java installation:

```bash
java -version
```

Check the Java compiler:

```bash
javac -version
```

---

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/payment-gateway-system.git
```

### 2. Navigate to the Project

```bash
cd payment-gateway-system
```

### 3. Compile the Program

If all `.java` files are in the same directory:

```bash
javac *.java
```

### 4. Run the Application

```bash
java Main
```

---

## 🖥️ Sample Output

```text
========================================
        PAYMENT GATEWAY SYSTEM
========================================

1. UPI Payment
2. Credit Card Payment

Enter your choice: 1

Enter payment amount: 2500

----------------------------------------
           PAYMENT RECEIPT
----------------------------------------
Payment Method : UPI
Amount         : ₹2500.00
Status         : Payment Successful
Date & Time    : Sun Aug 09 22:15:30 IST 2026
----------------------------------------

Thank you for using our Payment Gateway!
```

---

## 🔮 Future Enhancements

The project can be further enhanced by adding:

* 🏦 Net Banking
* 💳 Debit Card Payment
* 📱 Digital Wallets
* 🔐 OTP Verification
* 🔑 PIN Verification
* 🆔 Unique Transaction ID
* 📊 Transaction History
* 💾 Database Integration
* 🧾 Receipt File Generation
* ⚠️ Input Validation
* 🛡️ Exception Handling
* 🌐 Web-Based Interface
* 🖥️ JavaFX/Swing GUI

---

## 🎯 Learning Objectives

The main objective of this project is to understand and implement:

* Classes and Objects
* Interfaces
* Abstraction
* Polymorphism
* Method Overriding
* Encapsulation
* User Input using `Scanner`
* Date and Time Handling
* Basic Java Application Structure
* Extensible Object-Oriented Design

---

## 🏗️ OOP Architecture

```text
                         ┌────────────────────┐
                         │      Payment       │
                         │     Interface      │
                         └─────────┬──────────┘
                                   │
                    ┌──────────────┴──────────────┐
                    │                             │
                    ▼                             ▼
             ┌──────────────┐              ┌──────────────┐
             │     UPI      │              │ CreditCard   │
             │   Payment    │              │   Payment    │
             └──────────────┘              └──────────────┘
```

The `Payment` interface provides a common contract for all payment methods.

Each payment implementation overrides the payment-processing method according to its own behavior.

---

## 🔐 Security Disclaimer

This application is created **strictly for educational purposes**.

It does not connect to:

* Banks
* UPI networks
* Credit card networks
* Payment gateways
* Real financial services

No real money or financial transactions are processed by this application.

---

## 📚 What I Learned

Through this project, I learned how to apply Java OOP concepts to a practical problem.

The project helped me understand how interfaces and polymorphism can make an application easier to maintain and extend. It also provided practical experience with user input, method overriding, and generating formatted transaction information.

---

## 👩‍💻 Author

**Sanchi Agarwal**

Java | Object-Oriented Programming | Software Development

---

## ⭐ Show Your Support

If you found this project useful or interesting, consider giving the repository a ⭐ on GitHub!

---

## 📄 License

This project is created for **educational and learning purposes**.
