package pl.sdacademy.java.basic.exercises.day3.task8;

public class Main {

    public static void main(String[] args) {
        Poem[] poems = new Poem[3];

        Author author1 = new Author("Tuwim", "PL");
        Author author2 = new Author("Konopnicka", "PL");
        Author author3 = new Author("Brzechwa", "PL");

        poems[0] = new Poem(author1, 20);
        poems[1] = new Poem(author2, 30);
        poems[2] = new Poem(author3, 25);

        String surname = getSurnameWithBiggestOfStropheNumbers(poems);
        System.out.println(surname);
    }

    private static String getSurnameWithBiggestOfStropheNumbers(Poem[] poems) {
        int maxStropheNumbers = 0;
        String surname = null;
        for(Poem poem : poems) {
            int currentStropheNumbers = poem.getStropheNumbers();
            if(currentStropheNumbers > maxStropheNumbers) {
                maxStropheNumbers = currentStropheNumbers;
                surname = poem.getCreator().getSurname();
            }
        }
        return surname;
    }
}
