package se.hkr.model;

import org.junit.Assert;
import org.junit.Test;

public class AtmTest {

    private Atm atm = new Atm("1234");

    @Test
    public void getBalance() {
        double expectedValue = 1400.00;
        double acctualValue = atm.getBalance();

        Assert.assertEquals(expectedValue, acctualValue, 0.001);
    }

}