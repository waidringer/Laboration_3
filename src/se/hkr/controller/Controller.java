package se.hkr.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import se.hkr.model.Atm;

import java.text.DecimalFormat;

public class Controller {

    @FXML private Label balanceField;
    @FXML private TextField idField;

    @FXML
    private void handleButton(ActionEvent ae){
        Atm atm = new Atm(idField.getText());
        DecimalFormat df = new DecimalFormat("#.00");
        balanceField.setText(df.format(atm.getBalance()) + "");
    }

}
