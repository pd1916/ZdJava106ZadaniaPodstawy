package pl.sdacademy.java.basic.exercises.day3.task9;

public class OrderItem {
    private String productName;
    private int quantity;
    private double price; //BigDecimal

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getAmount() {
        return Math.round(quantity * price * 100.0) / 100.0; // zaookrąglenie do 2 miejsc po przecinku
        //return Math.round(quantity * price);
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isCorrect() {
        return quantity > 0 && price > 0;
    }

    //Cukier | 4 00 zł | 3 pcs | 12 00 zł
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append(productName).append("\t| ");
        sb.append(price).append(" zl ").append("\t| ");
        sb.append(quantity).append(" pcs ").append("\t| ");
        sb.append(getAmount()).append( " zl");
        System.out.println(sb);
    }
}
