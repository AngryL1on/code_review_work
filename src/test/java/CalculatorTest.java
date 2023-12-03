import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-7, calculator.add(-4, -3));
    }

    @Test
    void dif() {
        assertEquals(3, calculator.dif(6, 3));
        assertEquals(9, calculator.dif(6, -3));
    }

    @Test
    void div() throws Exception {
        assertEquals(5, calculator.div(45, 9));
        assertThrows(Exception.class, () -> calculator.div(4, 0));
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(2, 3));
        assertEquals(-12, calculator.times(4, -3));
        assertEquals(0, calculator.times(4, 0));
    }

    @Test
    void solver() throws Exception {
        // Both parameters come non-zero
        assertEquals(-2, calculator.solver(4, 8));
        assertEquals(2, calculator.solver(4, -8));

        // One or both of the parameters is zero
        assertThrows(Exception.class, () -> calculator.solver(0, -5));
        assertThrows(Exception.class, () -> calculator.solver(5, 0));
        assertThrows(Exception.class, () -> calculator.solver(0, 0));
    }
}