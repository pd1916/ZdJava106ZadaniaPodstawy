package pl.sdacademy.java.basic.exercises.day3.task9;

public class Order {
    private int maxOrderItem;
    private OrderItem[] orderItems;
    private int currentOrderItems; // lub private int currentOrderItems = 0 i wtedy nie musimy ustawiać 0 w konstruktorze

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

    public double getTotalAmount() {
        double totalAmount = 0;
        for (OrderItem orderItem : orderItems) {
            if(orderItem != null) {
                totalAmount += orderItem.getAmount();
            }
        }
        return totalAmount;
    }

    public int getItemsCount() {
        int total = 0;
        for(OrderItem orderItem : orderItems) {
            if(orderItem != null) {
                total += orderItem.getQuantity();
            }
        }
        return total;
    }

    public void print() {
        for (OrderItem orderItem : orderItems) {
            if(orderItem != null) {
                orderItem.print();
            }
        }
        System.out.println("Total amount: " + getTotalAmount());
        System.out.println("Count: " + getItemsCount());
    }

}
