import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private int id_counter = 1;
    private double totalPrice;
    private double shippingPrice = 10;
    private List<OrderObserver> observers = new ArrayList<>();
    private List<String> items = new ArrayList<>();

    public Order(){
        id = id_counter;
        id_counter++;
    }

    public void attach(OrderObserver o){
        observers.add(o);
    }

    public void detach(OrderObserver o){
        observers.remove(o);
    }

    public void addItem(String item, double price){
        items.add(item);
        totalPrice += price;
        notifyObserver();
    }

    public void notifyObserver() {
        for (OrderObserver o : observers) {
            o.update(this);
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getCount(){
        return items.size();
    }

    public double getShippingPrice() {
        return shippingPrice;
    }

    public void setTotalPrice(double d){
        totalPrice = d;
    }

    public void setShippingPrice(double d){
        shippingPrice = d;
    }

    public String toString(){
        return "The order " + id + " contains " + getCount() + " items, the total is " + getTotalPrice() + " and there is " + getShippingPrice() + " for shipping.";
    }

}
