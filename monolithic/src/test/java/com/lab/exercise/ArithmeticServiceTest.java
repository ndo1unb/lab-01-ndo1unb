package com.lab.exercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArithmeticServiceTest {

    private final ArithmeticService arithmeticService = new ArithmeticService();

    @Test
    public void testAdd() {
        assertEquals(5, arithmeticService.add(2, 3), "Addition should correctly add two numbers");
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, arithmeticService.subtract(2, 3), "Subtraction should correctly subtract two numbers");
    }

    @Test
    public void testMultiply() {
        assertEquals(6, arithmeticService.multiply(2, 3), "Multiplication should correctly multiply two numbers");
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, arithmeticService.divide(4, 2), "Division should correctly divide two numbers");
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            arithmeticService.divide(4, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage(), "Division by zero should throw IllegalArgumentException");
    }
}
