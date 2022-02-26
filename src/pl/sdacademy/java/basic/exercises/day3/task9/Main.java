package pl.sdacademy.java.basic.exercises.day3.task9;

public class Main {

    public static void main(String[] args) {
        OrderItem cukier = new OrderItem("Cukier", 5, 3);
        OrderItem mleko = new OrderItem("Mleko", 3, 20);

        Order order = new Order(5);
        order.addItem(cukier);
        order.addItem(mleko);
    }
}
