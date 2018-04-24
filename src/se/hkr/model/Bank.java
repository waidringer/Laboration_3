package se.hkr.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Creates a connection to the database. In the database userId and balance for that userId is stored.
 * The method getBalance takes the userId as input.
 * Creates a prepared statement and checking if the userId exists and if the balance is not negative.
 * If user exists and balance is positive - the balance is returned for that user.
 * Else it returns -1 which the Atm class will handle.
 */
class Bank {

    private String connectionInfo = "jdbc:mysql://mysql.u4436252.fsdata.se/u4436252_y";
    private String userName = "u4436252";
    private String password = "6+hvxjPqMKU7";

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;


    double getBalance(int userId) {

        double balance = 0;

        try {

            connection = DriverManager.getConnection(connectionInfo, userName, password);

            String query = "SELECT balance FROM customer WHERE userId = ? ;";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, userId);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                balance = resultSet.getDouble(1);

            } else {

                return -1;
            }// End of if-else

        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

            close();
        }// End of try - catch - finally

        if (balance >= 0) {

            return balance;

        } else {

            return -1;
        }// End of if-else

    }// End of getBalance()


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
    }// End of close()
}// End of Bank
