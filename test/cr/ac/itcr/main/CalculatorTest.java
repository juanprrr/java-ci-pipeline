package cr.ac.itcr.main;

import org.junit.Assert;

import static org.junit.Assert.*;
public class CalculatorTest {

    @org.junit.Test
    //Expected is correct so it must be successful
    public void sumTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(3, calculator.sum(1,2));
    }
    @org.junit.Test
    //Expected is incorrect so it must be unsuccessful
    public void sumTestTwo() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(12, calculator.sum(1,2));
    }

    @org.junit.Test
    //Expected is correct so it must be successful
    public void subtractTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, calculator.subtract(2,2));
    }

    @org.junit.Test
    //Expected is incorrect so it must be unsuccessful
    public void subtractTestTwo() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(1, calculator.subtract(2,2));
    }


    @org.junit.Test
    //Expected is correct so it must be successful
    public void multiplyTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(4, calculator.multiply(2,2));
    }

    @org.junit.Test
    //Expected is incorrect so it must be unsuccessful
    public void multiplyTestTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(11, calculator.multiply(2,2));
    }

    @org.junit.Test
    public void divideTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(1, calculator.divide(2,2));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void divideTestTwo() {
        Calculator calculator = new Calculator();
        calculator.divide(2,0);
    }

}