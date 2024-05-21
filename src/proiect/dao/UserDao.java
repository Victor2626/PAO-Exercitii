package proiect.dao;

import proiect.model.User;
import java.sql.*;
import proiect.daoservices.DatabaseConnection;

public class UserDao implements DaoInterface<User> {
    private static UserDao userDao;
    private Connection connection = DatabaseConnection.getConnection();
    public UserDao() throws SQLException {
    }

    public static UserDao getInstance() throws SQLException {
        if(userDao == null){
            userDao = new UserDao();
        }
        return userDao;
    }

    @Override
    public void create(User user) throws SQLException {
        String sql = "INSERT INTO demo.user VALUES (?, ?, ?, ?, ?, ?);";

        try(PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setInt(1, user.getId());
            statement.setString(2, user.getName());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPassword());
            statement.setString(5, user.getAddress());
            statement.setDouble(6, user.getDiscountRate());
            statement.executeUpdate();
        }
    }

    @Override
    public User read(Integer id) throws SQLException {
        String sql = "SELECT * FROM demo.user u WHERE u.id = ?";
        ResultSet rs = null;
        try(PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setInt(1, id);
            rs = statement.executeQuery();

            while (rs.next()){
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setName(rs.getString("name"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setAddress(rs.getString("adresss"));
                u.setDiscountRate(rs.getDouble("dicountRate"));
                return  u;
            }
        }finally {
            if(rs != null) {
                rs.close();
            }
        }
        return null;
    }

    @Override
    public void update(Integer id, User user)  throws SQLException{
        String sql = "UPDATE demo.user u set u.name = ? , u.email = ?" +
                " , u.password = ? , u.address = ?, u.discountRate = ? where u.id = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getAddress());
            preparedStatement.setDouble(5, user.getDiscountRate());
            preparedStatement.setInt(6, user.getId());
            preparedStatement.executeUpdate();
        }
    }

    @Override
    public void delete(User user) throws SQLException {
        String sql = "DELETE FROM demo.user u WHERE u.id = ?";

        try(PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setInt(1, user.getId());
            statement.executeUpdate();
        }
    }


}

