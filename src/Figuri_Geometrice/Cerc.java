package lab4.Figuri_Geometrice;

public class Cerc implements Calcul {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    @Override
    public double aria() {
        return Math.PI * raza * raza;
    }

    @Override
    public double perimetru() {
        return 2 * Math.PI * raza;
    }
}
