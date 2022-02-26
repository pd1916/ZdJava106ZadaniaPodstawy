package pl.sdacademy.java.basic.exercises.day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task6 {
    private static final String INPUT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(INPUT_DATE_FORMAT);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert date in format [" + INPUT_DATE_FORMAT + "]");
        String inputDate = scanner.nextLine();

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(INPUT_DATE_FORMAT);
//        LocalDateTime nextLesson = LocalDateTime.parse(inputDate, formatter);
        LocalDateTime nextLesson = LocalDateTime.parse(inputDate, DATE_TIME_FORMATTER);

        LocalDateTime now = LocalDateTime.now();

        long daysToNextLesson = Duration.between(now, nextLesson).toDays();
        System.out.println("You have " + daysToNextLesson + " days to the next lesson");
    }
}
