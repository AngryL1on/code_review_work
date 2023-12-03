import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(2, calculator.add(1, 1));
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-7, calculator.add(-4, -3));
    }

    @Test
    void dif() {
        assertEquals(1, calculator.dif(2, 1));
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
        assertEquals(4, calculator.times(2, 2));
        assertEquals(-12, calculator.times(4, -3));
        assertEquals(0, calculator.times(4, 0));
    }

    @Test
    void solver() throws Exception {
        assertEquals(121, calculator.solver(10, 2, 5));
    }
}