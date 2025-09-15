Modified Class diagram for RMS

<img width="1213" height="1116" alt="image" src="https://github.com/user-attachments/assets/73adcd16-1641-4652-8bba-385ad817bed4" />

---

Here are the changes I made to enhance the design of the Restaurant Management System:

**1.	Singleton pattern for the RMS Class:**

¤	Added a static instance attribute to the RMS class to hold the single instance of RMS.

¤	Made the constructor private to prevent external instantiation.

¤	Added a getInstance() method to allow access to the single instance of RMS.

**2.	Observer pattern for the Manager Class:**

¤	Implemented the BookingObserver interface in the Manager class to act as an observer.

¤	Added an update(booking: Booking) method to comply with the Observer pattern. This method will be called by Booking objects when a new booking is made.

¤	Added addObserver() and removeObserver() and notifyObservers() in Booking  class.

**Other changes made:**

¤	Added book() method for the Customer class.

¤	Added isTableAvailable() to RMS class.

¤	Added seatCustomer() to RMS class.

¤	Added addMenuItem() to Menu class.

¤	Added removeMenuItem() to Menu class.

¤	Added to CreditCardPayment class these new methods:


-isValidNumber()

-isValidExpiryDate()

-isValidCvv()

-getCardBalance()

-setCardBalance()
