package se.hkr.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;



/* Test cases
 * 1-- user id :1234 return : 1400.00 hardcoded values.
 * 2-- user id: 12345M return -1.0
 * 3-- user id: -1234 return -1.0
 * 4-- user id: 2789 return: 10010000030
 * 5-- user id: 123456789101112 return -1.0
 * 6-- user id: 00001  return: 5141
 */


public class BankTest {

    private Bank swedbank = new Bank();
    private int userId;
    private double expectedResult;
    private double actualResult;
    private double delta = 0.01;

    @Test
    public void getBalanceTestOne() {

        userId = 1234;
        expectedResult = 1400.00;
        actualResult = swedbank.getBalance(userId);

        Assert.assertEquals(expectedResult, actualResult, delta);

    }

    /*@Test
    public void getBalanceTestTwo() {

        userId = 12345M;    //  TODO Different test case?
        expectedResult = 1400.00;
        actualResult = swedbank.getBalance(userId);

        Assert.assertEquals(expectedResult, actualResult, delta);

    }*/

    @Test
    public void getBalanceTestThree() {

        userId = -1234;
        expectedResult = -1.0;
        actualResult = swedbank.getBalance(userId);

        Assert.assertEquals(expectedResult, actualResult, delta);

    }

    @Test
    public void getBalanceTestFour() {

        userId = 2789;
        expectedResult = 10010000030.00;
        actualResult = swedbank.getBalance(userId);

        Assert.assertEquals(expectedResult, actualResult, delta);

    }

    /*@Test
    public void getBalanceTestFive() {

        userId = 123456789101112;   //  TODO Different test case?
        expectedResult = -1.0;
        actualResult = swedbank.getBalance(userId);

        Assert.assertEquals(expectedResult, actualResult, delta);

    }*/


    @Test
    public void getBalanceTestSix() {

        userId = 00001;
        expectedResult = 5141.00;
        actualResult = swedbank.getBalance(userId);

        Assert.assertEquals(expectedResult, actualResult, delta);

    }

}