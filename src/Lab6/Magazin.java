package Lab6;
import Lab6.Calcul.Chirie;

public class Magazin {
    private int id;
    private String numeMagazin;
    private Proprietar propietar;
    private int venit;
    private int suprafata;
    private int chirie;

    public Magazin(int id, String numeMagazin, Proprietar proprietar, int venit, int suprafata){
        this.id = id;
        this.numeMagazin = numeMagazin;
        this.propietar = proprietar;
        this.venit = venit;
        this.suprafata = suprafata;
    }

    public int getId() {
        return id;
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public Proprietar getPropietar() {
        return propietar;
    }

    public double getVenit() {
        return venit;
    }

    public double getSuprafata() {
        return suprafata;
    }

    public double getChirie() {
        return chirie;
    }

    public void setChirie(Chirie a) {
        this.chirie = a.CalculChirie(this.suprafata);
    }
}
