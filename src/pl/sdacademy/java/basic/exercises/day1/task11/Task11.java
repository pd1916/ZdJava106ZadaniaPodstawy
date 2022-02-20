package pl.sdacademy.java.basic.exercises.day1.task11;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        tooMuchTooManyGame();
    }

    private static void tooMuchTooManyGame() {
        int randomValue = new Random().nextInt(101); // metody z klasy Random, pozwalają wygenerować losową liczbę z danego zakresu
        //int randomValue = new Random().nextInt((100 - 5) + 1) + 5; // gdybyśmy chcieli mieć liczby z zakresu 5-100
        Scanner scanner = new Scanner(System.in);
        boolean isEqual = false;
        do {
            System.out.print("Please insert digit: ");
            int chosen = scanner.nextInt();
            if (randomValue == chosen) {
                isEqual = true;
                System.out.println("Bingo!");
            } else if (randomValue > chosen) {
                System.out.println("Not enough");
            } else {
                System.out.println("Too much");
            }
        } while (!isEqual);
    }
}
