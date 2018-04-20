package se.hkr.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import se.hkr.model.Atm;

import java.text.DecimalFormat;

/**
 * Takes userId as input from idField and passes it as a parameter when creating the Atm object.
 * Decimalformat ensures the two decimal precision when the balanceField is set.
 */
public class Controller {

    @FXML
    private Label balanceField;
    @FXML
    private TextField idField;

    @FXML
    private void handleButton() {
        Atm atm = new Atm(idField.getText());
        DecimalFormat df = new DecimalFormat("#.00");
        balanceField.setText(df.format(atm.getBalance()) + "");
    }

}
