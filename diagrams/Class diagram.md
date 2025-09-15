Class diagram for RMS.

<img width="1189" height="909" alt="image" src="https://github.com/user-attachments/assets/23177b3f-58a5-4f9e-b877-bb572a8e4da4" />

---

###	Interfaces:
¤	The payment interface specifies methods processPayment() and generateReceipt() that any implementing class must define.

¤	Report interface specifies the method generateReport() that Manager and RMS class implements.

###	Classes:
¤	CreditCardPayment and CashPayment are concrete classes implementing the Payment interface. They both have attributes related to payment information and methods to process payments and generate receipts.

¤	RMS represents the Restaurant Management System class. It has attributes for tables, staff, and menu, along with methods for generating reports, taking bookings, and processing payments.

¤	Table, Order, MenuItem, Menu, Booking, and Customer represent various entities within the restaurant system with their respective attributes and methods.

¤	Staff, Waiter, Chef, and Manager represent different roles of staff members. Staff is a superclass, and the others are subclasses. Manager has additional methods for managing staff and reports.

###	Relationships:
¤	RMS has associations with Table, Staff, and Menu classes, indicating that it contains instances of these classes.

¤	Booking class has a composition relationship with Table and Customer, indicating that a booking is associated with a specific table and customer.

¤	Order class has associations with Table, MenuItem, and Payment, indicating that an order is associated with a table, menu items, and payments.

¤	Menu class has a composition relationship with MenuItem, indicating that a menu consists of menu items.

¤	Menu class has a composition relationship with RMS.

¤	Order and Payment are related, indicating that an order may have one or more associated payments.

¤	Staff class has associations with Waiter and Chef, indicating that a staff member can be either a waiter or a chef.

¤	Manager class has associations with Staff and Report, indicating that a manager can manage staff and reports.
