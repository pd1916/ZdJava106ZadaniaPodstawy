package pl.sdacademy.java.basic.exercises.day2.task11;

public class Task11 {

    public static void main(String[] args) {
        String input = "kajak";
        System.out.println("Input: " + input);
        System.out.println("Result: " + ifPalindrome(input));

        System.out.println();

        input = "sda";
        System.out.println("Input: " + input);
        System.out.println("Result: " + ifPalindrome(input));
    }

    private static boolean ifPalindrome(String input) {
        if(input != null) {
            String afterReverse = new StringBuilder(input).reverse().toString();
            return input.equals(afterReverse);
        }
        return false;
    }
}
