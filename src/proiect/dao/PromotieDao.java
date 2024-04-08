package proiect.dao;

import proiect.model.Promotie;

import java.util.ArrayList;
import java.util.List;

public class PromotieDao {
    private static int nextId = 1;
    private static List<Promotie> promotii = new ArrayList<>();

    public void createPromotie(Promotie promotie) {
        promotie.setId(nextId++);
        promotii.add(promotie);
    }

    public Promotie readPromotie(int id) {
        for (Promotie promotie : promotii) {
            if (promotie.getId() == id) {
                return promotie;
            }
        }
        return null;
    }

    public void updatePromotie(int id, Promotie promotieUpdated) {
        for (int i = 0; i < promotii.size(); i++) {
            Promotie promotie = promotii.get(i);
            if (promotie.getId() == id) {
                promotieUpdated.setId(id);
                promotii.set(i, promotieUpdated);
                return;
            }
        }
    }

    public void deletePromotie(Promotie promotie) {
        promotii.remove(promotie);
    }

    public List<Promotie> findAllPromotii() {
        return new ArrayList<>(promotii);
    }
}

