package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

public class Task3 {
    //private static final String NUMBER_REGEX = "-?[0-9]+(,[0-9]+)?";
    private static final String NUMBER_REGEX = "-?\\d+(,\\d+)?";

    public static void main(String[] args) {
        String number = "12341234";
        System.out.println("If digit " + number + " has correct format: " + isCorrectNumber(number));

        number = "1234,1234";
        System.out.println("If digit " + number + " has correct format: " + isCorrectNumber(number));

        number = "-12341234";
        System.out.println("If digit " + number + " has correct format: " + isCorrectNumber(number));

        number = "1234a1234";
        System.out.println("If digit " + number + " has correct format: " + isCorrectNumber(number));

        number = "1234,";
        System.out.println("If digit " + number + " has correct format: " + isCorrectNumber(number));

        number = ",1234";
        System.out.println("If digit " + number + " has correct format: " + isCorrectNumber(number));

        number = "1234 1234";
        System.out.println("If digit " + number + " has correct format: " + isCorrectNumber(number));
    }

    private static boolean isCorrectNumber(String number) {
        // true -> 1234 | 1234,1234 | 0,1234 | -1234
        // false -> 1234, | ,1234 | 1234a1234 | 1234 1234 |
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        return pattern.matcher(number).matches();
    }
}
