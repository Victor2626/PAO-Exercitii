package Lab6;
import Lab6.Calcul.Chirie;
import Lab6.Calcul.ChirieAlimentar;
import Lab6.Calcul.ChirieChimic;
import Lab6.Calcul.ChirieHaine;

import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        ShoppingMall mall = new ShoppingMall();
        Proprietar p1 = new Proprietar("Popa", "Silviu", 34);
        Proprietar p2 = new Proprietar("Dan", "Razvan", 25);
        Proprietar p3 = new Proprietar("Mihaita", "Valentin", 30);
        Proprietar p4 = new Proprietar("Cristinel", "Darius", 20);
        Chirie alim = new ChirieAlimentar();
        Magazin carrefour = new Magazin(1, "Carrefour", p2, 30000, 12000);
        carrefour.setChirie(alim);
        Magazin auchan = new Magazin(2, "Auchan", p1, 19000, 10040);
        auchan.setChirie(alim);
        Chirie haine = new ChirieHaine();
        Magazin bershka = new Magazin(3, "Bershka", p1, 48000, 8700);
        bershka.setChirie(haine);
        Magazin nike = new Magazin(4, "Nike", p4, 97000, 20000);
        nike.setChirie(haine);
        Chirie chim = new ChirieChimic();
        Magazin sephora = new Magazin(5, "Sephora", p3, 23000, 5000);
        sephora.setChirie(chim);
        Magazin  insect= new Magazin(5, "Insect", p4, 3000, 9870);
        insect.setChirie(chim);
        mall.addMagazin(carrefour);
        mall.addMagazin(auchan);
        mall.addMagazin(bershka);
        mall.addMagazin(nike);
        mall.addMagazin(sephora);
        mall.addMagazin(insect);
        Collections.sort(mall.getListaMagazine(),Comparator.comparing((Magazin magazin) -> magazin.getPropietar().getNume()).thenComparing(magazin -> magazin.getPropietar().getPrenume()).thenComparing(Magazin::getChirie));
        mall.showMagazine();
        Collections.sort(mall.getListaMagazine(),Comparator.comparing(Magazin::getNumeMagazin).thenComparing(Magazin::getVenit).thenComparing(Magazin::getChirie).thenComparing(Magazin::getSuprafata));
        mall.showMagazineProprietar(p1);
        System.out.println(mall.venitTotal(p2));
        System.out.println(mall.venitTotal(p4));

    }
}
