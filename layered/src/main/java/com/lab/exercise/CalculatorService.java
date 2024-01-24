package com.lab.exercise;

// Business layer
public class CalculatorService {

    private static CalculatorOperations calculatorOperations = new CalculatorOperations();

    public int add(int a, int b) {
        return calculatorOperations.add(a,b);
    }
    public int subtract(int a, int b) {
        return calculatorOperations.subtract(a,b);
    }
    public int multiply(int a, int b) {
        return calculatorOperations.multiply(a,b);
    }
    public int divide(int a, int b) {
        return calculatorOperations.divide(a,b);
    }
}
