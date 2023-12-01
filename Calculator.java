package Assignment1;

import java.util.Scanner;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Select operation: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int choice = scanner.nextInt();

        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + calculator.add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + calculator.subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + calculator.multiply(num1, num2));
                break;
            case 4:
                try {
                    System.out.println("Result: " + calculator.divide(num1, num2));
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
