package lab7;

import lab7.Conversie.ConversieCurrencyImpl;

public class Tranzactie extends ConversieCurrencyImpl implements Cloneable{
    private int id;
    private Payment payment;
    private Currency currency;
    private double amount;
    private int refNmb;
    public Tranzactie(int id, Payment payment){
        this.id = id;
        this.payment = payment;
        this.currency = Currency.EUR;
        this.amount =  conversieValutaToEur(currency , payment.getAmount());

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.payment.setAmount(amount);
        this.amount = conversieValutaToEur(currency, amount);
    }

    public int getRefNmb() {
        return refNmb;
    }

    public void setRefNmb(int refNmb) {
        this.refNmb = refNmb;
    }
    @Override
    public String toString() {
        return "id=" + id + '\n' +
                "payment=" + payment +
                "currency=" + currency + '\n' +
                "amount=" + amount + '\n' +
                "refNmb=" + refNmb + '\n';
    }
    @Override
    public Tranzactie clone() {
        try {
            Tranzactie clone = (Tranzactie) super.clone();
            clone.payment = payment.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
