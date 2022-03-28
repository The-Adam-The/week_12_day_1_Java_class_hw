import org.junit.Before;
import org.junit.Test;

import java.net.CacheRequest;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void beforeEach() {
        calculator = new Calculator();
    }

    @Test
    public void hasAdd(){
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void hasSubtract(){
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void hasMultiply(){
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    public void hasDivide(){
        assertEquals(5, calculator.divide(25, 5), 0.01);
    }

}
