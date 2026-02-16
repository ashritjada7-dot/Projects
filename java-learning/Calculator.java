// ============================================================
// Calculator.java - A simple calculator
// ============================================================
// Asks for two numbers and an operator, then prints the result.
// New concepts: if/else, double (decimals), char (single character)
// ============================================================

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // --- Get the first number ---
        // We use 'double' instead of 'int' so decimals like 3.14 work.
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // --- Get the operator ---
        // 'charAt(0)' grabs the first character from the input string.
        // A 'char' holds a single character, written with single quotes: '+', '-'
        System.out.print("Enter an operator (+, -, *, /): ");
        String operatorInput = scanner.next(); // reads one word/token
        char operator = operatorInput.charAt(0);

        // --- Get the second number ---
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // --- Calculate the result ---
        double result;

        // 'if/else if/else' lets us run different code depending on a condition.
        // '==' compares values. For char, it checks if the character matches.
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            // Check for division by zero before dividing
            if (num2 == 0) {
                System.out.println("Error: cannot divide by zero.");
                scanner.close();
                return; // 'return' exits the main method, ending the program
            }
            result = num1 / num2;
        } else {
            System.out.println("Unknown operator: " + operator);
            scanner.close();
            return;
        }

        // --- Print the result ---
        // 'printf' gives formatted output. '%.2f' means show 2 decimal places.
        // '%c' prints a char, '%n' adds a newline.
        System.out.printf("%.2f %c %.2f = %.2f%n", num1, operator, num2, result);

        scanner.close();
    }
}
