package proiect.model;

import java.util.Date;
import java.util.List;

public class Comanda {
    private int id;
    private User user;
    private Restaurant restaurant;
    private List<Mancare> items;
    private String status;
    private Date orderDate;
    public Comanda(int id, User user, Restaurant restaurant, List<Mancare> items, String status ){
        this.id = id;
        this.user = user;
        this.restaurant = restaurant;
        this.items = items;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public List<Mancare> getItems() {
        return items;
    }

    public String getStatus() {
        return status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setItems(List<Mancare> items) {
        this.items = items;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    @Override
    public String toString() {
        return "Comanda:" + '\n' +
                "Id: " + getId() + '\n' +
                "User: " + getUser() + '\n' +
                "Restaurant: " + getRestaurant() + '\n' +
                "Items: " + getItems() + '\n' +
                "Status: " + getStatus() + '\n' +
                "OrderDate: " + getOrderDate() + '\n';
    }
}
