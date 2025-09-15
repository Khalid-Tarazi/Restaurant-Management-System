public class CreditCardPayment implements Payment {
    private int paymentId;
    private double amount;
    private int orderId;
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(int paymentId, double amount, int orderId, String cardNumber, String expiryDate, String cvv) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.orderId = orderId;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void processPayment() {

        if (isValidCardNumber(cardNumber) && isValidExpiryDate(expiryDate) && isValidCvv(cvv)) {

            double balance = getCardBalance();
            if (balance >= amount) {

                setCardBalance(balance - amount);

                System.out.println("Payment successful. Amount: " + amount);
            } else {

                System.out.println("Payment failed. Insufficient balance.");
            }
        } else {

            System.out.println("Payment failed. Invalid card details.");
        }
    }

    @Override
    public void generateReceipt() {

        System.out.println("Payment Receipt");
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: " + amount);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("CVV: " + cvv);
    }

    private boolean isValidCardNumber(String cardNumber) {
        //
        return true;
    }

    private boolean isValidExpiryDate(String expiryDate) {
        //
        return true;
    }

    private boolean isValidCvv(String cvv) {
        //
        return true;
    }

    private double getCardBalance() {
        //
        return 1000.0;
    }

    private void setCardBalance(double balance) {
        //
    }

    public int getPaymentId() {
        return this.paymentId;
    }

    public double getAmount() {
        return this.amount;
    }

    public int getOrderId() {
        return this.orderId;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public String getCvv() {
        return this.cvv;
    }
}