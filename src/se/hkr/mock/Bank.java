package se.hkr.mock;

public class Bank {

    public Bank() {
    }

    public double getBalance(int userID){
        if(userID == 1234)
            return 77.77;
        else
            return -1;
    }
}
