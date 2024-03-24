package lab4.Mall;

public class ShoppingMall {
    public static void main(String[] args) {
        CreditCard myCreditCard = new CreditCard(5000);
        DebitCard myDebitCard = new DebitCard(1500);

        System.out.println("Efectuând tranzacția cu CreditCard...");
        myCreditCard.doTransaction(300);
        myCreditCard.displayBalance();

        System.out.println("\nEfectuând tranzacția cu DebitCard...");
        myDebitCard.doTransaction(1200);
        myDebitCard.displayBalance();
    }
}

