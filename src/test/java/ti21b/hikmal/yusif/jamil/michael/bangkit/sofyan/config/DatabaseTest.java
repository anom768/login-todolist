package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.config;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.config.Database;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class DatabaseTest {

    @Test
    void testConnectionTest() throws SQLException {
        var database = new Database("_test");
        var connection = database.getConnection();

        Assertions.assertNotNull(connection);
    }

    @Test
    void testConnectionProd() throws SQLException {
        var database = new Database("_prod");
        var connection = database.getConnection();

        Assertions.assertNotNull(connection);
    }

    @Test
    void testNotSingleton() throws SQLException {
        var database = new Database("_test");
        var connection1 = database.getConnection();
        var connection2 = database.getConnection();

        Assertions.assertNotSame(connection2, connection1);
    }

}
