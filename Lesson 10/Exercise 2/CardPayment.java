public class CardPayment extends Payment implements Payable{
    private double cardSurCharge;
    public CardPayment(String payerName, double baseAmount, double cardSurCharge){
        super(payerName, baseAmount);
        this.cardSurCharge = cardSurCharge;
    }
    @Override
    public double calculateAmount(){
        return getBaseAmount() + (getBaseAmount() * cardSurCharge / 100);
    }
    @Override
    public void processPayment(){
        System.out.println("Card payment processed");
    }
    @Override
    public String getPaymentType(){
        return "Card";
    }
}
