package pl.sdacademy.java.basic.exercises.day1.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    private static final float BMI_MIN_RANGE = 18.5f;
    private static final float BMI_MAX_RANGE = 24.9f;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float weight = getWeightFromUser();
        int height = getHeightFromUser();
        float bmi = calculateBMI(weight, height);
        displayBmiResult(bmi);
    }

    private static int getHeightFromUser() {
        System.out.print("Please insert height in cm: ");
        int height = 0;
        try {
            height = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Please insert only integer digits!");
            System.exit(1);
        }
        return height;
    }

    private static float getWeightFromUser() {
        System.out.print("Please insert weight in kg: ");
        float weight = 0;
        try {
            weight = scanner.nextFloat();
        } catch (InputMismatchException ex) {
            System.out.println("Please insert only digits!");
            System.exit(1);
        }
        return weight;
    }

    private static float calculateBMI(float weight, int height) {
        //float heightInMeter = (float)height / 100;
        float heightInMeter = height / 100f;
        return weight / (heightInMeter * heightInMeter);
    }

    private static void displayBmiResult(float bmi) {
        if (bmi < BMI_MIN_RANGE || bmi > BMI_MAX_RANGE) {
            System.out.println("BMI is incorrect: " + bmi);
        } else {
            System.out.println("BMI is correct: " + bmi);
        }
    }
}
