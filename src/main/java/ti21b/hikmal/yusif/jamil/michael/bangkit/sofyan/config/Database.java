package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.config;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private String env;
    private Connection connection;

    public Database(String env) throws SQLException {
        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);
        this.env = env;
    }

    public Connection getConnection() throws SQLException {
        if (env.equals("_prod")) {
            env = "";
        }

        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/login_todolist"+env,
                "root", ""
        );

        return connection;
    }


}
