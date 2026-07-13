public class BankAccount{
    private String ownerName;
    private double balance;
    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            this.balance = balance + amount;
            System.out.println("Deposited. Balance: " + balance);
    }   else{
            System.out.println("Invalid amount!");
    }
    }
    public void withdraw(double amount){
        if (amount <= balance && amount > 0){
            this.balance = balance -amount;
            System.out.println("Withdrawn. Balance: " + balance);
    }   else{
            System.out.println("Insufficient Funds!");
    }
    }
    public double getBalance(){ return balance; }
    public void printStatement(){
        System.out.println("--- Statement ---");
        System.out.println("Owner: " + ownerName + " | Balance: " + balance);
    }
}

public class Main{
    public static void main(String[] args){
        BankAccount b1 = new BankAccount("Yubhi",1000.0);
        BankAccount b2 = new BankAccount("Jashan",1000.0);

        b1.deposit(500.0);
        b2.deposit(2000.0);

        b1.withdraw(1000.0);
        b1.withdraw(1000.0);

        b1.printStatement();
        b2.printStatement();
    }
}