package proiect.dao;

import proiect.model.User;

import java.sql.SQLException;

public interface DaoInterface <T>{
    public void create(T entity)  throws SQLException;

    public T read(Integer id) throws SQLException;

    public void update(Integer id, T entity) throws SQLException;

    public void delete(T entity) throws SQLException;

}