package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

public class Task2 {
    // PL[0-9]{26}
    // [PL] -> P lub L
    // PL -> P i L
    private static final String IBAN_REGEX = "[PL][0-9]{26}"; // [A-Z]{2} -> dokładnie dwa znaki z przedziału od A do Z

    public static void main(String[] args) {
        String iban = "PL10105000997603123456789122";
        System.out.println("If IBAN " + iban + " has correct format: " + isCorrectIbanFormat(iban));

        iban = "P10105000997603123456789122";
        System.out.println("If IBAN " + iban + " has correct format: " + isCorrectIbanFormat(iban));

        iban = "L10105000997603123456789122";
        System.out.println("If IBAN " + iban + " has correct format: " + isCorrectIbanFormat(iban));

        iban = "PL1010500099";
       System.out.println("If IBAN " + iban + " has correct format: " + isCorrectIbanFormat(iban));
    }

    private static boolean isCorrectIbanFormat(String iban) {
        //PL + 26 cyfr
        Pattern pattern = Pattern.compile(IBAN_REGEX);
        return pattern.matcher(iban).matches();
    }
}
