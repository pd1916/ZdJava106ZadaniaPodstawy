package pl.sdacademy.java.basic.exercises.day2.task1;

public class Task1 {
    public static void main(String[] args) {
        String input = "ala";
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLastCharFromString(input));

        input = "domek";
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLastCharFromString(input));
    }

    private static char getLastCharFromString(String input) {
        int lastPosition = input.length() - 1;
        //return input.substring(lastPosition);
        return input.charAt(lastPosition);
    }
}
