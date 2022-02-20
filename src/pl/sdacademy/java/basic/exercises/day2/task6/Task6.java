package pl.sdacademy.java.basic.exercises.day2.task6;

public class Task6 {
    public static void main(String[] args) {
        String input = "Ala ma kota.";
        char character = 'a';
        System.out.println(indexOfChar(input, character));
    }

    //by Przemek, Andrzej
    private static int indexOfChar (String sentence, char character) {
        if(sentence != null && !sentence.isBlank()) {
            int foundIndex = sentence.indexOf(character);
            return foundIndex;
        }
        return -1;
    }

    private static int indexOfChar2 (String sentence, char character) {
        if(sentence != null && !sentence.isBlank()) {
            for(int i = 0; i < sentence.length(); i++) {
                if(sentence.charAt(i) == character) {
                    return i;
                }
            }
        }
        return -1;
    }
}
