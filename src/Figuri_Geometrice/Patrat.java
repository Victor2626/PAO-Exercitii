package lab4.Figuri_Geometrice;

public class Patrat implements Calcul {
    private double latura;

    public Patrat(double latura) {
        this.latura = latura;
    }

    @Override
    public double aria() {
        return latura * latura;
    }

    @Override
    public double perimetru() {
        return 4 * latura;
    }

}
