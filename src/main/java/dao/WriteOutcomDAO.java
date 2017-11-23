package dao;

import model.Outcome;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteOutcomDAO {
    private Connection connection;
    final String sql = "INSERT INTO zasanie_211.home_budget (type, description, amount, date) VALUES (?,?,?,?)";

    public void add(Outcome outcome) {
        BudgetDao budgetDao = new BudgetDao();
        connection = budgetDao.sqlConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, outcome.getType());
            preparedStatement.setString(2, outcome.getDescription());
            preparedStatement.setDouble(3, outcome.getAmount());
            preparedStatement.setDate(4, Date.valueOf(outcome.getData()));
        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(WriteOutcomDAO.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
        budgetDao.close();
    }
}
