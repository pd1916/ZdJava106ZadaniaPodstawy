package pl.sdacademy.java.basic.exercises.day2.task14;

import java.util.Arrays;

public class Task14 {

    public static void main(String[] args) {
        int[] inputs = {12, -7, 19, -5, -9};
        System.out.println("Inputs: " + Arrays.toString(inputs));
        int lengthOfNewArray = countNegativeValuesInArray(inputs);
        if(lengthOfNewArray > 0) {
            int[] newArray = createNewArray(inputs, lengthOfNewArray);
            System.out.println("Result: " + Arrays.toString(newArray));
        }
    }

    private static int countNegativeValuesInArray(int[] inputs) {
        int counter = 0;
        for(int element : inputs) {
            if(element < 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int[] createNewArray(int[] inputs, int lengthOfNewArray) {
        int[] newArray = new int[lengthOfNewArray];
        //{12, -7, 19, -5, -9}
        // i=4, counter=3
        // newArray[0] = -7;
        // newArray[1] = -5
        // newArray[2] = -9

//        for(int i = 0, j = 0; i < inputs.length; i++) {
//            if(inputs[i] < 0) {
//               newArray[j++] = inputs[i];
//            }
//        }
        int i = 0;
        for(int element : inputs) {
            if(element < 0) {
                newArray[i++] = element;
            }
        }
        return newArray;
    }
}
