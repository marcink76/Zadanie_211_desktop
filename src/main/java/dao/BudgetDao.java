package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BudgetDao {
    private static final String SERVER_URL = "jdbc:mysql://localhost:3306/Zasanie_211";
    private static final String USER = "root";
    private static final String PASS = "admin";
    private Connection connection;

    public Connection sqlConnection() {
        try {
            connection = DriverManager.getConnection(SERVER_URL, USER, PASS);
            //System.out.println("Połączenie nawiązane");
        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(BudgetDao.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return connection;
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
