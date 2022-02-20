package pl.sdacademy.java.basic.exercises.day2.task15;

import java.util.Arrays;

public class Task15 {

    public static void main(String[] args) {
        String[] firstArray = {"Ala", "ma", "kota"};
        String[] secondArrayArray = {"Ala", "maa", "kota"};
        System.out.println("First array: " + Arrays.toString(firstArray));
        System.out.println("Second array: " + Arrays.toString(secondArrayArray));
        System.out.println("Result: " + areEqual(firstArray, secondArrayArray));
    }

    private static boolean areEqual(String[] firstArray, String[] secondArrayArray) {
        if (firstArray.length != secondArrayArray.length) {
            return false;
        }
        for (int i = 0; i < firstArray.length; i++) {
            if (!firstArray[i].equals(secondArrayArray[i])) {
                return false; // pierwsza różnica, od razu kończymy pętle i metoda zwraca false
            }
        }
        return true;
    }
}
