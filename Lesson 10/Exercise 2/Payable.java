public interface Payable{
    double calculateAmount();
    void processPayment();
    String getPaymentType();
}