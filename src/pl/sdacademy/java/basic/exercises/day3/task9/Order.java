package pl.sdacademy.java.basic.exercises.day3.task9;

public class Order {
    private int maxOrderItem;
    private OrderItem[] orderItems;
    private int currentOrderItems; // = 0

    public Order(int maxOrderItem) {
        this.currentOrderItems = 0;
        this.maxOrderItem = maxOrderItem;
        this.orderItems = new OrderItem[maxOrderItem];
    }

    public boolean addItem(OrderItem orderItem) {
        if(!orderItem.isCorrect()) {
            System.out.println("Item is incorrect");
            return false;
        }
        if(currentOrderItems >= maxOrderItem) {
            System.out.println("Order is full");
            return false;
        }
        orderItems[currentOrderItems] = orderItem;
        currentOrderItems++;
        return true;
    }

    //getTotalAmount
    //for each po tablicy
    // sum += getPrice

    //getItemsCount
    //for each po tablicy
    // count += getQuantity

}
