import java.util.ArrayList;

public class Order {
    private int orderId;
    private Table table;
    private ArrayList<MenuItem> items;
    private String status;

    public Order(int orderId, Table table) {
        this.orderId = orderId;
        this.table = table;
        this.items = new ArrayList<>();
        this.status = "pending";
    }

    public int getOrderId() {
        return orderId;
    }

    public Table getTable() {
        return table;
    }

    public String getStatus() {
        return status;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem(MenuItem item) {
        this.items.add(item);
    }

    public void removeItem(MenuItem item) {
        this.items.remove(item);
    }

    public void placeOrder() {
        // Change order status to "placed"
        this.status = "placed";
    }
}