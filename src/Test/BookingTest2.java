import junit.framework.TestCase;
import java.util.List;

public class BookingTest2 extends TestCase {

    public void testAddingAndRemovingObservers() {

        Booking booking = new Booking(9586,"John Cena",19,2024,9,5,20);
        BookingObserver mockObserver1 = new MockBookingObserver();
        BookingObserver mockObserver2 = new MockBookingObserver();

        booking.addObserver(mockObserver1);
        booking.addObserver(mockObserver2);
        booking.removeObserver(mockObserver1);

        List<BookingObserver> observers = booking.getObservers();
        assertEquals(1, observers.size());
        assertFalse(observers.contains(mockObserver1));
        assertTrue(observers.contains(mockObserver2));
    }
    private class MockBookingObserver implements BookingObserver {
        @Override
        public void update(Booking booking) {
        }
    }
}
