package lab7;

public enum Currency {
    RON("Romania", "RO"),
    EUR("Uniunea Europeana", "UE"),
    USD("Statele Unite ale Americi", "SUA"),
    GBP("Regatul Unit al Marii Britanii", "UK"),
    TRY("Turcia", "TR");
    private final String numeTara;
    private final String simbolTara;
    private Currency(String numeTara, String simbolTara){
        this.numeTara = numeTara;
        this.simbolTara = simbolTara;
    }

    public String getNumeTara() {
        return numeTara;
    }

    public String getSimbolTara() {
        return simbolTara;
    }
}
