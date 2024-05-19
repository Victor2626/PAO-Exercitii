package proiect.dao;

import proiect.daoservices.DatabaseConnection;
import proiect.model.Livrator;
import proiect.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivratorDao implements DaoInterface<Livrator>{
    private static LivratorDao livratorDao;
    private Connection connection = DatabaseConnection.getConnection();
    public LivratorDao() throws SQLException {
    }

    @Override
    public void create(Livrator livrator) throws SQLException {
        String sql = "INSERT INTO demo.livrator VALUES (?, ?, ?);";

        try(PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setInt(1, livrator.getId());
            statement.setString(2, livrator.getName());
            statement.setInt(3, livrator.getEstimatedDeliveryTime());
            statement.executeUpdate();
        }
    }

    @Override
    public Livrator read(Integer id) throws SQLException {
        String sql = "SELECT * FROM demo.livrator l WHERE l.id = ?";
        ResultSet rs = null;
        try(PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setInt(1, id);
            rs = statement.executeQuery();

            while (rs.next()){
                Livrator l = new Livrator();
                l.setId(rs.getInt("id"));
                l.setName(rs.getString("name"));
                l.setEstimatedDeliveryTime(rs.getInt("estimatedDeliveryTime"));
                return  l;
            }
        }finally {
            if(rs != null) {
                rs.close();
            }
        }
        return null;
    }

    @Override
    public void update(Integer id, Livrator livrator)  throws SQLException{
        String sql = "UPDATE demo.livrator l set l.name = ? , l.estimatedDeliveryTime = ? where l.id = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
            preparedStatement.setString(1, livrator.getName());
            preparedStatement.setInt(2, livrator.getEstimatedDeliveryTime());
            preparedStatement.setInt(3, livrator.getId());
            preparedStatement.executeUpdate();
        }
    }

    @Override
    public void delete(Livrator livrator) throws SQLException {
        String sql = "DELETE FROM demo.livrator l WHERE l.id = ?";

        try(PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setInt(1, livrator.getId());
            statement.executeUpdate();
        }
    }
}

