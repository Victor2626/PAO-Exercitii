package proiect.model;

public class Promotie {
    private int id;
    private double discountRate;
    public Promotie(int id, double discountrate){
        this.id = id;
        this.discountRate = discountrate;
    }

    public int getId() {
        return id;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
