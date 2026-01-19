public class Main {
    public static void main(String[] args) {
        Customer c1=new Customer(1,"vishnu");
        Order o1 = c1.placeOrder(101);
        o1.addItem(new Items("Burger",80));
        o1.addItem(new Items("Fries",50));
        Restaurant r1=new Restaurant("Foodies");
        r1.prepareOrder(o1);
        DeliveryAgent d1=new DeliveryAgent(1,"Ravi");
        d1.deliveryOrder(o1);
        System.out.print("Total bill amount: " + o1.calculateTotal());
        o1.updateStatus("Order status: " + o1.status);
    }
}
