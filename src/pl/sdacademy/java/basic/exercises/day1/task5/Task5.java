package pl.sdacademy.java.basic.exercises.day1.task5;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first digit:");
        int firstDigit = scanner.nextInt();

        System.out.print("Please insert second digit:");
        int secondDigit = scanner.nextInt();

        int sumOfSequence = sumOfSequence(firstDigit, secondDigit);
        System.out.println("Sum: " + sumOfSequence);
    }

    private static int sumOfSequence(int firstDigit, int secondDigit) {
        if(firstDigit > secondDigit) {
            //return -1;
            // zamiana miejscami
            int tmp = firstDigit;
            firstDigit = secondDigit;
            secondDigit = tmp;
        }
        int sum = 0;
//        while(firstDigit <= secondDigit) {
//            sum += firstDigit; // sum = sum + firstDigit
//            firstDigit++;
//        }
        do {
            sum += firstDigit; // sum = sum + firstDigit
            firstDigit++;
        } while(firstDigit <= secondDigit);
        return sum;
    }

}
