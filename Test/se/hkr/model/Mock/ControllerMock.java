package se.hkr.model.Mock;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerMock implements AtmInterface {

    private TextField userId = null;
    private Label outputBalance = null;
    private AtmMock atmMock = new AtmMock();


    @Override
    public void buttonHandler() {

    }


    public double getBalance(int userId) {
        return 0;
    }

    public void getUserId() {

    }
}
