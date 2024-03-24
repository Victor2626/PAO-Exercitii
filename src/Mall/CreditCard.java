package lab4.Mall;

public class CreditCard implements BankCard {
    private double balance;

    public CreditCard(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void doTransaction(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Tranzactia efectuata cu succes. Suma: " + amount + ". Balanta curenta: " + this.balance);
        } else {
            System.out.println("Fonduri insuficiente pentru a efectua tranzactia. Balanta curenta: " + this.balance);
        }
    }

    public void displayBalance() {
        System.out.println("Balanta curenta este: " + this.balance);
    }

    public static void main(String[] args) {
        CreditCard myCard = new CreditCard(1000);
        myCard.doTransaction(150);
        myCard.displayBalance();
    }
}

