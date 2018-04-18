package se.hkr.model;

//Rember to remove in finished product
import javafx.scene.control.Alert;
import se.hkr.mock.Bank;

public class ATM {

    private Bank bank;
    private int userID;
    private double balance;

    public ATM(String userID) {



        try{
            int tempID = Integer.parseInt(userID);

            if(tempID<0){
                throw new Exception();
            }

            bank = new Bank();
            balance = bank.getBalance(tempID);

        }catch (Exception e){
            bank = null;
            balance = -1;

            errorHandler("Hejsan", "Hoppsan", "Lillebror");
        }

    }

    public double getBalance() {
        return balance;
    }

    private void errorHandler(String title, String header, String message){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error Dialog");
        alert.setHeaderText("Look, an Error Dialog");
        alert.setContentText("Ooops, there was an error!");

        alert.showAndWait();
    }
}
