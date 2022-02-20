package pl.sdacademy.java.basic.exercises.extras;

public class Task1 {
    public static void main(String[] args) {
        String input = "Ala ma kota, a kot ma myszkę.";
        System.out.println("Input: " + input);
        System.out.println("Output: " + shortenSms(input));
    }

    private static String shortenSms(String input) {
        String[] words = input.split(" ");
        StringBuilder shortenSms = new StringBuilder();
        for (String word : words) {
            String firstLetter = word.substring(0, 1);
            String remainingLetters = word.substring(1);
            shortenSms
                    .append(firstLetter.toUpperCase())
                    .append(remainingLetters);
        }
        return shortenSms.toString();
    }
}
