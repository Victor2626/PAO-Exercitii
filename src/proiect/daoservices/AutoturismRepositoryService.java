package proiect.daoservices;

import proiect.model.Autoturism;
import proiect.dao.MasinaDao;
import proiect.model.Masina;

import java.util.List;

public class AutoturismRepositoryService {
    private final MasinaDao masinaDao = new MasinaDao();

    public void addAutoturism(Masina masina) {
        masinaDao.createMasina(masina);
    }

    public Autoturism getAutoturismById(int id) {
        return masinaDao.readMasina(id);
    }

    public void updateAutoturism(int id, Masina updatedMasina) {
        masinaDao.updateMasina(id, updatedMasina);
    }

    public void removeAutoturism(Masina masina) {
        masinaDao.deleteMasina(masina);
    }

    public List<Masina> getAllAutoturisme() {
        return masinaDao.findAllMasini();
    }
}
