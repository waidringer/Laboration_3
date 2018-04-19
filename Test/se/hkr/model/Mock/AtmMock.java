package se.hkr.model.Mock;

public class AtmMock implements AtmInterface {

    private int userId = 0;
    private double balance = 0;
    private BankMock bankMock = new BankMock();


    @Override
    public double getBalance(int userId) {
        return 0;
    }

    @Override
    public void getUserId() {

    }


    public void buttonHandler() {

    }
}
