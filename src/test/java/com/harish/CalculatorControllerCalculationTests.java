package com.harish;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorControllerCalculationTests {

    @Test
    public void testAdd(){
        CalculationRequest request = new CalculationRequest(2,3,"add");
        double expected = 5;
        CalulatorController controller = new CalulatorController();
        CalculationResult result = controller.calculate(request);

        assertEquals(expected, result.getResult(),0.001);

    }
    @Test
    public void testSubstract(){
        CalculationRequest request = new CalculationRequest(2,3,"subtract");
        double expected = -1;
        CalulatorController controller = new CalulatorController();
        CalculationResult result = controller.calculate(request);

        assertEquals(expected, result.getResult(),0.001);

    }
    @Test
    public void testmultiply(){
        CalculationRequest request = new CalculationRequest(2,3,"multiply");
        double expected = 6;
        CalulatorController controller = new CalulatorController();
        CalculationResult result = controller.calculate(request);

        assertEquals(expected, result.getResult(),0.001);

    }
    @Test
    public void testdivide(){
        CalculationRequest request = new CalculationRequest(10,5,"divide");
        double expected = 2;
        CalulatorController controller = new CalulatorController();
        CalculationResult result = controller.calculate(request);

        assertEquals(expected, result.getResult(),0.001);

    }
    @Test
    public void testInvalidOperation() {
        CalculationRequest request = new CalculationRequest(2, 3, "invalid");

        CalulatorController controller = new CalulatorController();

        try {
            controller.calculate(request);
        } catch (IllegalArgumentException ex) {
            assertEquals("Invalid Operation", ex.getMessage());
        }
    }


}
