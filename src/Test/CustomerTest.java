import junit.framework.TestCase;
import org.junit.Test;
import java.util.List;

public class CustomerTest extends TestCase {
    @Test
    public void testBookTable() {

        Customer customer = new Customer(1, "Khalid Tarazi", "49583762111");
        Table table = new Table(1, 4);
        DateTime time = new DateTime(2024,5,1,7,30);

        int initialBookingsCount = customer.getBookings().size();

        customer.Book(table, time);

        List<Booking> bookings = customer.getBookings();
        assertEquals(initialBookingsCount + 1, bookings.size());
        Booking lastBooking = bookings.get(bookings.size() - 1);
        assertNotNull(lastBooking);
    }
}