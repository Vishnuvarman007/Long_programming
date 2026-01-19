public class Restaurant{
    String name;
    public Restaurant(String name){
        this.name=name;
    }
    public void prepareOrder(Order order){
        System.out.println("Preparing order with id:" + order.orderId);
        order.updateStatus("Order Prepared in"+name);
    }

}
