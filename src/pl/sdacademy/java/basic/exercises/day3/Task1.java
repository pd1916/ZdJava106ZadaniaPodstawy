package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    private static final String EMAIL_REGEX = "[a-zA-Z0-9_.-]+\\@[a-zA-Z]+(\\.[a-zA-Z]+)?";
    //private static final String EMAIL_REGEX = "[a-zA-Z0-9_.-]+\\@[a-zA-Z0-9]+[.]?[a-zA-Z0-9]+";

    public static void main(String[] args) {
        String emailAddress = "aaa@com";
        System.out.println("If email address " + emailAddress + " has correct format: " + isCorrectEmailFormat(emailAddress));
    }

    private static boolean isCorrectEmailFormat(String emailAddress) {
        // a Z 9 _ . - @ a Z .(opcjonalne) a Z
        // sda@com sda-_.1@com.pl
        // sda | sda@ | sda@com. | .sda@com.pl | @com.pl
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
//        Matcher matcher = pattern.matcher(emailAddress);
//        return matcher.matches();
        return pattern.matcher(emailAddress).matches();
    }
}

// a? -> zero lub jedno a
// a* -> zero lub więcej a
// a+ -> 1 lub więcej a

