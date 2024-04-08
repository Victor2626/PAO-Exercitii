package proiect.dao;

import proiect.model.Mancare;

import java.util.ArrayList;
import java.util.List;

public class MancareDao {
    private static int nextId = 1;
    private static List<Mancare> mancaruri = new ArrayList<>();

    public void createMancare(Mancare mancare) {
        mancare.setId(nextId++);
        mancaruri.add(mancare);
    }

    public Mancare readMancare(int id) {
        for (Mancare mancare : mancaruri) {
            if (mancare.getId() == id) {
                return mancare;
            }
        }
        return null;
    }

    public void updateMancare(int id, Mancare mancareUpdated) {
        for (int i = 0; i < mancaruri.size(); i++) {
            Mancare mancare = mancaruri.get(i);
            if (mancare.getId() == id) {
                mancareUpdated.setId(id);
                mancaruri.set(i, mancareUpdated);
                return;
            }
        }
    }

    public void deleteMancare(Mancare mancare) {
        mancaruri.remove(mancare);
    }

    public List<Mancare> findAllMancaruri() {
        return new ArrayList<>(mancaruri);
    }
}

