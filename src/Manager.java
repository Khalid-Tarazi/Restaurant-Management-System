import java.util.ArrayList;
import java.util.List;

public class Manager extends Staff implements Report, BookingObserver {
    private List<Staff> staffList;

    public Manager(int staffId, String name) {
        super(staffId, name, "Manager");
        this.staffList = new ArrayList<>();
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is managing staff.");
    }

    @Override
    public void generateReport() {
        System.out.println(getName() + " is generating a report.");
    }

    @Override
    public void update(Booking booking) {
        System.out.println(getName() + " has been notified of a booking update.");
    }

    public void manageStaff(Staff[] staff) {
        for (Staff s : staff) {
            staffList.add(s);
        }
        System.out.println(getName() + " has managed " + staffList.size() + " staff members.");
    }

    public List<Staff> getStaffList() {
        return staffList;
    }
}