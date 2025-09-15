import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private String phoneNumber;
    private List<Booking> bookings;

    public Customer(int customerId, String name, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.bookings = new ArrayList<>();
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void Book(Table table, DateTime time) {
        Booking booking = new Booking(bookings.size() + 1, this, table, time);
        this.bookings.add(booking);
        booking.makeBooking();
    }
}