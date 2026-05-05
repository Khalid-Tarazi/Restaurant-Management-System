public class Table {
    private int tableNumber;
    private int capacity;
    private boolean isAvailable;
    private Customer customer;

    public Table(int tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isAvailable = true;
        this.customer = null;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setCustomer(Customer customer) {
        if (isAvailable) {
            isAvailable = false;
            this.customer = customer;
        } else {
            System.out.println("This table is not available.");
        }
    }

    public void clearTable() {
        isAvailable = true;
        customer = null;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public Customer getCustomer() {
        return customer;
    }
}