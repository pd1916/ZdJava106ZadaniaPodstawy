package pl.sdacademy.java.basic.exercises;

public class TaskBySda {

/*
Napisz program, który dla podanej liczby (jako String) mnoży jej cyfry tak długo, aż wynik będzie jednocyfrowy. Np.
    Przykład dla "123".
            123
            123 → 1x2x3 = 6
    Przykład dla "277777788888899".
            277777788888899
            277777788888899 → 2x7x7x7x7x7x7x8x8x8x8x8x8x9x9 = 4996238671872
            4996238671872 → 4x9x9x6x2x3x8x6x7x1x8x7x2 = 438939648
            438939648 → 4x3x8x9x3x9x6x4x8 = 4478976
            4478976 → 4x4x7x8x9x7x6 = 338688
            338688 → 3x3x8x6x8x8 = 27648
            27648 → 2x7x6x4x8 = 2688
            2688 → 2x6x8x8 = 768
            768 → 7x6x8 = 336
            336 → 3x3x6 = 54
            54 → 5x4 = 20
            20 → 2x0 = 0
*/
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
