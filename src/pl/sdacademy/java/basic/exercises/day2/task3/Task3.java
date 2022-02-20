package pl.sdacademy.java.basic.exercises.day2.task3;

public class Task3 {

    public static void main(String[] args) {
        String input = "Ala ma kota";

        String word = "ma";
        System.out.println("Input: " + input);
        System.out.println("Word: " + word);
        System.out.println("Result: " + getIndex(input, word));

        System.out.println();

        word = "";
        System.out.println("Input: " + input);
        System.out.println("Word: " + word);
        System.out.println("Result: " + getIndex(input, word));
    }

    private static int getIndex(String input, String word) {
        //if(input != null && word != null && !input.isBlank() && !word.isBlank()) {
        if (isValid(input) && isValid(word)) {
            return input.contains(word) ? input.indexOf(word) : -1;
        }
        return -1;
    }

    private static boolean isValid(String text) {
        return text != null && !text.isBlank();
    }
}
