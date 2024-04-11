package lab7;

public class User {
    private String nume;
    private String prenume;
    private String IBAN;
    public User(String nume, String prenume, String IBAN){
        this.nume = nume;
        this.prenume = prenume;
        this.IBAN = IBAN;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }
    @Override
    public String toString() {
        return "User: " + "nume=" + nume + ", prenume=" + prenume + ", IBAN=" + IBAN + '\n';
    }
}
