package proiect.dao;

import proiect.model.Recenzie;

import java.util.ArrayList;
import java.util.List;

public class RecenzieDao {
    private static int nextId = 1;
    private static List<Recenzie> recenzii = new ArrayList<>();

    public void createRecenzie(Recenzie recenzie) {
        recenzie.setId(nextId++);
        recenzii.add(recenzie);
    }

    public Recenzie readRecenzie(int id) {
        for (Recenzie recenzie : recenzii) {
            if (recenzie.getId() == id) {
                return recenzie;
            }
        }
        return null;
    }

    public void updateRecenzie(int id, Recenzie recenzieUpdated) {
        for (int i = 0; i < recenzii.size(); i++) {
            Recenzie recenzie = recenzii.get(i);
            if (recenzie.getId() == id) {
                recenzieUpdated.setId(id);
                recenzii.set(i, recenzieUpdated);
                return;
            }
        }
    }

    public void deleteRecenzie(Recenzie recenzie) {
        recenzii.remove(recenzie);
    }

    public List<Recenzie> findAllRecenzii() {
        return new ArrayList<>(recenzii);
    }
}

