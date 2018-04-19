package se.hkr.model;

import org.junit.Assert;
import org.junit.Test;

public class AtmTest {

    private Atm atm = new Atm("1234");

    @Test
    public void getBalance() throws Exception {
        double expectedValue = 77.77;
        double acctualValue = atm.getBalance();

        Assert.assertEquals(expectedValue, acctualValue, 0.001);
    }

}