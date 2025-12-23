import java.util.*;

// Payment Interface
interface Payment {
    void processPayment(double amount);
}

// UPI Payment Class
class UPI implements Payment {
    public void processPayment(double amount) {
        System.out.println("\nProcessing UPI Payment...");
        System.out.println("UPI Payment Successful!");
    }
}

// Credit Card Payment Class
class CreditCard implements Payment {
    public void processPayment(double amount) {
        System.out.println("\nProcessing Credit Card Payment...");
        System.out.println("Credit Card Payment Successful!");
    }
}

// Main Class
public class PaymentGateway {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Payment p;

        System.out.println("=== Payment Gateway ===");
        System.out.println("1. UPI Payment");
        System.out.println("2. Credit Card Payment");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount to pay : ");
        double amount = sc.nextDouble();

        String mode = "";

        switch(choice) {
            case 1:
                p = new UPI();
                mode = "UPI";
                break;

            case 2:
                p = new CreditCard();
                mode = "Credit Card";
                break;

            default:
                System.out.println("Invalid Choice!");
                sc.close();
                return;
        }

        // Process payment
        p.processPayment(amount);

        // Print Receipt
        printReceipt(mode, amount);

        sc.close();
    }

    // Receipt Method
    public static void printReceipt(String mode, double amount) {
        System.out.println("\n==============================");
        System.out.println("          PAYMENT RECEIPT     ");
        System.out.println("==============================");
        System.out.println("Payment Mode : " + mode);
        System.out.println("Amount Paid  : " + amount);
        System.out.println("Transaction  : Successful");
        System.out.println("Date & Time  : " + new Date());
        System.out.println("==============================");
        System.out.println("      Thank you for paying!   ");
        System.out.println("==============================");
    }
}

