package se.hkr.model.Mock;

public interface AtmInterface {

    //Bank  and Atm class
    double getBalance(int userId);

    //Atm class
    void getUserId();

    //Controller class
    void buttonHandler();


}
