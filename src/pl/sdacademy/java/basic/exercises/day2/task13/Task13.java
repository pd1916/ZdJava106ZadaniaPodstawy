package pl.sdacademy.java.basic.exercises.day2.task13;

import java.util.Arrays;

public class Task13 {

    public static void main(String[] args) {
        int[] inputs = {12, 7, 19};
//        for(int element : inputs){
//            System.out.print(element + " ");
//        }
        System.out.println("Input: " + Arrays.toString(inputs)); //  -> String tmp = "[12, 7, 19]";
        System.out.println("Min value: " + getMinValue(inputs));
        System.out.println("Max value: " + getMaxValue(inputs));
        System.out.println("Sum: " + sum(inputs));
//        int[] inputs2 = new int[3];
//        inputs2[0] = 12;
//        inputs2[1] = 7;
//        inputs2[2] = 19;
    }

    private static int getMinValue(int[] inputs) {
        int minValue = inputs[0];
//        for(int i = 1; i < inputs.length; i++) {
//            if(inputs[i] < minValue) {
//                minValue = inputs[i];
//            }
//        }
        for (int i : inputs) {
            if (i < minValue) {
                minValue = i;
            }
        }
        return minValue;
    }

    private static int getMaxValue(int[] inputs) {
        int maxValue = inputs[0];
        for (int i : inputs) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    private static int sum(int[] inputs) {
        int sum = 0;
        for (int element : inputs) {
            sum += element;
        }
        return sum;
    }
}
