package proiect.model;

import java.util.List;

public class Chat {
    private int id;
    private User user;
    private Livrator delivery;
    private List<String> messages;
    public Chat(int id, User user, Livrator delivery, List<String> messages) {
        this.id = id;
        this.user = user;
        this.delivery = delivery;
        this.messages = messages;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Livrator getDelivery() {
        return delivery;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDelivery(Livrator delivery) {
        this.delivery = delivery;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
