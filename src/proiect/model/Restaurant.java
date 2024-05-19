package proiect.model;

import proiect.model.Mancare;
import proiect.model.Recenzie;

import java.util.Map;
import java.util.Set;

public class Restaurant {
    private int id;
    private String name;
    private String address;
    private Map<Mancare, Boolean> menu;
    private int averagePreparationTime;
    private Set<Recenzie> Recenzii;
    public Restaurant(int id, String name, String address, Map<Mancare, Boolean> menu, int averagePreparationTime, Set<Recenzie> Recenzii){
        this.id = id;
        this.name = name;
        this.address = address;
        this.menu = menu;
        this.averagePreparationTime = averagePreparationTime;
        this.Recenzii = Recenzii;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Map<Mancare, Boolean> getMenu() {
        return menu;
    }

    public int getAveragePreparationTime() {
        return averagePreparationTime;
    }

    public Set<Recenzie> getRecenzii() {
        return Recenzii;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMenu(Map<Mancare, Boolean> menu) {
        this.menu = menu;
    }

    public void setAveragePreparationTime(int averagePreparationTime) {
        this.averagePreparationTime = averagePreparationTime;
    }

    public void setRecenzii(Set<Recenzie> recenzii) {
        Recenzii = recenzii;
    }
    @Override
    public String toString() {
        return "Restaurant:" + '\n' +
                "Id: " + getId() + '\n' +
                "Name: " + getName() + '\n' +
                "Address: " + getAddress() + '\n' +
                "Menu: " + getMenu() + '\n' +
                "AveragePreparationTime: " + getAveragePreparationTime() + '\n' +
                "Recenzii: " + getRecenzii() + '\n';
    }
}
