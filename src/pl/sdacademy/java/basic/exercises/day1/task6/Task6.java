package pl.sdacademy.java.basic.exercises.day1.task6;

public class Task6 {
    public static void main(String[] args) {
        printMultiplicationTable(6, 2, 5);
    }

    private static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand) {
        //for(;;)
//        for(; minMultiplicand <= maxMultiplicand; minMultiplicand++) {
//            int result = multiplier * minMultiplicand;
//            System.out.println(multiplier + " * " + minMultiplicand + " = " + result);
//        }

        while(minMultiplicand <= maxMultiplicand) {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " * " + minMultiplicand + " = " + result);
            minMultiplicand++;
        }
    }
}
