import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Project Name    : code-quality-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 10/15/2021
 * Time            : 9:29 PM
 * Description     :
 **/

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(100, calculator.add(60, 40));
    }

    @Test
    public void testSubtraction() {
        assertEquals(20, calculator.subtract(60, 40));
    }

    @Test
    public void testMultiplication() {
        assertEquals(2400, calculator.multiply(60, 40));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.divide(80, 40));
    }
}
