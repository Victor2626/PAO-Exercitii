package proiect.dao;

import proiect.model.Livrator;

import java.util.ArrayList;
import java.util.List;

public class LivratorDao {
    private static int nextId = 1;
    private static List<Livrator> livratori = new ArrayList<>();

    public void createLivrator(Livrator livrator) {
        livrator.setId(nextId++);
        livratori.add(livrator);
    }

    public Livrator readLivrator(int id) {
        for (Livrator livrator : livratori) {
            if (livrator.getId() == id) {
                return livrator;
            }
        }
        return null;
    }

    public void updateLivrator(int id, Livrator livratorUpdated) {
        for (int i = 0; i < livratori.size(); i++) {
            Livrator livrator = livratori.get(i);
            if (livrator.getId() == id) {
                livratorUpdated.setId(id);
                livratori.set(i, livratorUpdated);
                return;
            }
        }
    }

    public void deleteLivrator(Livrator livrator) {
        livratori.remove(livrator);
    }

    public List<Livrator> findAllLivratori() {
        return new ArrayList<>(livratori);
    }
}

