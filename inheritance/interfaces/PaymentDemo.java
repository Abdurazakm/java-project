package inheritance.interfaces;

// Define a Payment interface
interface Payment {
    void makePayment(double amount);
}

// CreditCard class implementing Payment
class CreditCardPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// PayPal class implementing Payment
class PayPalPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// Main class
public class PaymentDemo {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment paypal = new PayPalPayment();

        creditCard.makePayment(100.0);
        paypal.makePayment(200.0);
    }
}
