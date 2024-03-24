package lab4.Mall;

public class DebitCard implements BankCard {
    private double balance;

    public DebitCard(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void doTransaction(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Tranzactia efectuata cu succes. Suma: " + amount + ". Balanta curenta: " + this.balance);
        } else {
            System.out.println("Fonduri insuficiente. Nu se poate efectua tranzactia de " + amount + ". Balanata curenta: " + this.balance);
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Depunere efectuata cu succes. Suma adaugata: " + amount + ". Balanta curenta: " + this.balance);
    }

    public void displayBalance() {
        System.out.println("Balanta curenta este: " + this.balance);
    }

    public static void main(String[] args) {
        DebitCard myDebitCard = new DebitCard(500);
        myDebitCard.doTransaction(100);
        myDebitCard.displayBalance();
        myDebitCard.deposit(200);
        myDebitCard.displayBalance();
    }
}

