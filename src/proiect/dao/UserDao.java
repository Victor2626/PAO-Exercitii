package proiect.dao;

import proiect.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static int nextId = 1;
    private static List<User> users = new ArrayList<>();

    public void createUser(User user) {
        user.setId(nextId++);
        users.add(user);
    }

    public User readUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public void updateUser(int id, User userUpdated) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getId() == id) {
                userUpdated.setId(id);
                users.set(i, userUpdated);
                return;
            }
        }
    }

    public void deleteUser(User user) {
        users.remove(user);
    }

    public List<User> findAllUsers() {
        return new ArrayList<>(users);
    }
}

