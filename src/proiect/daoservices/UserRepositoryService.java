package proiect.daoservices;

import proiect.model.User;
import proiect.dao.UserDao;

import java.util.List;
import java.sql.SQLException;

public class UserRepositoryService {

    private UserDao userDao;
    public UserRepositoryService() throws SQLException {
        this.userDao = new UserDao();
    }

    public User getUserById(Integer id) throws SQLException {
        User user = userDao.read(id);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("No user having this id");
        }

        return user;
    }

    public void createUser(Integer id, String name, String email, String password, String address, double discountRate) throws SQLException {
        User user = new User(id, name, email, password, address, discountRate);
        userDao.create(user);
    }

    public void updateUser(int id, User user) throws SQLException {
        if (user != null) {
            userDao.update(id, user);
        }
    }

    public void removeUser(Integer id) throws SQLException {
        User user = userDao.read(id);
        if (user != null) {
            userDao.delete(user);
        } else {
            System.out.println("User not found.");
        }
    }
}
