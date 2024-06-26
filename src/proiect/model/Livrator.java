package proiect.model;

public class Livrator {
    private int id;
    private String name;
    private int estimatedDeliveryTime;
    public Livrator(int id, String name, int estimatedDeliveryTime) {
        this.id = id;
        this.name = name;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public Livrator() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEstimatedDeliveryTime(int estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }
    @Override
    public String toString() {
        return "Livrator:" + '\n' +
                "Id: " + getId() + '\n' +
                "Name: " + getName() + '\n' +
                "EstimatedDeliveryTime: " + getEstimatedDeliveryTime() + '\n';
    }
}
