package UnitTest.Test.java;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import UnitTest.Main.java.Calculator;
public class CalculatorTest {

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
        calculator.subtract(200);
        assertEquals(-200, calculator.getValue());
    }
}