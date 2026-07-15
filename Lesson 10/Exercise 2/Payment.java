public abstract class Payment{
    private String payerName;
    private double baseAmount;
    public Payment(String payerName, double baseAmount){
        this.payerName = payerName;
        this.baseAmount = baseAmount;
    }
    public abstract String getPaymentType();
    public abstract void processPayment();
    public String getPayerName(){ return payerName; }
    public double getBaseAmount(){ return baseAmount; }
    public abstract double calculateAmount();
    public void printReciept(){
        System.out.println("----- Reciept -----");
        System.out.println("Payer name: " + getPayerName() + " | Type: " + getPaymentType() + " | Amount: " + calculateAmount());
    }
}