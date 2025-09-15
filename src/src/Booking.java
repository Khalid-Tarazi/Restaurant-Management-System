import java.util.ArrayList;
import java.util.List;

public class Booking {
    private List<BookingObserver> observers;
    private int bookingId;
    private Customer customer;
    private Table table;
    private DateTime time;
    private String status;

    public Booking(int bookingId, Customer customer, Table table, DateTime time) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.table = table;
        this.time = time;
        this.observers = new ArrayList<>();
    }

    public Booking(List<BookingObserver> observers, int bookingId, Customer customer, Table table, DateTime time, String status) {
        this.observers = observers;
        this.bookingId = bookingId;
        this.customer = customer;
        this.table = table;
        this.time = time;
        this.status = status;
    }

    public Booking(int bookingId, String Name, int year, int month, int day, int hour, int minute) {

    }

    public void addObserver(BookingObserver observer) {
        if (observers == null) {
            observers = new ArrayList<>();
        }
        observers.add(observer);
    }

    public void removeObserver(BookingObserver observer) {
        if (observers != null) {
            observers.remove(observer);
        }
    }

    public void notifyObservers() {
        if (observers != null) {
            for (BookingObserver observer : observers) {
                observer.update(this);
            }
        }
    }

    public int getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Table getTable() {
        return table;
    }

    public DateTime getTime() {
        return time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public void makeBooking() {
        notifyObservers();
    }

    public void cancelBooking() {
        notifyObservers();
    }

    public List<BookingObserver> getObservers() {
        return observers;
    }

    public String getBookingDetails(Booking booking) {
        //
        return null;
    }
}