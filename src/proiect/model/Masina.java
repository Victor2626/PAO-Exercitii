package proiect.model;

import proiect.model.Autoturism;

public class Masina extends Autoturism {
    private String color;
    private String licensePlate;
    public Masina(int id, String brand, String model, int year, String color, String licensePlate) {
        super(id, brand, model, year);
        this.color = color;
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
