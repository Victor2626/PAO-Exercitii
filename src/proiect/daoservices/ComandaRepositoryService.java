package proiect.daoservices;

import proiect.model.Comanda;
import proiect.dao.ComandaDao;

import java.util.List;

public class ComandaRepositoryService {

    private final ComandaDao comandaDao = new ComandaDao();

    public void addComanda(Comanda comanda) {
        comandaDao.createComanda(comanda);
    }

    public Comanda getComandaById(int id) {
        return comandaDao.readComanda(id);
    }

    public void updateComanda(int id, Comanda updatedComanda) {
        comandaDao.updateComanda(id, updatedComanda);
    }

    public void removeComanda(Comanda comanda) {
        comandaDao.deleteComanda(comanda);
    }

    public List<Comanda> getAllComenzi() {
        return comandaDao.findAllComenzi();
    }
}
