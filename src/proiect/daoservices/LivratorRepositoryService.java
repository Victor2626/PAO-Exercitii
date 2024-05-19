package proiect.daoservices;

import proiect.dao.UserDao;
import proiect.model.Livrator;
import proiect.dao.LivratorDao;
import proiect.model.User;

import java.sql.SQLException;
import java.util.List;

public class LivratorRepositoryService {
    private LivratorDao livratorDao;
    public LivratorRepositoryService() throws SQLException {
        this.livratorDao = new LivratorDao();
    }

    public Livrator getLivratorById(Integer id) throws SQLException {
        Livrator livrator = livratorDao.read(id);
        if (livrator != null) {
            System.out.println(livrator);
        } else {
            System.out.println("No livrator having this id");
        }

        return livrator;
    }

    public void createLivrator(Integer id, String name, Integer estimatedDeliveryTime) throws SQLException {
        Livrator livrator = new Livrator(id, name, estimatedDeliveryTime);
        livratorDao.create(livrator);
    }

    public void updateLivrator(int id, Livrator livrator) throws SQLException {
        if (livrator != null) {
            livratorDao.update(id, livrator);
        }
    }

    public void removeLivrator(Integer id) throws SQLException {
        Livrator livrator = livratorDao.read(id);
        if (livrator != null) {
            livratorDao.delete(livrator);
        } else {
            System.out.println("Livrator not found.");
        }
    }
}

