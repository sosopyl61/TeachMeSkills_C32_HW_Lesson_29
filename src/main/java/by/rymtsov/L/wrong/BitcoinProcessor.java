package by.rymtsov.L.wrong;

public class BitcoinProcessor extends PaymentProcessor {
    @Override
    public void processPayment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
