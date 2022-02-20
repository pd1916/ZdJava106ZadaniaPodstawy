package pl.sdacademy.java.basic.exercises.day1.task13;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit;
        int totalNumber = 0;
        int totalNumberEven = 0;
        int totalSum = 0;
        float arithmeticAverage;

        do {
            System.out.print("Please insert digit: ");
            digit = scanner.nextInt();
            scanner.nextLine();
            totalNumber++;
            if (digit % 2 == 0) {
                totalNumberEven++;
            }
            totalSum += digit;
        } while (digit != 0);

        System.out.println("Total Number Of Digits: " + --totalNumber);
        System.out.println("Total Number Of Even Digits: " + --totalNumberEven);
        arithmeticAverage = (float) totalSum / totalNumber;
        System.out.println("Arithmetic Average: " + arithmeticAverage);
    }
}
