package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.config.Database;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRepositoryImpl implements UserRepository {

    private final Database database;
    public UserRepositoryImpl(Database database) {
        this.database = database;
    }

    @Override
    public User insert(User user) {
        String sql = "INSERT INTO user(id, name, password) VALUES(?, ?, ?)";
        try (Connection connection = database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, user.getId());
                preparedStatement.setString(2, user.getName());
                preparedStatement.setString(3, user.getPassword());
                preparedStatement.executeUpdate();
                return user;
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public User update(User user) {
        String sql = "UPDATE user SET name = ?, password = ? WHERE id = ?";
        try (Connection connection = database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, user.getName());
                preparedStatement.setString(2, user.getPassword());
                preparedStatement.setString(3, user.getId());
                preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
        return user;
    }

    @Override
    public User findById(String id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        try (Connection connection = database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, id);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        return new User(
                            resultSet.getString("id"),
                            resultSet.getString("name"),
                            resultSet.getString("password")
                        );
                    } return null;
                }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public void deleteAll() throws SQLException {
        String sql = "DELETE FROM user";
        try (Connection connection = database.getConnection();
            Statement statement = connection.createStatement()) {
                statement.executeUpdate(sql);
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

}
