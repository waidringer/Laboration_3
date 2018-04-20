package se.hkr.model;

import javafx.scene.control.Alert;

/**
 * Takes userId and parse to Integer.
 * Creates a bank object which is a connection to the database.
 * Retrieve the balance with the parsed userId.
 * If any errors like wrong userId or invalid input an alert is displayed.
 */
public class Atm {

    private Bank bank;
    private double balance;

    public Atm(String userID) {

        try {

            int tempID = Integer.parseInt(userID);

            if (tempID < 0) {
                throw new Exception();
            }

            bank = new Bank();
            balance = bank.getBalance(tempID);

            if (balance == -1) {
                errorHandler("Invalid Input", "No user with this ID", "Please enter a valid user ID!", Alert.AlertType.WARNING);
            }

        } catch (Exception e) {
            bank = null;
            balance = -1;

            errorHandler("Invalid Input", "Invalid user ID", "Please enter a valid user ID!", Alert.AlertType.ERROR);
        }

    }

    public double getBalance() {
        return balance;
    }

    private void errorHandler(String title, String header, String message, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);

        alert.showAndWait();
    }
}
