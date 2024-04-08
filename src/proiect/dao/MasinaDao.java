package proiect.dao;

import proiect.model.Masina;

import java.util.ArrayList;
import java.util.List;

public class MasinaDao {
    private static int nextId = 1;
    private static List<Masina> masini = new ArrayList<>();

    public void createMasina(Masina masina) {
        masina.setId(nextId++);
        masini.add(masina);
    }

    public Masina readMasina(int id) {
        for (Masina masina : masini) {
            if (masina.getId() == id) {
                return masina;
            }
        }
        return null;
    }

    public void updateMasina(int id, Masina masinaUpdated) {
        for (int i = 0; i < masini.size(); i++) {
            Masina masina = masini.get(i);
            if (masina.getId() == id) {
                masinaUpdated.setId(id);
                masini.set(i, masinaUpdated);
                return;
            }
        }
    }

    public void deleteMasina(Masina masina) {
        masini.remove(masina);
    }

    public List<Masina> findAllMasini() {
        return new ArrayList<>(masini);
    }
}

