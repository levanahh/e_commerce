public class QuantityObserver implements OrderObserver{

    @Override
    public void update(Order order) {
        if(order.getCount() > 5){
            order.setShippingPrice(0);
        }
    }
}
