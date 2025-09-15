public class CashPayment implements Payment {
    private int paymentId;
    private double amount;
    private int orderId;

    public CashPayment(int paymentId, double amount, int orderId) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.orderId = orderId;
    }

    @Override
    public void processPayment() {
        //
    }

    @Override
    public void generateReceipt() {
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
}