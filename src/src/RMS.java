import java.util.ArrayList;

public class RMS {
    private ArrayList<Table> tables;
    private ArrayList<Staff> staff;
    private Menu menu;
    private static RMS instance;

    private RMS() {
        this.tables = new ArrayList<>();
        this.staff = new ArrayList<>();
        this.menu = new Menu();
    }

    public static RMS getInstance() {
        if (instance == null) {
            instance = new RMS();
        }
        return instance;
    }

    public void addTable(Table table) {
        this.tables.add(table);
    }

    public void addStaff(Staff staff) {
        this.staff.add(staff);
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void generateReport() {
        System.out.println("Generating report...");
    }

    public void takeBooking() {
        System.out.println("Taking booking...");
    }

    public Payment processPayment(int orderId) {
        //
        return null;
    }

    public boolean isTableAvailable(int tableNumber) {
        for (Table table : tables) {
            if (table.getTableNumber() == tableNumber && table.isAvailable()) {
                return true;
            }
        }
        return false;
    }

    public void seatCustomer(int tableNumber, Customer customer) {
        for (Table table : tables) {
            if (table.getTableNumber() == tableNumber && table.isAvailable()) {
                table.setCustomer(customer);
                table.setAvailable(false);
                System.out.println("Customer seated at table " + tableNumber);
                return; // Exit after seating the customer
            }
        }
        System.out.println("Table " + tableNumber + " is not available.");
    }
}