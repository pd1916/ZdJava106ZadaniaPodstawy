package pl.sdacademy.java.basic.exercises.day1.task7;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String decision;
        do {
            System.out.print("Please insert first digit: ");
            float firstDigit = scanner.nextFloat();
            scanner.nextLine();

            System.out.print("Please insert operator (+ - / *): ");
            String operator = scanner.nextLine();
            System.out.print("Please insert second digit: ");
            float secondDigit = scanner.nextFloat();
            scanner.nextLine();

            float result = calculate(firstDigit, secondDigit, operator);
            System.out.println("Result: " + firstDigit + operator + secondDigit + " = " + result);
            // pytamy usera czy chce kontynuować
            // pobieramy odpowiedz od usera
            System.out.print("New calculation or Stop? ");
            decision = scanner.nextLine();
        } while (!"Stop".equalsIgnoreCase(decision));
    }

    private static float calculate(float a, float b, String operator) {
        float result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                // lepsze: użycie bloku try-catch
                if (b == 0) {
                    System.out.println("Wrong operation");
                    System.exit(1);
                }
                result = a / b;
                break;
            default:
                System.out.println("Operator not exist");
                System.exit(1);
        }
        return result;
    }
}
