package proiect.daoservices;

import proiect.model.User;
import proiect.dao.UserDao;

import java.util.List;

public class UserRepositoryService {
    private final UserDao userDao = new UserDao();

    public void addUser(User user) {
        userDao.createUser(user);
    }

    public User getUserById(int id) {
        return userDao.readUser(id);
    }

    public void updateUser(int id, User updatedUser) {
        userDao.updateUser(id, updatedUser);
    }

    public void removeUser(User user) {
        userDao.deleteUser(user);
    }

    public List<User> getAllUsers() {
        return userDao.findAllUsers();
    }
}
