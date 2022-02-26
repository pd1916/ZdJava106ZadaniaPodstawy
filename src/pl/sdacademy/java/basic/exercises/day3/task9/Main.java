package pl.sdacademy.java.basic.exercises.day3.task9;

public class Main {

    public static void main(String[] args) {
        OrderItem cukier = new OrderItem("Cukier", 1, 3.50);
        OrderItem maka = new OrderItem("Mąka", 2, 4.00);
        OrderItem chleb = new OrderItem("Chleb", 3, 4.00);
        OrderItem jaja = new OrderItem("Jaja", 4, 4.00);
        OrderItem mleko = new OrderItem("Mleko", 5, 4.00);
        OrderItem wrong_mleko = new OrderItem("Mleko", -5, -4.00);

        Order order = new Order(5);
        // order.addItem(wrong_mleko); // komunikat o błędnym obiekcie
        order.addItem(cukier);
        order.addItem(maka);
        order.addItem(chleb);
        order.addItem(jaja);
        order.addItem(mleko);
        //order.addItem(mleko); // odkomentowanie spowodouje komunikat o braku wolnego miejsca w koszyku
        order.print();
    }
}
