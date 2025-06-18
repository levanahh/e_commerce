public class PriceObserver implements OrderObserver {

    private boolean moreThan200 = false;

    @Override
    public void update(Order order){
        if(order.getTotalPrice() > 200 && !moreThan200){
            order.setTotalPrice(order.getTotalPrice() - 20);
            moreThan200 = true;
        }
    }
}
