import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrderTest {

    @Test
    public void when_2_items_are_added_order_total_should_be_the_sum_of_those_2_item_prices() {

      Order order = new Order();


      order.addItemsToOrder("maggi", 30);
      order.addItemsToOrder("Tea", 20);
      assertEquals(order.calculateOrderTotal(), 50);



    }
    @Test
    public void when_0_items_are_added_expected_order_value_should_be_zero() {

        Order order = new Order();
        assertEquals(order.calculateOrderTotal(), 0);
    }

}
