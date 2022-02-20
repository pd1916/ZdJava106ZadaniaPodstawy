package pl.sdacademy.java.basic.exercises.day1.task10;

public class Task10 {

    public static void main(String[] args) {
        int number = 123;
        int result = sumOfDigits(number);
        System.out.println("Sum: " + result);
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        //123
        while(number != 0) { // number = 123, number = 12
            sum += number % 10; // sum = 0 + 3 , number % 10 => 123 % 10 = 3
            number/= 10; // number / 10 => 123 / 10 = 12
        }
        return sum;
    }
}
