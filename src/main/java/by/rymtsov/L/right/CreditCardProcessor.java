package by.rymtsov.L.right;

public class CreditCardProcessor extends PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment");
    }
}
