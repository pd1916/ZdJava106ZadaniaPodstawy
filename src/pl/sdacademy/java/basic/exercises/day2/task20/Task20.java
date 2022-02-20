package pl.sdacademy.java.basic.exercises.day2.task20;

import java.util.Arrays;

public class Task20 {

    public static void main(String[] args) {
        int[] arithmeticProgression = generateArithmeticProgression(5, 3, 3);
        System.out.println("Input: " + Arrays.toString(arithmeticProgression));
        System.out.println("Result: " + ifArithmeticProgressionIsCorrect(arithmeticProgression));
    }

    // 5, 1, 1 => 1, 2, 3, 4, 5
    // 5, 3, 3 => 3, 6, 9, 12, 15
    private static int[] generateArithmeticProgression(int length, int firstElement, int odds) {
        int[] result = new int[length];
        result[0] = firstElement;
        for (int i = 1; i < length; i++) {
            result[i] = result[i - 1] + odds;
        }
        return result;
    }

    private static boolean ifArithmeticProgressionIsCorrect(int[] array) {
        //#1 Option
        int tmpOdds = array[1] - array[0];
        for (int j = 2; j < array.length; j++) {
            if (array[j] - array[j - 1] != tmpOdds) {
                return false;
            }
        }
        return true;

        //#2 Option
        /*for (int j = 1; j < array.length-1; j++) {
            if ((array[j-1] + array[j+1])/2 != array[j]) {
                return false;
            }
        }
        return true;*/
    }
}