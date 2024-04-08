package proiect.daoservices;

import proiect.model.Promotie;
import proiect.dao.PromotieDao;

import java.util.List;

public class PromotieRepositoryService {
    private final PromotieDao promotieDao = new PromotieDao();

    public void addPromotie(Promotie promotie) {
        promotieDao.createPromotie(promotie);
    }

    public Promotie getPromotieById(int id) {
        return promotieDao.readPromotie(id);
    }

    public void updatePromotie(int id, Promotie updatedPromotie) {
        promotieDao.updatePromotie(id, updatedPromotie);
    }

    public void removePromotie(Promotie promotie) {
        promotieDao.deletePromotie(promotie);
    }

    public List<Promotie> getAllPromotii() {
        return promotieDao.findAllPromotii();
    }
}
