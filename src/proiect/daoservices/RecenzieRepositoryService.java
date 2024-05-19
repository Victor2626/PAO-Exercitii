package proiect.daoservices;

import proiect.model.Recenzie;
import proiect.dao.RecenzieDao;

import java.util.List;

public class RecenzieRepositoryService {
    private RecenzieDao recenzieDao;
    public RecenzieRepositoryService(){
        this.recenzieDao = new RecenzieDao();
    }

    public void addRecenzie(Recenzie recenzie) {
        recenzieDao.createRecenzie(recenzie);
    }

    public Recenzie getRecenzieById(int id) {
        return recenzieDao.readRecenzie(id);
    }

    public void updateRecenzie(int id, Recenzie updatedRecenzie) {
        recenzieDao.updateRecenzie(id, updatedRecenzie);
    }

    public void removeRecenzie(Recenzie recenzie) {
        recenzieDao.deleteRecenzie(recenzie);
    }

    public List<Recenzie> getAllRecenzii() {
        return recenzieDao.findAllRecenzii();
    }
}
