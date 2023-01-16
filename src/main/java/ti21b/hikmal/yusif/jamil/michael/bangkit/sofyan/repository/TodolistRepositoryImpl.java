package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.config.Database;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity.Todolist;

public class TodolistRepositoryImpl implements TodolistRepository {
    
    private final Database database;

    public TodolistRepositoryImpl(Database database) {
        this.database = database;
    }

    @Override
    public Todolist insert(Todolist todolist) {
        int id = getMaxId(todolist.getId_user())+1;
        String sql = "INSERT INTO todolist(id, id_user, todo, created_at) VALUES(?, ?, ?, ?)";

        try (Connection connection = database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, todolist.getId_user());
                preparedStatement.setString(3, todolist.getTodo());
                preparedStatement.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));
                preparedStatement.executeUpdate();
                todolist.setId(id);
                return todolist;
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    private int getMaxId(String id_user) {
        String sql = "SELECT MAX(id) AS id FROM todolist WHERE id_user = ?";

        try (Connection connection = database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, id_user);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        return resultSet.getInt("id");
                    } return 0;
                }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Todolist[] getAll(String id_user) {
        String sql = "SELECT * FROM todolist WHERE id_user = ?";

        try (Connection connection = database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, id_user);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    List<Todolist> list = new ArrayList<>();
                    while (resultSet.next()) {
                        Todolist todolist = new Todolist(
                            resultSet.getInt("id"),
                            resultSet.getString("id_user"),
                            resultSet.getString("todo"),
                            resultSet.getTimestamp("created_at"),
                            resultSet.getTimestamp("modified_at"));
                        list.add(todolist);
                    }
                    return list.toArray(new Todolist[]{});
                }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Todolist update(Todolist todolist) {
        String sql = "UPDATE todolist SET todo = ?, modified_at = ? WHERE id_user = ? AND id = ?";

        try (Connection connection = database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, todolist.getTodo());
                preparedStatement.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
                preparedStatement.setString(3, todolist.getId_user());
                preparedStatement.setInt(4, todolist.getId());
                preparedStatement.executeUpdate();
                return todolist;
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public boolean delete(Todolist todolist) {
        String sql = "DELETE FROM todolist WHERE id_user = ? AND id = ?";

        try (Connection connection = database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, todolist.getId_user());
                preparedStatement.setInt(2, todolist.getId());
                preparedStatement.executeUpdate();
                return true;
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }
    
    @Override
    public boolean deleteAll(String id) {
        String sql = "DELETE FROM todolist WHERE id_user = ?";

        try (Connection connection = database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, id);
                preparedStatement.executeUpdate();
                return true;
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public void deleteAll() {
        String sql = "DELETE FROM todolist";

        try (Connection connection = database.getConnection();
            Statement statement = connection.createStatement()) {
                statement.executeUpdate(sql);
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

}
