package pl.sdacademy.java.basic.exercises.day2.Task2;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(isWordStartsWithPrefix("programowanie", "pro"));
        System.out.println(isWordStartsWithPrefix(null, "pro"));
        System.out.println(isWordStartsWithPrefix("", "pro"));

        System.out.println();

        System.out.println(isWordEndWithSuffix("programowanie", "pro"));
        System.out.println(isWordEndWithSuffix("programowanie", "nie"));
    }

    private static boolean isWordStartsWithPrefix(String input, String prefix) {
        // logika ? akcja gdy true : akcja gdy false
        //String tmp = input != null ? "ok" : "error";
        return input != null ? input.startsWith(prefix) : false;
//        if(input != null) {
//            return ;
//        }
//        return false;
    }

    private static boolean isWordEndWithSuffix(String input, String suffix) {
        return input != null ? input.endsWith(suffix) : false;
    }
}
