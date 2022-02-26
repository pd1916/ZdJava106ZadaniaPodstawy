package pl.sdacademy.java.basic.exercises;

public class TaskBySda {

    public static void main(String[] args) {
        String numberToReduce = "277777788888899";
        int reducedValue = reduce(numberToReduce);
        System.out.println("Number to reduce: " + numberToReduce);
        System.out.println("After reduce: " + reducedValue);

        numberToReduce = "123";
        reducedValue = reduce(numberToReduce);
        System.out.println("Number to reduce: " + numberToReduce);
        System.out.println("After reduce: " + reducedValue);
    }

    public static int reduce(String number) {
        String[] split = number.split(""); // 'rozbicie' stringa na pojedyńcze znaki i pzypisanie do tablicy
        int sum = 1;
        do {
            for (String element : split) {
                int i = Integer.parseInt(element); // parsowanie stringa na int'a
                if (i == 0) { // jeżeli pojawi się zero -> przerwij pętle i zwróć 0 -> każda liczba * 0 i tak na dam zero
                    return 0;
                }
                sum *= i;
            }
        } while(sum > 9); // kończymy ponieważ zgodnie z zadaniem mamy to zrobić gdy wynik jest jednocyfrowy
        return sum;
    }


}
