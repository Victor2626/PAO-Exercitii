package proiect.daoservices;

import proiect.model.Livrator;
import proiect.dao.LivratorDao;

import java.util.List;

public class LivratorRepositoryService {
    private final LivratorDao livratorDao = new LivratorDao();

    public void addLivrator(Livrator livrator) {
        livratorDao.createLivrator(livrator);
    }

    public Livrator getLivratorById(int id) {
        return livratorDao.readLivrator(id);
    }

    public void updateLivrator(int id, Livrator updatedLivrator) {
        livratorDao.updateLivrator(id, updatedLivrator);
    }

    public void removeLivrator(Livrator livrator) {
        livratorDao.deleteLivrator(livrator);
    }

    public List<Livrator> getAllLivratori() {
        return livratorDao.findAllLivratori();
    }
}
