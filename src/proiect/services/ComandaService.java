package proiect.services;

import proiect.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class ComandaService{
    private List<Comanda> orders;
    //Functie care verifica status-ul unei comenzi
    public void plasareComanda(int id, User user, Restaurant restaurant, List<Mancare> items, String status){
        boolean stareComanda=true;
        Comanda comanda = new Comanda(id, user, restaurant, items, status);
        for(Mancare item : items){
            if( restaurant.getMenu().containsKey(item)){boolean disponibil = restaurant.getMenu().get(item);
                if(disponibil==false)stareComanda=false;
            }
        }
        if(stareComanda==false) {
            comanda.setStatus("Nefinalizat");
            System.out.println("Comanda nu a putut fi finalizata!");
        }
        else {
            comanda.setStatus("In curs de preparare");
            System.out.println("Comanda este in curs de preparare!");
        }


    }
    //Functie care verifica daca un produs este disponibil la un restaurant
    public List<Comanda> comandaRestaurant(Restaurant restaurant){
        List<Comanda> comenziRestaurant = new ArrayList<Comanda>();
        for(Comanda comanda : orders){
            if(comanda.getRestaurant().getName().equals(restaurant.getName()))comenziRestaurant.add(comanda);
        }
        if(comenziRestaurant.size()==0)
            System.out.println("Restaurantul " + restaurant.getName() + " nu are comenzi");
        return comenziRestaurant;
    }
    //Functie care verifica timpul total al unei comenzi
    public int calculateTotalOrderTime(Restaurant restaurant, Livrator livrator) {
        if(restaurant == null || livrator == null) {
            throw new IllegalArgumentException("Restaurantul sau livratorul nu sunt specificati.");
        }

        int preparationTime = restaurant.getAveragePreparationTime();
        int deliveryTime = livrator.getEstimatedDeliveryTime();

        return preparationTime + deliveryTime;
    }


    public List<Comanda> getOrders() {
        return orders;
    }
}
