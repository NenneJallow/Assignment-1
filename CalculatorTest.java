package Assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        // Equivalence Partitioning: Positive, Negative, Zero
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(2, -3));
        assertEquals(0, calculator.add(0, 0));
        
        // Boundary Value Analysis
        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MIN_VALUE, 0));
    }

    @Test
    public void testSubtract() {
        // Equivalence Partitioning: Positive, Negative, Zero
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(5, calculator.subtract(2, -3));
        assertEquals(0, calculator.subtract(0, 0));

        // Boundary Value Analysis
        assertEquals(Integer.MAX_VALUE, calculator.subtract(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, calculator.subtract(Integer.MIN_VALUE, 0));
    }

    @Test
    public void testMultiply() {
        // Equivalence Partitioning: Positive, Negative, Zero
        assertEquals(15, calculator.multiply(3, 5));
        assertEquals(-15, calculator.multiply(3, -5));
        assertEquals(0, calculator.multiply(0, 5));

        // Boundary Value Analysis
        assertEquals(0, calculator.multiply(Integer.MAX_VALUE, 0));
        assertEquals(0, calculator.multiply(Integer.MIN_VALUE, 0));
    }

    @Test
    public void testDivide() {
        // Equivalence Partitioning: Positive, Negative
        assertEquals(2.5, calculator.divide(5, 2), 0.0001);
        assertEquals(-2.5, calculator.divide(-5, 2), 0.0001);

        // Boundary Value Analysis
        assertThrows(ArithmeticException.class, () -> calculator.divide(Integer.MAX_VALUE, 0));
        assertThrows(ArithmeticException.class, () -> calculator.divide(Integer.MIN_VALUE, 0));
    }

    @Test
    public void testDivideByZero() {
        // Negative Testing
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }
}
