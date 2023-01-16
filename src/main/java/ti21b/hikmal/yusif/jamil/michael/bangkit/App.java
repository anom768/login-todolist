package ti21b.hikmal.yusif.jamil.michael.bangkit;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.view.MainWindow;

import java.sql.SQLException;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.config.Database;

public class App {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new MainWindow(new Database("_test")).setVisible(true);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
