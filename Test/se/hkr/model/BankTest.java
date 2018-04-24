package se.hkr.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/* Test cases
 * 1-- user id :1234 return : 1400.00 hardcoded values.
 * 2-- user id: -1234 return -1.0
 * 3-- user id: 2789 return: 10010000030
 * 4-- user id: 00001  return: 5141
 */


public class BankTest {

    private Bank swedbank = new Bank();
    private int userId;
    private double expectedResult;
    private double actualResult;
    private double delta = 0.001;

    @Test
    public void getBalanceTestOne() {

        userId = 1234;
        expectedResult = 1400.00;
        actualResult = swedbank.getBalance(userId);

        Assert.assertEquals(expectedResult, actualResult, delta);

    }

    @Test
    public void getBalanceTestTwo() {

        userId = -1234;
        expectedResult = -1.0;
        actualResult = swedbank.getBalance(userId);

        Assert.assertEquals(expectedResult, actualResult, delta);

    }

    @Test
    public void getBalanceTestThree() {

        userId = 2789;
        expectedResult = 10010000030.00;
        actualResult = swedbank.getBalance(userId);

        Assert.assertEquals(expectedResult, actualResult, delta);

    }

    @Test
    public void getBalanceTestFour() {

        userId = 00001;
        expectedResult = 5141.00;
        actualResult = swedbank.getBalance(userId);

        Assert.assertEquals(expectedResult, actualResult, delta);

    }

}