package pl.sdacademy.java.basic.exercises.day3.task8;

public class Poem {
    private Author creator;
    private int stropheNumbers;

    public Poem(Author creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public Author getCreator() {
        return creator;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Poem{" +
                "creator=" + creator +
                ", stropheNumbers=" + stropheNumbers +
                '}';
    }
}
