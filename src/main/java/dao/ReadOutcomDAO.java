package dao;

import model.Outcome;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadOutcomDAO {
    private final String sql = "SELECT id, type, description, amount, date FROM home_budget WHERE id = ?";

    private Connection connection;

    public Outcome read(long id) {
        BudgetDao budgetDao = new BudgetDao();
        Outcome outcome = new Outcome();
        try {
            connection = budgetDao.sqlConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                outcome.setId(resultSet.getLong("id"));
                outcome.setType(resultSet.getString("type"));
                outcome.setDescription(resultSet.getString("description"));
                outcome.setAmount(resultSet.getDouble("amount"));
                outcome.setData(resultSet.getDate("date").toLocalDate());
                System.out.println(outcome.toString());
                return outcome;
            }
            budgetDao.close();

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(ReadOutcomDAO.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return null;
    }
}
