package proiect.daoservices;

import proiect.dao.MancareDao;
import proiect.model.Mancare;

import java.util.List;

public class MancareRespositoryService {
    private MancareDao mancareDao;
    public MancareRespositoryService(){
        this.mancareDao = new MancareDao();
    }

    public void addMancare(Mancare mancare) {
        mancareDao.createMancare(mancare);
    }

    public Mancare getLivratorById(int id) {
        return mancareDao.readMancare(id);
    }

    public void updateLivrator(int id, Mancare updatedLivrator) {
        mancareDao.updateMancare(id, updatedLivrator);
    }

    public void removeLivrator(Mancare livrator) {
        mancareDao.deleteMancare(livrator);
    }

    public List<Mancare> getAllLivratori() {
        return mancareDao.findAllMancaruri();
    }
}
