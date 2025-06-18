import java.util.ArrayList;
import java.util.List;

public class Order {
    private double totalPrice;
    private double shippingPrice = 10;
    private List<OrderObserver> observers = new ArrayList<>();
    private List<String> items = new ArrayList<>();

}
