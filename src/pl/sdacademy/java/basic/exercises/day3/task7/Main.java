package pl.sdacademy.java.basic.exercises.day3.task7;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Burek");
        cats[1] = new Cat("Filemon");
        cats[2] = new Cat("Bonifacy");

        int i = 2;
        for(Cat cat : cats) {
            cat.makeSound();
            cat.eatMice(i++ * i); // 2 * 3 | 3 * 4 | 4 * 5
            cat.print();
            System.out.println();
        }

        Cat cat = new Cat("Burek");
        System.out.println(cat.getName());
        cat.setName("Mruczek");
        System.out.println(cat.getName());

    }
}
