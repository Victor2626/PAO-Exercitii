package proiect.model;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String address;
    private double discountRate;
    public User(int id, String name, String email, String password, String address, double discountRate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.discountRate = discountRate;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    @Override
    public String toString() {
        return "User:" + '\n' +
                "Id: " + getId() + '\n' +
                "Name: " + getName() + '\n' +
                "Email: " + getEmail() + '\n' +
                "Password: " + getPassword() + '\n' +
                "Address: " + getAddress() + '\n' +
                "DiscountRate: " + getDiscountRate() + '\n';
    }

}
