//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.attach(new PriceObserver());
        order.attach(new QuantityObserver());

        order.addItem("tee-shirt", 20);
        order.addItem("shoes", 40);

        System.out.println("We first print the order : ");
        System.out.println(order);

        order.addItem("trousers", 30);
        order.addItem("scarf", 45);
        order.addItem("socks", 15);
        order.addItem("shirt", 10);

        System.out.println("\nWe have more than five items now, the shipping cost should be free :");
        System.out.println(order);

        order.addItem("ring", 400);

        System.out.println("\nWe have a total of more than $200, the total should be 560 - 20 = 540 :");
        System.out.println(order);

        order.addItem("belt", 20);
        System.out.println("\nWe make sure that the discount don't appear twice by adding another item :");
        System.out.println(order);

    }
}