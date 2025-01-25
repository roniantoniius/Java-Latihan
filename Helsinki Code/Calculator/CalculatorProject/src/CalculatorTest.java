import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(999, calculator.add(999));
    }

    @Test
    void testSubstract() {
        Calculator calculator = new Calculator();
        assertEquals(-342, calculator.substract(342));
    }

    @Test
    public void calculatorInitialValueZero(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getValue());
    }

    @Test
    public void valueFiveHundredWhenFiveHundredAdded(){
        Calculator calculator = new Calculator();
        calculator.add(500);
        assertEquals(500, calculator.getValue());
    }

    @Test
    public void valueMinusTwoHundredWhenTwoHundredSubtracted(){
        Calculator calculator = new Calculator();
        calculator.substract(200);
        assertEquals(-200, calculator.getValue());
    }
}