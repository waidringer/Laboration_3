package se.hkr.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import se.hkr.model.ATM;

public class mainController {

    @FXML private Label balanceField;
    @FXML private TextField idField;

    @FXML
    private void handleButton(ActionEvent ae){
        ATM atm = new ATM(idField.getText());

        balanceField.setText(atm.getBalance() + "");
    }

}
