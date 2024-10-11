public class PaymentProcessor {
    public boolean processPayment(double amount) {
        // Mock implementation for processing payment
        if (amount > 0) {
            System.out.println("Payment of $" + amount + " processed successfully.");
            return true;
        } else {
            System.out.println("Payment failed.");
            return false;
        }
    }
}
