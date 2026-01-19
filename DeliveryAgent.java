public class DeliveryAgent {
    int agentId;
    String name;
    public DeliveryAgent(int agentId, String name){
        this.agentId=agentId;
        this.name=name;
    }
    public void deliveryOrder(Order order){
        System.out.println("Agent " + agentId + " with name: "+ name + " is delivering order with id:" + order.orderId);
        order.updateStatus("Delivered");

    }
}
