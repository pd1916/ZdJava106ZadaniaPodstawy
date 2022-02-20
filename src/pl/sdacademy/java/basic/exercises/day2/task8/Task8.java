package pl.sdacademy.java.basic.exercises.day2.task8;

public class Task8 {
    private static final int DIFF_UPPER_AND_LOWER_IN_ASCII = 32;
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    private static final int VALUE_UPPER_A_IN_ASCII = 65;
    private static final int VALUE_UPPER_Z_IN_ASCII = 90;

    public static void main(String[] args) {
        String input = "Ala Kot";
        System.out.println("Input: " + input);
        System.out.println("Result: " + replaceChars(input));
    }

    private static String replaceChars(String input) {
        //String result = "";
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(currentChar >= VALUE_UPPER_A_IN_ASCII && currentChar <= VALUE_UPPER_Z_IN_ASCII) {
                result.append((char)(currentChar + DIFF_UPPER_AND_LOWER_IN_ASCII));
                //result += (char)(currentChar + DIFF_UPPER_AND_LOWER);
            } else if(currentChar >= VALUE_LOWER_A_IN_ASCII && currentChar <= VALUE_LOWER_Z_IN_ASCII) {
                result.append((char)(currentChar - DIFF_UPPER_AND_LOWER_IN_ASCII));
                //result += (char)(currentChar - DIFF_UPPER_AND_LOWER);
            } else {
                result.append((currentChar));
                //result += (char)currentChar;
            }
        }
        return result.toString();
    }

    // by Andrzej
    private static String changeSize(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == text.toUpperCase().charAt(i)){
                newText += text.toLowerCase().charAt(i);
            } else {
                newText += text.toUpperCase().charAt(i);
            }
        }
        return newText;
    }

}
