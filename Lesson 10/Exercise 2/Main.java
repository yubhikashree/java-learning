public class Main{
    public static void main(String[] args){
        CashPayment c1 = new CashPayment("Yubhi",500.0);
        CardPayment c2 = new CardPayment("Arun",600.0,2.5);
        Payment[] pay = {c1, c2};
        double totalAmount = 0;
        for (Payment p : pay){
            p.processPayment();
            p.printReciept();
            totalAmount = totalAmount + p.calculateAmount();
        }
        System.out.println("Total collected: " + totalAmount);
    }
}