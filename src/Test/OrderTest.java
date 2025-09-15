import junit.framework.TestCase;
import java.util.ArrayList;

public class OrderTest extends TestCase {

    public void testAddAndRemoveItems() {

        Table table = new Table(1,4);
        Order order = new Order(1, table);
        MenuItem item1 = new MenuItem(5,"Burger",15,2);
        MenuItem item2 = new MenuItem(11, "Pizzq", 30,1);

        order.addItem(item1);
        order.addItem(item2);

        assertEquals(2, order.getItems().size());

        order.removeItem(item1);

        assertEquals(1, order.getItems().size());
        assertFalse(order.getItems().contains(item1));
    }
}
