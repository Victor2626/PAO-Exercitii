package proiect.model;

public class Recenzie {
    private int id;
    private User user;
    private String comment;
    private int rating;
    public Recenzie(int id, User user, String comment, int rating){
        this.id = id;
        this.user = user;
        this.comment = comment;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }

    public int getRating() {
        return rating;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
