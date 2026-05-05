import junit.framework.TestCase;
import java.util.List;

public class ManagerTest extends TestCase {

    public void testManageStaff() {

        Manager manager = new Manager(1, "Khalid Tarazi");
        Staff[] staffArray = new Staff[2];
        staffArray[0] = new Staff(101, "Alice", "Waiter") {
            @Override
            public void performDuties() {
                System.out.println(" Serving table 4");
            }
        };
        staffArray[1] = new Staff(102, "Bob", "Chef") {
            @Override
            public void performDuties() {
                System.out.println(" Making sushi roll.");
            }
        };

        manager.manageStaff(staffArray);

        List<Staff> staffList = manager.getStaffList();
        assertEquals(2, staffList.size());
        assertTrue(staffList.contains(staffArray[0]));
        assertTrue(staffList.contains(staffArray[1]));
    }

    public void testGenerateReport() {

        Manager manager = new Manager(1, "Khalid Tarazi");
        manager.generateReport();
    }
}
