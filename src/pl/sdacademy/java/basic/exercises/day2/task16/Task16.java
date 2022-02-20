package pl.sdacademy.java.basic.exercises.day2.task16;

import java.util.Arrays;

public class Task16 {

    public static void main(String[] args) {
        int[] ints = new int[]{12, 7, 19, 20, 33};
        System.out.println("Input: " + Arrays.toString(ints));
        int[] reversedArray = reverseArray(ints);
        System.out.println("Result: " + Arrays.toString(reversedArray));
    }

    private static int[] reverseArray(int[] input) {
        /*int tmp = input[0];
        input[0] = input[2];
        input[2] = tmp;*/

        // jeżeli chcemy odwrócić array'a to nie musimy iterować po całej tablicy
        // warto zauważyć że wystarczy nam dojście tylko do połowy
        // i podczas jednej iteracji ustawiać/zamieniać dwie wartości: pierwszą i ostanią, pierwsza+1 i ostanią-1 itd
        for (int i = 0; i < input.length / 2; i++) {
            int nextPositionElement = (input.length - 1) - i;
            int tmp = input[i];
            input[i] = input[nextPositionElement];
            input[nextPositionElement] = tmp;
        }
        return input;
    }
}