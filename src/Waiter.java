import java.util.ArrayList;
import java.util.List;

public class Waiter extends Staff {
    private List<Table> tablesServed;

    public Waiter(int staffId, String name, String role) {
        super(staffId, name, role);
    }

    public Waiter() {
        super();
        this.tablesServed = new ArrayList<>();
    }

    public void takeOrder(Order order) {
        //
    }

    public void serveOrder(Order order) {
        //
    }

    public void addTable(Table table) {
        this.tablesServed.add(table);
    }

    public void removeTable(Table table) {
        this.tablesServed.remove(table);
    }

    public List<Table> getTablesServed() {
        return this.tablesServed;
    }

    @Override
    public void performDuties() {

    }
}