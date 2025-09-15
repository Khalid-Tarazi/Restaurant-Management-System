import junit.framework.TestCase;
class TestStaff extends Staff {
    @Override
    public void performDuties() {
        System.out.println("Performing duties...");
    }
}

public class StaffTest extends TestCase {

    public void testPerformDuties_AbstractMethod() {

        TestStaff testStaff = new TestStaff();

        testStaff.performDuties();
    }
}