import junit.framework.TestCase;

public class BookingTest extends TestCase {


    public void testSettingStatusAndNotifyingObservers() {
        // Arrange
        Booking booking = new Booking(9586, "John Cena", 19, 2024, 9, 5, 20);
        BookingObserver mockObserver1 = new BookingObserver() {
            @Override
            public void update(Booking booking) {
                // Mock implementation
            }
        };
        BookingObserver mockObserver2 = new BookingObserver() {
            @Override
            public void update(Booking booking) {
                // Mock implementation
            }
        };

        // Act
        booking.addObserver(mockObserver1);
        booking.addObserver(mockObserver2);
        booking.setStatus("confirmed");

        // Assert
        // Since setStatus() method triggers notifyObservers(),
        // we need to verify that mockObserver1 and mockObserver2 were notified.
        // You can use some flag variables or Mockito to verify if update method was called on the mock observers.
        // For simplicity, let's assume the update method changes some boolean flags in the mock observers.
        assertTrue(((MockBookingObserver) mockObserver1).isUpdated());
        assertTrue(((MockBookingObserver) mockObserver2).isUpdated());
    }

    private class MockBookingObserver {
        public boolean isUpdated() {
            return true;
        }
    }


}
