public class Customer {
    public int customerId;
    public String name;
    public Customer(int customerId,String name){
        this.customerId=customerId;
        this.name=name;
    }
    public Order placeOrder(int orderId){
        System.out.println("Order placed with id:" + orderId);
        return new Order(orderId);
    }

}
