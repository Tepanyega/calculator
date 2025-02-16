package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    public void testAddition(){
        String expression = "2+2";
        double result = calculator.evaluate(expression);
        assertEquals(4.0, result, 0.0001, "2 + 2 should be equal to 4");
    }

    @Test
    public void testMultiplication(){
        String expression = "2*2";
        double result = calculator.evaluate(expression);
        assertEquals(4,result, 0.0001, "2*2 should be 4");
    }

    @Test    public void testComplexExpression(){
        String expression = "(8 - 9) * 7 + 78 / 7";
        double result = calculator.evaluate(expression);
        assertEquals(4.142857142857143, result, 0.0001, "The results should match");
    }

    @Test
    public void testInvalidExpression() {
        String expression = "2/0";
        try {
            calculator.evaluate(expression);
            fail("Expected exception for division by zero");
        }catch (Exception e) {
            //it won't reach this part
        }
    }

}


