package proiect.dao;

import proiect.model.Comanda;

import java.util.ArrayList;
import java.util.List;

public class ComandaDao {
    private static int nextId = 1;
    private static List<Comanda> comenzi = new ArrayList<>();

    public void createComanda(Comanda comanda) {
        comanda.setId(nextId++);
        comenzi.add(comanda);
    }

    public Comanda readComanda(int id) {
        for (Comanda comanda : comenzi) {
            if (comanda.getId() == id) {
                return comanda;
            }
        }
        return null;
    }

    public void updateComanda(int id, Comanda comandaUpdated) {
        for (int i = 0; i < comenzi.size(); i++) {
            Comanda comanda = comenzi.get(i);
            if (comanda.getId() == id) {
                comandaUpdated.setId(id);
                comenzi.set(i, comandaUpdated);
                return;
            }
        }
    }

    public void deleteComanda(Comanda comanda) {
        comenzi.remove(comanda);
    }

    public List<Comanda> findAllComenzi() {
        return new ArrayList<>(comenzi);
    }
}
