package pl.sdacademy.java.basic.exercises.day1.task7;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String decision;
        do {
            System.out.println("Calculating...");
            // poibieramy dwie liczby i operator od usera
            //fun()
            
            // pytamy usera czy chce kontynuować
            // pobieramy odpowiedz od usera
            System.out.print("New calculation or 'Stop' ");
            decision = scanner.nextLine();
        } while(!("Stop".equalsIgnoreCase(decision)));
    }

    private static void fun(float firstDigit, float secondDigit, String operator) {
        switch (operator) {
            case "+":
                // logika
                break;
            case "-":
                // logika
                break;
            case "*":
                // logika
                break;
            case "/":
                // logika
                break;
            default:
                System.out.println("Wrong Operator");
        }
    }
}
