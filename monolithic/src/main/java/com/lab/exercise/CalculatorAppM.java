package com.lab.exercise;

import java.util.Scanner;

public class CalculatorAppM {

    private static ArithmeticService arithmeticService = new ArithmeticService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the modified Monolithic Arithmetic Calculator");

        while (true) {
            System.out.print("Enter the operation (add, subtract, multiply, divide) or 'exit' to quit: ");
            String operation = scanner.next();

            if (operation.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();

            try {
                int result = performOperation(a, b, operation);
                System.out.println("Result: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static int performOperation(int a, int b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return arithmeticService.add(a, b);
            case "subtract":
                return arithmeticService.subtract(a, b);
            case "multiply":
                return arithmeticService.multiply(a, b);
            case "divide":
                if (b == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                return arithmeticService.divide(a, b);
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}
