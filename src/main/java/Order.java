import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Item> itemsOrder = new ArrayList<>();

    public Item addItemsToOrder(String itemName, int itemPrice) {

        Item item = new Item(itemName, itemPrice);
        itemsOrder.add(item);

        return item;
    }


    public int calculateOrderTotal() {

        int orderTotal = 0;

        for (int i = 0; i < itemsOrder.size(); i++) {
            orderTotal = orderTotal + itemsOrder.get(i).getItemPrice();

        }

        return orderTotal;
    }
}




