import java.util.*;
public class Order{
    public int orderId;
    String status="Order Placed";
    List<Items>items = new ArrayList<>();
    public Order(int orderId){
        this.orderId=orderId;
    }
    public void addItem(Items item){
        items.add(item);
    }
    public double calculateTotal(){
        double total=0;
        for(Items i:items){
            total+=i.price;
        }
        return total;

    }
    public void updateStatus(String newStatus){
        this.status=newStatus;
    }
}
