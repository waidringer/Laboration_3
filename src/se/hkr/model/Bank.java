package se.hkr.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Bank {

    private String connectionInfo = "jdbc:mysql://mysql.u4436252.fsdata.se/u4436252_y";
    private String userName = "u4436252";
    private String password = "6+hvxjPqMKU7";

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;


    public double getBalance(int userId) {

        double balance = 0;

        try {
            connection = DriverManager.getConnection(connectionInfo, userName, password);

            String query = "SELECT balance FROM customer WHERE userId = ? ;";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, userId);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                balance = resultSet.getDouble(1);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            close();
        }

        return balance;
    }


    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connection != null) {
                connection.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
