package com.lab.exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testAdd() {
        assertEquals(5, calculatorService.add(2, 3), "Addition should correctly add two numbers");
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, calculatorService.subtract(2, 3), "Subtraction should correctly subtract two numbers");
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculatorService.multiply(2, 3), "Multiplication should correctly multiply two numbers");
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculatorService.divide(4, 2), "Division should correctly divide two numbers");
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.divide(4, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage(), "Division by zero should throw IllegalArgumentException");
    }
}