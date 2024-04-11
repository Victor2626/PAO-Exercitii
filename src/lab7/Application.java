package lab7;

import java.util.ArrayList;
import java.util.Set;

public class Application {
    public static void main(String[] args){
        ArrayList<Tranzactie> listaTranzactii = new ArrayList<>();
        Set<String> listaTari = new java.util.HashSet<>(Set.of());
        ArrayList<User> useri = new ArrayList<>();

        User user1 = new User("Cristian", "Marcel", "RO547636473UI64732673");
        User user2 = new User("Dan", "Ionel", "RO657878HGV7Y788488448HF4G8");
        useri.add(user1);
        useri.add(user2);

        Payment payment1 = new Payment(180, Currency.RON, user1, "Payment for clothes");
        Payment payment2 = new Payment(2000, Currency.EUR, user1, "Payment for car");
        Payment payment3 = new Payment(800, Currency.USD, user1, "Payment for watch");
        Payment payment4 = new Payment(50000, Currency.GBP, user1, "Payment for house");
        Payment payment5 = new Payment(14000, Currency.TRY, user1, "Payment for phone");

        Tranzactie tranzactie1 = new Tranzactie(1, payment1);
        Tranzactie tranzactie2 = new Tranzactie(2, payment2);
        Tranzactie tranzactie3 = new Tranzactie(3, payment3);
        Tranzactie tranzactie4 = new Tranzactie(4, payment4);
        Tranzactie tranzactie5 = new Tranzactie(5, payment5);

        Tranzactie tranzactieStornata1 = stornareTranzactie(tranzactie1);
        Tranzactie tranzactieStornata3 = stornareTranzactie(tranzactie3);

        System.out.println("Tranzactie 1: " + tranzactie1);
        System.out.println("Tranzactie 2: " + tranzactie2);
        System.out.println("Tranzactie 3: " + tranzactie3);
        System.out.println("Tranzactie 4: " + tranzactie4);
        System.out.println("Tranzactie stornata 1: " + tranzactieStornata1);
        System.out.println("Tranzactie stornata 3: " + tranzactieStornata3);

        listaTranzactii.add(tranzactie1);
        listaTranzactii.add(tranzactie2);
        listaTranzactii.add(tranzactie3);
        listaTranzactii.add(tranzactie4);
        listaTranzactii.add(tranzactie5);
        listaTranzactii.add(tranzactieStornata1);
        listaTranzactii.add(tranzactieStornata3);

        System.out.println("\n" + "Lista tari: ");
        for (Tranzactie tranzactie : listaTranzactii) {
            listaTari.add(tranzactie.getPayment().getCurrency().getNumeTara());
        }
        for (String tara : listaTari) {
            System.out.println(tara);
        }

        System.out.println("\n\n" + "Useri: ");
        for (User user : useri) {
            System.out.println("User:" + user.getNume() + " " + user.getPrenume());
            for (Tranzactie tranzactie : listaTranzactii) {
                if (tranzactie.getPayment().getUser().equals(user)) {
                    System.out.println(tranzactie);
                }
            }
        }
    }

    public static Tranzactie stornareTranzactie(Tranzactie tranzactie) {
        Tranzactie tranzactieCLONA = tranzactie.clone();
        tranzactieCLONA.setRefNmb(tranzactie.getId());
        tranzactieCLONA.setAmount(-tranzactieCLONA.getPayment().getAmount());
        System.out.println("Tranzactie stornata: " + tranzactieCLONA);
        return tranzactieCLONA;
    }

}
