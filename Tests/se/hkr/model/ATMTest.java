package se.hkr.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ATMTest {

    private ATM atm = new ATM("1234");

    @Test
    public void getBalance() throws Exception {
        double expectedValue = 77.77;
        double acctualValue = atm.getBalance();

        Assert.assertEquals(expectedValue, acctualValue, 0.001);
    }

}