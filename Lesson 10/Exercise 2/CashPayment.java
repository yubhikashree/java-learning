public class CashPayment extends Payment implements Payable{
    public CashPayment(String payerName, double baseAmount){
        super(payerName, baseAmount);
    }
    @Override
    public double calculateAmount(){
        return getBaseAmount();
    }
    @Override
    public void processPayment(){
        System.out.println("Cash payment processed");
    }
    @Override
    public String getPaymentType(){
        return "Cash";
    }
}