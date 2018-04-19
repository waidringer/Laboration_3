package se.hkr.model;

//Rember to remove in finished product
import javafx.scene.control.Alert;
import se.hkr.mock.Bank;

public class Atm {

    private Bank bank;
    private int userID;
    private double balance;

    public Atm(String userID) {



        try{
            int tempID = Integer.parseInt(userID);

            if(tempID<0){
                throw new Exception();
            }

            bank = new Bank();
            balance = bank.getBalance(tempID);

            if(balance == -1){
                errorHandler("Invalid Input", "No user with this ID", "Please enter a valid user ID!", Alert.AlertType.WARNING);
            }

        }catch (Exception e){
            bank = null;
            balance = -1;

            errorHandler("Invalid Input", "Invalid user ID", "Please enter a valid user ID!", Alert.AlertType.ERROR);
        }

    }

    public double getBalance() {
        return balance;
    }

    private void errorHandler(String title, String header, String message, Alert.AlertType type){
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);

        alert.showAndWait();
    }
}
